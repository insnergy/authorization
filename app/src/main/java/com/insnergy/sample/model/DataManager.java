/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import android.content.Context;
import android.content.SharedPreferences;

import com.insnergy.sample.model.Constants.ApiKey;
import com.insnergy.sample.model.Constants.Domain;
import com.insnergy.sample.model.Constants.OAuth2;

import java.util.HashMap;

public class DataManager {
    private static final String TAG = "DataManager";

    /* common data */
    private static final String AP_SYSTEM = "IFA";
    private static final String CLIENT_ID = "aac45c86-d2d1-4606-8f20-daa2707aa53d";
    private static final String CLIENT_SECRET = "ffaa2013-0c2c-4f61-ad10-a9afda250e42";

    private static final String dataName = "HOME_GREEN_DATA";

    private static DataManager serverProxyData = new DataManager();
    private SharedPreferences sharedPreferences;

    private OAuth2Token oAuth2Token;
    private Domain domain;
    private String email = "";
    private String date = "";
    private String password = "";

    public static DataManager getInstance() {
        return serverProxyData;
    }

    public void init(Domain domain, Context context) {
        this.sharedPreferences = context.getSharedPreferences(dataName, 0);
        this.domain = domain;
        loadSharedPreferencesData();
    }

    @SuppressWarnings("unchecked")
    private void loadSharedPreferencesData() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        HashMap<String, String> data = (HashMap<String, String>) sharedPreferences.getAll();
        this.oAuth2Token = new OAuth2Token();
        this.oAuth2Token.setAccess_token(data.get(OAuth2.ACCESS_TOKEN));
        this.oAuth2Token.setRefresh_token(data.get(OAuth2.REFRESH_TOKEN));
        this.oAuth2Token.setToken_type(data.get(OAuth2.TOKEN_TYPE));

        this.date = data.get(ApiKey.DATE);
        this.email = data.get(ApiKey.EMAIL);
        this.password = data.get(ApiKey.PASSWORD);
    }

    public void clearPassword() {
        this.password = "";
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(ApiKey.PASSWORD).apply();
    }

    public void clearToken() {
        oAuth2Token = null;
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(OAuth2.ACCESS_TOKEN)
                .remove(OAuth2.REFRESH_TOKEN)
                .remove(OAuth2.TOKEN_TYPE)
                .apply();
    }

    public void clearAllData() {
        oAuth2Token = null;
        email = "";
        password = "";
        date = "";
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();
    }

    public String getApSystem() {
        return AP_SYSTEM;
    }

    public String getClientId() {
        return CLIENT_ID;
    }

    public String getClientSecret() {
        return CLIENT_SECRET;
    }

    public Domain getDomain() {
        return domain;
    }

    public OAuth2Token getOAuth2Token() {
        loadSharedPreferencesData();
        return oAuth2Token;
    }

    public void setOAuth2Token(OAuth2Token oAuth2Token) {
        this.oAuth2Token = oAuth2Token;
        sharedPreferences.edit()
                .putString(OAuth2.ACCESS_TOKEN, oAuth2Token.getAccess_token())
                .putString(OAuth2.REFRESH_TOKEN, oAuth2Token.getRefresh_token())
                .putString(OAuth2.TOKEN_TYPE, oAuth2Token.getToken_type())
                .apply();
    }

    public String getEmail() {
        loadSharedPreferencesData();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        sharedPreferences.edit()
                .putString(ApiKey.EMAIL, email)
                .apply();
    }

    public String getDate() {
        loadSharedPreferencesData();
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        sharedPreferences.edit()
                .putString(ApiKey.DATE, date)
                .apply();
    }

    public String getPassword() {
        loadSharedPreferencesData();
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        sharedPreferences.edit()
                .putString(ApiKey.PASSWORD, password)
                .apply();
    }

    public String getApiAccessToken() {
        loadSharedPreferencesData();
        return oAuth2Token.getToken_type() + " " + oAuth2Token.getAccess_token();
    }
}
