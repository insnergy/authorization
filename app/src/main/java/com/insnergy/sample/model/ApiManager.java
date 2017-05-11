/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.support.annotation.NonNull;
import android.util.Log;

import com.insnergy.sample.domainobj.ApiResult;
import com.insnergy.sample.domainobj.Err;
import com.insnergy.sample.model.Constants.HttpMethod;
import com.insnergy.sample.model.Constants.Server;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class ApiManager {
    private static final String TAG = "ApiManager";
    private static final boolean ENABLE_CACHE = true;
    private static final int INDEX_SERVER = 0;
    private static final int INDEX_URL = 1;
    private static final int INDEX_REQUEST_TYPE = 2;
    private static final int INDEX_RESERVED_NUM = 3;

    private HashMap<String, String[]> apiParameters = new HashMap<>();
    private DataManager dataManager = DataManager.getInstance();
    private IF3ServerProxy if3ServerProxy = IF3ServerProxy.getInstance();
    private IsasServerProxy isasServerProxy = IsasServerProxy.getInstance();

    private static ApiManager apiManager = new ApiManager();

    private class CacheCallback {
        private boolean isCached = false;
        private ApiCallback apiCallback;

        CacheCallback(boolean isCached, ApiCallback apiCallback) {
            this.isCached = isCached;
            this.apiCallback = apiCallback;
        }

        public boolean isCached() {
            return isCached;
        }
        public ApiCallback getApiCallback() {
            return apiCallback;
        }
    }

    private ApiManager() {
        initApiParameters();
    }

    private void initApiParameters() {
        ApiParameters apiParameter = new ApiParameters();
        for (Field field : apiParameter.getClass().getFields()) {
            field.setAccessible(true);
            try {
                if (field.getType().isArray()) {
                    String[] paras = (String[]) field.get(apiParameter);
                    apiParameters.put(field.getName(), paras.clone());
                }
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static ApiManager getInstance() {
        return apiManager;
    }

    public void callApi(String apiName, final ApiCallback callback, HashMap<String, String> apiParas) {
        String[] apiArray = apiParameters.get(apiName);
        HashMap<String, String> data = new HashMap<String, String>(apiParas);

        ApiCallback apiCallback;
        if (ENABLE_CACHE) {
            CacheCallback cacheCallback = getCacheCallbackForApiCacheManager(apiArray, data, callback);
            if (cacheCallback.isCached()) {
                // result is cached, no need callback
                return;
            } else {
                apiCallback = cacheCallback.getApiCallback();
            }
        } else {
            apiCallback = callback;
        }
        callServerProxy(apiArray, data, apiCallback);
    }

    public void callApiWithoutCache(String apiName, final ApiCallback callback, HashMap<String, String> apiParas) {
        if (ENABLE_CACHE) {
            String[] apiArray = apiParameters.get(apiName);
            HashMap<String, String> data = new HashMap<>(apiParas);
            ApiCallback cacheCallback = getCallbackAndClearCache(apiArray, data, callback);
            callServerProxy(apiArray, data, cacheCallback);
        } else {
            callApi(apiName, callback, apiParas);
        }
    }

    public void clearAllCacheThenCallApi(String apiName, final ApiCallback callback, HashMap<String, String> apiParas) {
        ApiCacheManager.getInstance().clearAllCache();
        callApi(apiName, callback, apiParas);
    }

    private CacheCallback getCacheCallbackForApiCacheManager(final String[] apiArray, final HashMap<String, String> data, final ApiCallback callback) {
        final String serverName = apiArray[INDEX_SERVER];
        final String urlParam = apiArray[INDEX_URL] + data.toString();
        final String requestType = apiArray[INDEX_REQUEST_TYPE];

        CacheCallback cacheCallback;
        boolean isCached = false;
        if (HttpMethod.GET.getCode().equals(requestType)) {
            ApiResult apiCachedResult = ApiCacheManager.getInstance().getCachedApiResult(serverName, urlParam);
            if (apiCachedResult != null) {
                if (callback != null) {
                    callback.onSuccess(apiCachedResult);
                }
                isCached = true;
            }
            cacheCallback = new CacheCallback(isCached, getCacheCallback(callback, serverName, urlParam));
        } else {
            ApiCacheManager.getInstance().clearAllCache();
            cacheCallback = new CacheCallback(isCached, callback);
        }
        return cacheCallback;
    }

    private ApiCallback getCallbackAndClearCache(final String[] apiArray, final HashMap<String, String> data, final ApiCallback callback) {
        final String serverName = apiArray[INDEX_SERVER];
        final String urlParam = apiArray[INDEX_URL] + data.toString();
        final String requestType = apiArray[INDEX_REQUEST_TYPE];

        ApiCallback cacheCallback;
        if (HttpMethod.GET.getCode().equals(requestType)) {
            ApiCacheManager.getInstance().clearCachedApiResult(serverName, urlParam);
            cacheCallback = getCacheCallback(callback, serverName, urlParam);
        } else {
            ApiCacheManager.getInstance().clearAllCache();
            cacheCallback = callback;
        }
        return cacheCallback;
    }

    @NonNull
    private ApiCallback getCacheCallback(final ApiCallback apiCallback, final String serverName, final String urlParam) {
        ApiCallback cacheCallback = new ApiCallback() {
            @Override
            public void onSuccess(ApiResult apiResult) {
                ApiCacheManager.getInstance().cacheApiResult(serverName, urlParam, apiResult);
                if (apiCallback != null) {
                    apiCallback.onSuccess(apiResult);
                }
            }

            @Override
            public void onFailure(ApiResult apiResult) {
                if (apiCallback != null) {
                    apiCallback.onFailure(apiResult);
                }
            }
        };
        return cacheCallback;
    }

    private void callServerProxy(String[] apiArray, HashMap<String, String> data, ApiCallback cacheCallback) {
        switch (apiArray[INDEX_SERVER]) {
            case Server.ISAS:
                isasServerProxy.apiRequest(apiArray[INDEX_URL], HttpMethod.valueOf(apiArray[INDEX_REQUEST_TYPE]), data, cacheCallback);
                break;
            case Server.IF3:
            default:
                if3ServerProxy.apiRequest(apiArray[INDEX_URL], HttpMethod.valueOf(apiArray[INDEX_REQUEST_TYPE]), data, cacheCallback);
                break;
        }
    }

    public void authorize(final ApiCallback callback, final String email, final String password, final boolean isRememberPassword) {
        ApiCacheManager.getInstance().clearAllCache();
        try {
            OAuthCallback oAuthCallback = new OAuthCallback() {
                @Override
                public void onSuccess(OAuth2Token oAuth2Token) {
                    dataManager.setEmail(email);
                    dataManager.setDate(getDateTime(oAuth2Token.getExpires_in()));
                    dataManager.setOAuth2Token(oAuth2Token);

                    if (isRememberPassword) {
                        dataManager.setPassword(password);
                    } else {
                        dataManager.clearPassword();
                    }

                    // Send a success msg to ApiCallback
                    ApiResult apiResult = new ApiResult();
                    apiResult.setErr(new Err(ErrCode.ERR_CODE_OK, ErrCode.MSG_SUCCESSFUL));
                    apiResult.setStatus(ErrCode.ResponseStatus.OK);
                    callback.onResult(gson.toJson(apiResult));
                }

                @Override
                public void onFailure(String result) {
                    if (result == null) {
                        ApiResult apiResult = new ApiResult();
                        apiResult.setErr(new Err(ErrCode.App.RESPONSE_IS_EMPTY.getErrCode(), ""));
                        apiResult.setStatus(ErrCode.App.RESPONSE_IS_EMPTY.getErrCode());
                        callback.onResult(gson.toJson(apiResult, ApiResult.class));
                    } else {
                        callback.onResult(result);
                    }
                }
            };
            if3ServerProxy.oAuthTokenRequest(email, password, oAuthCallback);
        } catch (Exception ex) {
            Log.e(TAG, "Authorize Exception!");
            ex.printStackTrace();
        }
    }

    public void getRefreshToken(final ApiCallback apiCallback) {
        try {
            final OAuthCallback callback = new OAuthCallback() {
                @Override
                public void onSuccess(OAuth2Token oAuth2Token) {
                    String date = getDateTime(oAuth2Token.getExpires_in());
                    dataManager.setDate(date);
                    dataManager.setOAuth2Token(oAuth2Token);

                    // Send a success msg to ApiCallback
                    ApiResult apiResult = new ApiResult();
                    apiResult.setErr(new Err(ErrCode.ERR_CODE_OK, ErrCode.MSG_SUCCESSFUL));
                    apiResult.setStatus(ErrCode.ResponseStatus.OK);
                    if (apiCallback != null) {
                        apiCallback.onResult(gson.toJson(apiResult));
                    }
                }

                @Override
                public void onFailure(String result) {
                    ApiResult apiResult = new ApiResult();
                    apiResult.setErr(new Err(ErrCode.UNAUTHORIZED, ErrCode.MSG_UNAUTHORIZED));
                    apiResult.setStatus(ErrCode.UNAUTHORIZED);
                    if (apiCallback != null) {
                        apiCallback.onResult(gson.toJson(apiResult));
                    }
                }
            };
            if3ServerProxy.refreshTokenRequest(callback);
        } catch (Exception ex) {
            Log.e(TAG, "Get RefreshToken Exception! ");
            ex.printStackTrace();
        }
    }

    public String getAuthorizeUrl() {
        return if3ServerProxy.getAuthorizeUrl();
    }

    public void getAccessTokenByAuthorizationCode(String redirectUri, OAuthCallback oAuthCallback) {
        if3ServerProxy.getAccessTokenByAuthorizationCode(redirectUri, oAuthCallback);
    }

    private String getDateTime(int time) {
        int hours = time / (60 * 60);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(java.util.Calendar.HOUR_OF_DAY, hours - 1);
        return simpleDateFormat.format(calendar.getTime());
    }
}
