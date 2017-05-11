/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class Setting {

    private String notice_enable;
    private String notice_thold;
    private String cutoff_enable;
    private String cutoff_thold;

    public String getNotice_enable() {
        return notice_enable;
    }

    public void setNotice_enable(String notice_enable) {
        this.notice_enable = notice_enable;
    }

    public String getNotice_thold() {
        return notice_thold;
    }

    public void setNotice_thold(String notice_thold) {
        this.notice_thold = notice_thold;
    }

    public String getCutoff_enable() {
        return cutoff_enable;
    }

    public void setCutoff_enable(String cutoff_enable) {
        this.cutoff_enable = cutoff_enable;
    }

    public String getCutoff_thold() {
        return cutoff_thold;
    }

    public void setCutoff_thold(String cutoff_thold) {
        this.cutoff_thold = cutoff_thold;
    }
}
