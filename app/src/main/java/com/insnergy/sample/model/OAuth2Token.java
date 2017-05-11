/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

public class OAuth2Token {
    private String access_token;
    private String refresh_token;
    private int expires_in;
    private Long expires_timestamp;
    private String token_type;
    private String scope;

    public OAuth2Token() {
        this.access_token = "";
        this.refresh_token = "";
        this.expires_in = 0;
        this.token_type = "";
        this.expires_timestamp = 0L;
        this.scope = "";
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public void setAccess_token(String accessToken) {
        this.access_token = accessToken;
    }

    public String getRefresh_token() {
        return this.refresh_token;
    }

    public void setRefresh_token(String refreshToken) {
        this.refresh_token = refreshToken;
    }

    public int getExpires_in() {
        return this.expires_in;
    }

    public void setExpires_in(int tokenExpireIn) {
        this.expires_in = tokenExpireIn;
    }

    public Long getExpires_timestamp() {
        return expires_timestamp;
    }

    public void setExpires_timestamp(Long expireTimestamp) {
        this.expires_timestamp = expireTimestamp;
    }

    public String getToken_type() {
        return this.token_type;
    }

    public void setToken_type(String tokenType) {
        this.token_type = tokenType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "OAuth2Token{" +
                "access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", expire_in=" + expires_in +
                ", expire_timestamp=" + expires_timestamp +
                ", token_type='" + token_type + '\'' +
                '}';
    }
}
