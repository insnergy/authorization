/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class User {
    private String user_id;
    private String update_time;
    private boolean enabled;
    private String locale_code;
    private String pipn_edition;
    private long create_time;
    private String user_name;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLocale_code() {
        return locale_code;
    }

    public void setLocale_code(String locale_code) {
        this.locale_code = locale_code;
    }

    public String getPipn_edition() {
        return pipn_edition;
    }

    public void setPipn_edition(String pipn_edition) {
        this.pipn_edition = pipn_edition;
    }
}
