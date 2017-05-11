/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class Result {

    private String ssid;
    private String state;
    //IRC Scan Ap
    private int count;
    private List<WiFiInfo> aplist;

    private String act;
    private String irId;
    private String irName;
    private String ctlRes;
    private String irParam;
    private String keyCode;

    public Result(String ssid, String state) {
        this.ssid = ssid;
        this.state = state;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<WiFiInfo> getAplist() {
        return aplist;
    }

    public void setAplist(List<WiFiInfo> aplist) {
        this.aplist = aplist;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getIrId() {
        return irId;
    }

    public void setIrId(String irId) {
        this.irId = irId;
    }

    public String getIrName() {
        return irName;
    }

    public void setIrName(String irName) {
        this.irName = irName;
    }

    public String getCtlRes() {
        return ctlRes;
    }

    public void setCtlRes(String ctlRes) {
        this.ctlRes = ctlRes;
    }

    public String getIrParam() {
        return irParam;
    }

    public void setIrParam(String irParam) {
        this.irParam = irParam;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }
}
