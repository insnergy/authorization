/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.google.gson.annotations.SerializedName;

public class DeviceStatistics {
    private String dev_id;
    private DeviceInfo.WidgetAttr attributes = DeviceInfo.WidgetAttr.KWH;
    private Statistics_Type stats_type;
    private String start_time;
    private String end_time;

    public enum Statistics_Type {
        @SerializedName("Q")
        Q,
        @SerializedName("H")
        H,
        @SerializedName("D")
        D,
        @SerializedName("W")
        W,
        @SerializedName("M")
        M,
        @SerializedName("Y")
        Y;

        public static Statistics_Type getEnum(String type) {
            switch (type) {
                case "Hour":
                    return H;
                case "Day":
                    return D;
                case "Week":
                    return W;
                case "Month":
                    return M;
                default:
                    return H;
            }
        }
    }

    public DeviceStatistics() { }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public DeviceInfo.WidgetAttr getAttributes() {
        return attributes;
    }

    public void setAttributes(DeviceInfo.WidgetAttr attributes) {
        this.attributes = attributes;
    }

    public Statistics_Type getStats_type() {
        return stats_type;
    }

    public void setStats_type(Statistics_Type stats_type) {
        this.stats_type = stats_type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
