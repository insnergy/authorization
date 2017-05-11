/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class IRSyncResult {
    private Err err;
    private String status;
    private String result;

    public IRSyncResult() {}

    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
