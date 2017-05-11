/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.insnergy.sample.domainobj.ScheduleInfo.WEEK;

import java.util.List;

public class IRScheduleActionTime {
	private String hour;
	private String minute;
	private String year;
	private String month;
	private String day;
	private List<WEEK> weeks;

	public IRScheduleActionTime(){	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<WEEK> getWeeks() {
		return weeks;
	}

	public void setWeeks(List<WEEK> weeks) {
		this.weeks = weeks;
	}
}
