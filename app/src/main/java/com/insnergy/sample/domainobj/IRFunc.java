/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class IRFunc {
    private String func;
    private String name;
    private Long state;
    private Long latency;
    private Long irid;

    public IRFunc() {
        this.func = "";
        this.state = 0l;
        this.latency = 0l;
        this.irid = 0l;
    }

    public IRFunc(String func) {
        this.func = func;
        this.state = 0l;
        this.latency = 0l;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getLatency() {
        return latency;
    }

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    public Long getIrid() {
        return irid;
    }

    public void setIrid(Long irid) {
        this.irid = irid;
    }

    @Override
    public String toString() {
        return "IRFunc{" +
                "func='" + func + '\'' +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", latency=" + latency +
                ", irid=" + irid +
                '}';
    }
}
