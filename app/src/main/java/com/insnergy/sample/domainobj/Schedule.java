/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class Schedule {

    private String trigger_name;
    private String job_detail_name;
    private String dev_id;
    private String action;
    private String sched_freq;
    private String sched_date;
    private String sched_time;
    private String sched_desc;
    private String sched_week;
    private String timezone;
    private String next_fire_time;
    private String last_updated;
    private String enable;

    public Schedule() {
    }

    public Schedule(String trigger_name, String job_detail_name, String dev_id, String action, String sched_freq, String sched_date, String sched_time, String sched_desc, String timezone, String last_updated, String enable) {
        this.trigger_name = trigger_name;
        this.job_detail_name = job_detail_name;
        this.dev_id = dev_id;
        this.action = action;
        this.sched_freq = sched_freq;
        this.sched_date = sched_date;
        this.sched_time = sched_time;
        this.sched_desc = sched_desc;
        this.timezone = timezone;
        this.last_updated = last_updated;
        this.enable = enable;
    }

    public String getTrigger_name() {
        return trigger_name;
    }

    public void setTrigger_name(String trigger_name) {
        this.trigger_name = trigger_name;
    }

    public String getJob_detail_name() {
        return job_detail_name;
    }

    public void setJob_detail_name(String job_detail_name) {
        this.job_detail_name = job_detail_name;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSched_freq() {
        return sched_freq;
    }

    public void setSched_fre(String sched_fre) {
        this.sched_freq = sched_fre;
    }

    public String getSched_date() {
        return sched_date;
    }

    public void setSched_date(String sched_date) {
        this.sched_date = sched_date;
    }

    public String getSched_time() {
        return sched_time;
    }

    public void setSched_time(String sched_time) {
        this.sched_time = sched_time;
    }

    public String getSched_desc() {
        return sched_desc;
    }

    public void setSched_desc(String sched_desc) {
        this.sched_desc = sched_desc;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getSched_week() {
        return sched_week;
    }

    public void setSched_week(String sched_week) {
        this.sched_week = sched_week;
    }


    public String getNext_fire_time() {
        return next_fire_time;
    }

    public void setNext_fire_time(String next_fire_time) {
        this.next_fire_time = next_fire_time;
    }
}
