/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class WidgetInfo {
    private String info_id;
    private DeviceInfo.WidgetAttr info_name;
    private String info_value;
    private String info_desc;
    private String report_time;

    public WidgetInfo() {
        this.info_id = "";
        this.info_name = DeviceInfo.WidgetAttr.DEFAULT;
        this.info_value = "";
        this.info_desc = "";
        this.report_time = "";
    }

    public WidgetInfo(DeviceInfo.WidgetAttr info_name, String info_value) {
        this.info_name = info_name;
        this.info_value = info_value;
    }
    public WidgetInfo(DeviceInfo.WidgetAttr info_name, String info_value, String info_desc, String report_time) {
        this.info_name = info_name;
        this.info_value = info_value.equals("0.0") ? "0.00" :info_value;
        this.info_desc = info_desc;
        this.report_time = report_time;
    }

    public WidgetInfo(String info_id, DeviceInfo.WidgetAttr info_name, String info_value, String info_desc, String report_time) {
        this.info_id = info_id;
        this.info_name = info_name;
        this.info_value = info_value;
        this.info_desc = info_desc;
        this.report_time = report_time;
    }

    public String getInfo_id() {
        return info_id;
    }

    public void setInfo_id(String info_id) {
        this.info_id = info_id;
    }

    public DeviceInfo.WidgetAttr getInfo_name() {
        if (info_name == null) {
            return DeviceInfo.WidgetAttr.DEFAULT;
        }
        return info_name;
    }

    public void setInfo_name(DeviceInfo.WidgetAttr info_name) {
        this.info_name = info_name;
    }

    public String getInfo_value() {
        return info_value;
    }

    public void setInfo_value(String info_value) {
        this.info_value = info_value;
    }

    public String getInfo_desc() {
        return info_desc;
    }

    public void setInfo_desc(String info_desc) {
        this.info_desc = info_desc;
    }

    public String getReport_time() {
        return report_time;
    }

    public void setReport_time(String report_time) {
        this.report_time = report_time;
    }

    @Override
    public String toString() {
        return "WidgetInfo{" +
                "info_id='" + info_id + '\'' +
                ", info_name=" + info_name +
                ", info_value='" + info_value + '\'' +
                ", info_desc='" + info_desc + '\'' +
                ", report_time='" + report_time + '\'' +
                '}';
    }
}
