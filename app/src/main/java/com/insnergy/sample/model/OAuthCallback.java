/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import com.google.gson.Gson;

public abstract class OAuthCallback implements ApiResponse {
    private static final String TAG = "OAuthCallback";
    public static Gson gson = new Gson();

    private boolean isResultFormatHasErr(String result) {
        String logTag = "isResultFormatHasErr";
        if (result!=null && result.startsWith(ErrCode.APP_ERR_CODE_PREFIX)) {
            // APP_ERR_CODE_PREFIX is a prefix code number of app error.
            return true;
        } else if (result == null) {
            // Api Response is empty.
            return true;
        } else {
            OAuth2Token oAuth2Token = gson.fromJson(result, OAuth2Token.class);
            if (oAuth2Token == null || oAuth2Token.getAccess_token() == null || oAuth2Token.getAccess_token().isEmpty() ||
                    oAuth2Token.getRefresh_token() == null || oAuth2Token.getRefresh_token().isEmpty()) {
                // Format of Api Response has errors.
                return true;
            }
        }
        return false;
    }

    public void onResult(String result) {
        if (isResultFormatHasErr(result)) {
            onFailure(result);
            return;
        }

        OAuth2Token oAuth2Token = gson.fromJson(result, OAuth2Token.class);
        onSuccess(oAuth2Token);
    }

    abstract public void onSuccess(OAuth2Token oAuth2Token);
    abstract public void onFailure(String result);
}
