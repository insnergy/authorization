/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class IRSequenceControl {
    private Integer seq;
    private String func;
    private Long latency;

    public IRSequenceControl() {
    }

    public IRSequenceControl(String func, Long latency) {
        this.func = func;
        this.latency = latency;
    }

    public IRSequenceControl(Integer seq, String func, Long latency) {
        this.seq = seq;
        this.func = func;
        this.latency = latency;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public Long getLatency() {
        return latency;
    }

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    @Override
    public String toString() {
        return "IRSequenceControl{" +
                "seq=" + seq +
                ", func='" + func + '\'' +
                ", latency=" + latency +
                '}';
    }
}
