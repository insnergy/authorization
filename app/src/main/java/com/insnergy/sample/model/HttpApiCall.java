/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.os.AsyncTask;
import android.util.Base64;

import com.insnergy.sample.model.Constants.HttpMethod;
import com.insnergy.sample.model.Constants.ContentType;

import java.util.HashMap;

class HttpApiCall extends AsyncTask<String, Void, String> {
    private HashMap<String, String> mData = null;
    private HttpMethod mHttpMethod;
    private String mStrToBeAppended = "";
    private ApiResponse mResponse;
    private String mAuthToken;
    private String mContentType = ContentType.FORM_URLENCODE;

    public HttpApiCall(HttpMethod httpMethod, String accessToken, HashMap<String, String> data, ApiResponse response) {
        mHttpMethod = httpMethod;
        mAuthToken = accessToken;
        mResponse = response;
        mData = data;
    }

    public HttpApiCall(HttpMethod httpMethod, String clientId, String clientSecret, HashMap<String, String> data, ApiResponse response) {
        mHttpMethod = httpMethod;
        mAuthToken = getBasicAuth(clientId, clientSecret);
        mResponse = response;
        mData = data;
    }

    @Override
    protected void onPreExecute() {
        if (mData != null) {
            switch (mContentType) {
                case ContentType.JSON:
                    //TODO: not support yet
                    break;
                case ContentType.FORM_URLENCODE:
                default:
                    for (String key : mData.keySet()) {
                        mStrToBeAppended += (mStrToBeAppended.contains("?") ? "&" : "?") + key + "=" + mData.get(key);
                    }
                    break;
            }
        }
    }

    @Override
    protected String doInBackground(String... baseUrls) {
        String finalURL = baseUrls[0] + mStrToBeAppended;
        HttpConnection httpConnection = new HttpConnection(mContentType);
        return httpConnection.httpCall(mHttpMethod, finalURL, mAuthToken);
    }

    @Override
    protected void onPostExecute(String result) {
        if (mResponse != null) {
            mResponse.onResult(result);
        }
    }

    private String getBasicAuth(String apiKey, String apiSecret) {
        if (apiKey == null || apiSecret == null) {
            return "";
        } else {
            String authStr = apiKey + ":" + apiSecret;
            return "Basic " + Base64.encodeToString(authStr.getBytes(), Base64.NO_WRAP);
        }
    }
}
