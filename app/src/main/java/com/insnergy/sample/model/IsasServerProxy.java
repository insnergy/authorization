/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.os.AsyncTask;

import com.insnergy.sample.model.Constants.ApiKey;
import com.insnergy.sample.model.Constants.HttpMethod;

import java.util.HashMap;

class IsasServerProxy {
    private static final String TAG = "IsasServerProxy";
    private static final String ISAS_DOMAIN = "https://dp-isas.insnergy.com/api";
    private static final String ISAS_DOMAIN_DEV = ISAS_DOMAIN;

    private static IsasServerProxy isasserverProxy = new IsasServerProxy();
    private DataManager dataManager = DataManager.getInstance();

    public static IsasServerProxy getInstance() {
        return isasserverProxy;
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

        HttpApiCall authApiCall = new HttpApiCall(httpMethod, dataManager.getApiAccessToken(), data, callback);
        authApiCall.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getDomain() + url);
    }

    private String getDomain() {
        switch (dataManager.getDomain()) {
            case DEV:
                return ISAS_DOMAIN_DEV;
            default:
            case MAIN:
                return ISAS_DOMAIN;
        }
    }
}
