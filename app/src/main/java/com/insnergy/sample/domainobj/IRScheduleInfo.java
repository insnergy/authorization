/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.FREQ;

import java.util.List;

public class IRScheduleInfo {

	public static final String PROPERTY = "irScheduleInfo";
	private Long sched_id;
	private String sched_name;
	private Device device_info;
	private String dev_id;
	private FREQ sched_freq;
	private IRScheduleActionTime action_time;
	private String action;
	private String enable_status;
	private String sub_id;
	private Long next_fire_time;
	private List<IRSequenceControl> actions;
	private String scheduleTime;

	public Long getSched_id() {
		return sched_id;
	}

	public void setSched_id(Long sched_id) {
		this.sched_id = sched_id;
	}

	public String getSched_name() {
		return sched_name;
	}

	public void setSched_name(String sched_name) {
		this.sched_name = sched_name;
	}

	public Device getDevice_info() {
		return device_info;
	}

	public void setDevice_info(Device device_info) {
		this.device_info = device_info;
	}

	public String getDev_id() {
		return dev_id;
	}

	public void setDev_id(String dev_id) {
		this.dev_id = dev_id;
	}

	public FREQ getSched_freq() {
		return sched_freq;
	}

	public void setSched_freq(FREQ sched_freq) {
		this.sched_freq = sched_freq;
	}

	public IRScheduleActionTime getAction_time() {
		return action_time;
	}

	public void setAction_time(IRScheduleActionTime action_time) {
		this.action_time = action_time;
	}

	public String getEnable_status() {
		return enable_status;
	}

	public void setEnable_status(String enable_status) {
		this.enable_status = enable_status;
	}

	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}

	public Long getNext_fire_time() {
		return next_fire_time;
	}

	public void setNext_fire_time(Long next_fire_time) {
		this.next_fire_time = next_fire_time;
	}

	public List<IRSequenceControl> getActions() {
		return actions;
	}

	public void setActions(List<IRSequenceControl> actions) {
		this.actions = actions;
	}

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
