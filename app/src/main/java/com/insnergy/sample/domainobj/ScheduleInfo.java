/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class ScheduleInfo {
    public enum ACTION {
        ON("on"),
        OFF("off");

        private String code;

        ACTION(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static ACTION getEnum(String action) {
            if (ON.getCode().equals(action))
                return ON;
            return OFF;
        }
    }
    public enum FREQ {
        weekly("weekly"),
        daily("daily"),
        once("once");

        private String code;

        FREQ(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
    public enum WEEK {
        SUN("SUN"),
        MON("MON"),
        TUE("TUE"),
        WED("WED"),
        THU("THU"),
        FRI("FRI"),
        SAT("SAT");

        private String code;

        WEEK(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static WEEK getEnum(String weekStr) {
            for (WEEK week : WEEK.values()) {
                if (week.getCode().equalsIgnoreCase(weekStr)) {
                    return week;
                }
            }
            return SUN;
        }
    }
}
