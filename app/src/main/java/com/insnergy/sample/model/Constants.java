/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

public class Constants {

    public enum Domain {
        DEV("com.insnergy.sample.DEV"),
        MAIN("com.insnergy.sample");

        private String packageName;

        Domain(String packageName) {
            this.packageName = packageName;
        }

        public String getPackageName() {
            return packageName;
        }

        public static Domain getDomain(String packageName) {
            for (Domain domain : Domain.values()) {
                if (domain.getPackageName().equalsIgnoreCase(packageName)) {
                    return domain;
                }
            }
            return MAIN;
        }
    }

    public enum HttpMethod {
        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE");

        private String code;

        HttpMethod(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public static class ApiKey {
        public static final String AP_SYSTEM = "apsystem";
        public static final String DATE = "date";
        public static final String EMAIL = "email";
        public static final String LOCAL_LANGUAGE = "localLanguage";
        public static final String PASSWORD = "password";
        public static final String USERNAME = "username";
    }

    public static class OAuth2 {
        public static final String ACCESS_TOKEN = "access_token";
        public static final String EXPIRES_IN = "expires_in";
        public static final String EXPIRE_TIMESTAMP = "expire_timestamp";
        public static final String GRANT_TYPE = "grant_type";
        public static final String PASSWORD = "password";
        public static final String REFRESH_TOKEN = "refresh_token";
        public static final String TOKEN_TYPE = "token_type";
    }

    public static class Server {
        public static final String IF3 = "IF3";
        public static final String ISAS = "ISAS";
    }

    public static class ContentType {
        public static final String FORM_URLENCODE = "application/x-www-form-urlencoded";
        public static final String JSON = "application/json";
    }
}
