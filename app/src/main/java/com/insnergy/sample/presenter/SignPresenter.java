/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.presenter;

import com.insnergy.sample.domainobj.ApiResult;
import com.insnergy.sample.model.ApiCallback;
import com.insnergy.sample.model.ApiManager;
import com.insnergy.sample.model.DataManager;
import com.insnergy.sample.model.OAuth2Token;
import com.insnergy.sample.model.OAuthCallback;

import java.util.HashMap;

public class SignPresenter {

    private static SignPresenter mInstance = new SignPresenter();

    private ApiManager mApiManager = ApiManager.getInstance();

    public static SignPresenter getInstance() {
        return mInstance;
    }

    private SignPresenter() { }

    public String getAuthorizeUrl() {
        return mApiManager.getAuthorizeUrl();
    }

    public void getAccessToken(String redirectUri, final ApiCallback apiCallback) {
        OAuthCallback oAuthCallback = new OAuthCallback() {
            @Override
            public void onSuccess(OAuth2Token oAuth2Token) {
                DataManager.getInstance().setOAuth2Token(oAuth2Token);
                getUserInfo();
                if (apiCallback != null) {
                    ApiResult apiResult = new ApiResult();
                    apiResult.setStatus("ok");
                    apiCallback.onSuccess(apiResult);
                }
            }

            @Override
            public void onFailure(String result) {
                if (apiCallback != null) {
                    ApiResult apiResult = new ApiResult();
                    apiResult.setStatus("fail");
                    apiCallback.onFailure(apiResult);
                }
            }
        };
        mApiManager.getAccessTokenByAuthorizationCode(redirectUri, oAuthCallback);
    }

    private void getUserInfo() {
        HashMap<String, String> apiParams = new HashMap<>();
        ApiCallback apiCallback = new ApiCallback() {
            @Override
            public void onSuccess(ApiResult apiResult) {
                DataManager.getInstance().setEmail(apiResult.getUser().getUser_id());
            }

            @Override
            public void onFailure(ApiResult apiResult) {
                DataManager.getInstance().setEmail("");
            }
        };
        mApiManager.callApi("getUserInfo", apiCallback, apiParams);
    }
}
