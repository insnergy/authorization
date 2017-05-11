/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.ACTION;
import com.insnergy.sample.domainobj.ScheduleInfo.FREQ;
import com.insnergy.sample.domainobj.ScheduleInfo.WEEK;

import java.util.HashSet;
import java.util.Set;

public class ScheduleFreqWeekly extends ScheduleFreq {
	private Set<WEEK> weeks;

	public ScheduleFreqWeekly(String deviceId, ACTION action,
							  Set<WEEK> weeks, int hour, int minute) {
		super(deviceId, action);
		this.weeks = weeks;
		this.hour = hour;
		this.minute = minute;
		this.sched_freq = FREQ.weekly.getCode();
	}

	public ScheduleFreqWeekly(Schedule schedule) {
		super(schedule);
		this.sched_freq = FREQ.weekly.getCode();
		weeks = new HashSet<>();
		try {
			String[] times = schedule.getSched_week().split(",");
			for (String week : times) {
				weeks.add(WEEK.getEnum(week));
			}
		} catch (Exception ex) {
			weeks.add(WEEK.SUN);
		}
	}

	public Set<WEEK> getWeeks() {
		return weeks;
	}

	public void setWeeks(Set<WEEK> weeks) {
		this.weeks = weeks;
	}
}
