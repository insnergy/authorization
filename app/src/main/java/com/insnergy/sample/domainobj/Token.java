/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class Token {

    private String mobile_token;
    private String responseStatus;

    public Token(){}

    public Token(String responseStatus, String mobile_token){
        this.responseStatus = responseStatus;
        this.mobile_token = mobile_token;
    }

    public String getMobile_token() {
        return mobile_token;
    }

    public void setMobile_token(String mobile_token) {
        this.mobile_token = mobile_token;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "Token{" +
                "mobile_token='" + mobile_token + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                '}';
    }
}
