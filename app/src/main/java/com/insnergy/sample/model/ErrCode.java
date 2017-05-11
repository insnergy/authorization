/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

public class ErrCode {
    public static final String ERR_CODE_OK = "0";
    public static final String APP_ERR_CODE_PREFIX = "80";
    public static final String IR_CODE_OUT_OF_BOUNDARY = "7512";
    public static final String UNAUTHORIZED = "401";
    public static final String MSG_SUCCESSFUL = "Operation Successfully Completed";
    public static final String MSG_UNAUTHORIZED = "Invalid access token!!";

    public enum App {
        SUCCESS("0"),
        UNKNOWN("80000"),
        SERVER_OFFLINE("80001"),
        RESPONSE_IS_EMPTY("80002"),
        RESPONSE_FORMAT_ERROR("80003"),
        KOOKONG_SDK_ERROR("80050"),
        KOOKONG_IR_CODE_LENGTH_ERROR("80051");

        private String code;

        App (String code) {
            this.code = code;
        }

        public String getErrCode() {
            return code;
        }
    }

    public static class ResponseStatus {
        public static final String OK = "ok";
        public static final String FAIL = "fail";
    }
}
