/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class Profile {

    private String name;
    private String ssid;
    private String devid;
    private String gwid;
    private String gwpass;
    private String mac;
    private String csip;
    private String csport;

    public Profile(String name, String ssid, String devid, String gwid, String gwpass, String max) {
        this.name = name;
        this.ssid = ssid;
        this.devid = devid;
        this.gwid = gwid;
        this.gwpass = gwpass;
        this.mac = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid;
    }

    public String getGwid() {
        return gwid;
    }

    public void setGwid(String gwid) {
        this.gwid = gwid;
    }

    public String getGwpass() {
        return gwpass;
    }

    public void setGwpass(String gwpass) {
        this.gwpass = gwpass;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getCsip() {
        return csip;
    }

    public void setCsip(String csip) {
        this.csip = csip;
    }

    public String getCsport() {
        return csport;
    }

    public void setCsport(String csport) {
        this.csport = csport;
    }
}
