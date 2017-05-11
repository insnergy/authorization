/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.ACTION;
import com.insnergy.sample.domainobj.ScheduleInfo.FREQ;

public class ScheduleFreqOnce extends ScheduleFreq {
	private Integer year;
	private Integer month;
	private Integer day;

	public ScheduleFreqOnce(String deviceId, ACTION action,
							int year, int month, int day, int hour, int minute) {
		super(deviceId, action);
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.sched_freq = FREQ.once.getCode();
	}

	public ScheduleFreqOnce(Schedule schedule) {
		super(schedule);
		this.sched_freq = FREQ.once.getCode();
		try {
			String[] times = schedule.getSched_date().split("-");
			this.year = Integer.valueOf(times[0]);
			this.month = Integer.valueOf(times[1]);
			this.day = Integer.valueOf(times[2]);
		} catch (Exception ex) {
			this.year = 1970;
			this.month = 1;
			this.day = 1;
		}
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}
}
