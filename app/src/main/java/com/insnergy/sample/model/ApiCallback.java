/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.util.Log;

import com.google.gson.Gson;
import com.insnergy.sample.domainobj.ApiResult;
import com.insnergy.sample.domainobj.Err;

public abstract class ApiCallback implements ApiResponse {
    private static final String TAG = "ApiCallback";
    public static Gson gson = new Gson();

    private boolean checkResultFormat(String result) {
        ApiResult apiResult;
        if (result!=null && result.startsWith(ErrCode.APP_ERR_CODE_PREFIX)) {
            // APP_ERR_CODE_PREFIX is a prefix code number of app error.
            preOnFail(result, ErrCode.App.SERVER_OFFLINE);
            return true;
        } else if (result == null || result.isEmpty()) {
            // Api Response is empty.
            preOnFail(result, ErrCode.App.RESPONSE_IS_EMPTY);
            return true;
        } else {
            apiResult = gson.fromJson(result, ApiResult.class);
            if (apiResult == null || apiResult.getStatus() == null || apiResult.getErr() == null) {
                // Format of Api Response has errors.
                 preOnFail(result, ErrCode.App.RESPONSE_FORMAT_ERROR);
                return true;
            }
        }
        return false;
    }

    private void preOnFail(String result, ErrCode.App errCode) {
        ApiResult apiResult = new ApiResult();
        apiResult.setErr(new Err(errCode.getErrCode(), result));
        apiResult.setStatus(result);
        onFailure(apiResult);
    }

    public void onResult(String result) {
        Log.i(TAG, result);

        if (checkResultFormat(result)) {
            return;
        }

        ApiResult apiResult = gson.fromJson(result, ApiResult.class);
        if (ErrCode.ResponseStatus.OK.equals(apiResult.getStatus()) &&
                ErrCode.App.SUCCESS.getErrCode().equals(apiResult.getErr().getCode())) {
            onSuccess(apiResult);
        } else {
            onFailure(apiResult);
        }
    }

    abstract public void onSuccess(ApiResult apiResult);
    abstract public void onFailure(ApiResult apiResult);
}
