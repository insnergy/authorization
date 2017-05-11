/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import com.insnergy.sample.model.Constants.ApiKey;
import com.insnergy.sample.model.Constants.HttpMethod;

import java.util.HashMap;

class IF3ServerProxy {
    private static final String TAG = "IF3ServerProxy";

    private static final String CLIENT_ID = "aac45c86-d2d1-4606-8f20-daa2707aa53d";
    private static final String CLIENT_SECRET = "ffaa2013-0c2c-4f61-ad10-a9afda250e42";

    private static final String IF3_AUTH_DOMAIN = "https://dp-auth.insnergy.com/if";
    private static final String IF3_AUTH_DOMAIN_DEV = IF3_AUTH_DOMAIN;
    private static final String GRANT_TYPE = "authorization_code";
    private static final String URL_AUTHORIZE = "/oauth/authorize";
    private static final String URI_OAUTH_TOKEN = "/oauth/token";
    private static final String REDIRECT_URI = "/redirect_uri";

    private static final String IF3_DOMAIN = "https://dp-if3.insnergy.com/if";
    private static final String IF3_DOMAIN_DEV = IF3_DOMAIN;
    private static final String URL_COMMON = "/3/common/";
    private static final String URL_DEVICE = "/3/device/";
    private static final String URL_USER = "/3/user/";

    private static IF3ServerProxy instance = new IF3ServerProxy();
    private DataManager dataManager = DataManager.getInstance();

    public static IF3ServerProxy getInstance() {
        return instance;
    }

    public void apiRequest(String url,
                           HttpMethod httpMethod,
                           HashMap<String, String> data,
                           ApiResponse callback) {
        if (url == null) {
            return;
        }
        if (data != null) {
            data.put(ApiKey.AP_SYSTEM, dataManager.getApSystem());
        }

        if (url.startsWith(URL_COMMON)) {
            HttpApiCall httpApiCall = new HttpApiCall(
                    httpMethod, dataManager.getClientId(), dataManager.getClientSecret(), data, callback);
            httpApiCall.execute(getDomain() + url);
        } else {
            HttpApiCall authApiCall = new HttpApiCall(httpMethod, dataManager.getApiAccessToken(), data, callback);
            authApiCall.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getDomain() + url);
        }
    }

    public void oAuthTokenRequest(final String email, final String password, final OAuthCallback callback) {
        HashMap<String, String> data = new HashMap<>();
        data.put(Constants.OAuth2.GRANT_TYPE, Constants.OAuth2.PASSWORD);
        data.put(Constants.ApiKey.USERNAME, email);
        data.put(Constants.ApiKey.PASSWORD, password);
        HttpApiCall httpApiCall = new HttpApiCall(HttpMethod.POST, dataManager.getClientId(), dataManager.getClientSecret(), data, callback);
        httpApiCall.execute(getDomain() + URI_OAUTH_TOKEN);
    }

    public String getAuthorizeUrl() {
        StringBuilder authUrlBuilder = new StringBuilder(getAuthDomain());
        authUrlBuilder.append(URL_AUTHORIZE)
                .append("?redirect_uri=").append(getAuthDomain()).append(REDIRECT_URI)
                .append("&response_type=code&client_id=").append(CLIENT_ID);
        return authUrlBuilder.toString();
    }

    public void getAccessTokenByAuthorizationCode(String redirectUri, final OAuthCallback callback) {
        Uri uri = Uri.parse(redirectUri);
        String authCode = uri.getQueryParameter("code");

        HashMap<String, String> data = new HashMap<>();
        data.put("code", authCode);
        data.put("client_id", CLIENT_ID);
        data.put("client_secret", CLIENT_SECRET);
        data.put("redirect_uri", getAuthDomain() + REDIRECT_URI);
        data.put("grant_type", GRANT_TYPE);
        HttpApiCall httpApiCall = new HttpApiCall(HttpMethod.POST, null, data, callback);
        httpApiCall.execute(getAuthDomain() + URI_OAUTH_TOKEN);
    }

    public void refreshTokenRequest(final OAuthCallback callback) {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put(Constants.OAuth2.REFRESH_TOKEN, dataManager.getOAuth2Token().getRefresh_token());
        data.put(Constants.OAuth2.GRANT_TYPE, Constants.OAuth2.REFRESH_TOKEN);
        HttpApiCall httpApiCall = new HttpApiCall(HttpMethod.POST, dataManager.getClientId(), dataManager.getClientSecret(), data, callback);
        httpApiCall.execute(getDomain() + URI_OAUTH_TOKEN);
    }

    private String getDomain() {
        switch (dataManager.getDomain()) {
            case DEV:
                return IF3_DOMAIN_DEV;
            default:
            case MAIN:
                return IF3_DOMAIN;
        }
    }

    public String getAuthDomain() {
        switch (dataManager.getDomain()) {
            case DEV:
                return IF3_AUTH_DOMAIN_DEV;
            default:
            case MAIN:
                return IF3_AUTH_DOMAIN;
        }
    }
}
