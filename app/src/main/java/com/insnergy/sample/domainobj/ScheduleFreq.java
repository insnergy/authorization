/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.ACTION;

public class ScheduleFreq {
	protected Integer hour;
	protected Integer minute;

	protected String sched_freq;

	protected String dev_id;
	protected ACTION action = ACTION.ON;
	protected boolean enable = true;

	protected String trigger_name;
	protected String job_detail_name;
	protected String sched_desc;
	protected String timezone;
	protected String next_fire_time;

	public ScheduleFreq(String deviceId, ACTION action) {
		this.dev_id = deviceId;
		this.action = action;
	}

	public ScheduleFreq(Schedule schedule) {
		this.dev_id = schedule.getDev_id();
		this.action = ACTION.getEnum(schedule.getAction());
		this.enable = "yes".equals(schedule.getEnable());

		this.trigger_name = schedule.getTrigger_name();
		this.job_detail_name = schedule.getJob_detail_name();
		this.sched_desc = schedule.getSched_desc();
		this.timezone = schedule.getTimezone();
		this.next_fire_time = schedule.getNext_fire_time();

		try {
			String[] times = schedule.getSched_time().split(":");
			this.hour = Integer.valueOf(times[0]);
			this.minute = Integer.valueOf(times[1]);
		} catch (Exception ex) {
			this.hour = 0;
			this.minute = 0;
		}
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public String getNext_fire_time() {
		return next_fire_time;
	}

	public void setNext_fire_time(String next_fire_time) {
		this.next_fire_time = next_fire_time;
	}

	public String getSched_freq() {
		return sched_freq;
	}

	public void setSched_freq(String sched_freq) {
		this.sched_freq = sched_freq;
	}

	public String getDev_id() {
		return dev_id;
	}

	public void setDev_id(String dev_id) {
		this.dev_id = dev_id;
	}

	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public ACTION getAction() {
		return action;
	}

	public void setAction(ACTION action) {
		this.action = action;
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
}
