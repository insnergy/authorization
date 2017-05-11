/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class WiFiInfo {
    private String ssid;
    private String bssid;
    private String channel;
    private String securityMode;
    private String encryptType;
    private int signal;
    private String wmode;
    private String wps;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
    }

    public String getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public String getWmode() {
        return wmode;
    }

    public void setWmode(String wmode) {
        this.wmode = wmode;
    }

    public String getWps() {
        return wps;
    }

    public void setWps(String wps) {
        this.wps = wps;
    }

    @Override
    public String toString() {
        return "WiFiInfo{" +
                "ssid='" + ssid + '\'' +
                ", bssid='" + bssid + '\'' +
                ", channel='" + channel + '\'' +
                ", securityMode='" + securityMode + '\'' +
                ", encryptType='" + encryptType + '\'' +
                ", signal='" + signal + '\'' +
                ", wmode='" + wmode + '\'' +
                ", wps='" + wps + '\'' +
                '}';
    }
}
