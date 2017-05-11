/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class WiFiDeviceApiResult {

    private String status;
    private Profile profile;
    private Result result;
    private String constatus;
    private Err err;

    public String getConstatus() {
        return constatus;
    }

    public void setConstatus(String constatus) {
        this.constatus = constatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }

    @Override
    public String toString() {
        return "WiFiDeviceApiResult{" +
                "status='" + status + '\'' +
                ", profile=" + profile +
                ", result=" + result +
                ", constatus='" + constatus + '\'' +
                '}';
    }
}
