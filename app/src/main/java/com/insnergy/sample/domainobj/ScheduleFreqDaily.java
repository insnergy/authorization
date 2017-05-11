/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.ACTION;
import com.insnergy.sample.domainobj.ScheduleInfo.FREQ;

public class ScheduleFreqDaily extends ScheduleFreq {

	public ScheduleFreqDaily(String deviceId, ACTION action,
							 int hour, int minute) {
		super(deviceId, action);
		this.hour = hour;
		this.minute = minute;
		this.sched_freq = FREQ.daily.getCode();
	}

	public ScheduleFreqDaily(Schedule schedule) {
		super(schedule);
		this.sched_freq = FREQ.daily.getCode();
	}
}
