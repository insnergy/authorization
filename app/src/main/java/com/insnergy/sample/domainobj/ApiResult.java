/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class ApiResult {
    private Err err;
    private String status;
    private String attr;
    private User user;
    private Schedule schedule;
    private List<Device> devices;
    private String widgets_count;
    private List<Widget> widgets;
    private List<Schedule> schedules;
    private List<Data> data;
    private Setting setting;
    private String dev_id;
    private String result;
    private DeviceInfo.Ext_Type dev_ext_type;
    private String alias;
    private String user_id;
    private Boolean widget_mode;
    private String relay_status;
    // for IR
    private int panel_id;
    private String name;
    private String category;
    private String brand;
    private String model_name;
    private String picture_file;
    private List<IRFunc> func_list;
    private List<IRPanel> panel_list;
    private List<IRScheduleInfo> schedule_info_list;
    private IRScheduleInfo schedule_info;
    private List<IrExtendAttr> attr_list;
    private int irtype;
    private IRDevSyncState dev_sync_state;
    // for ISAS
    private List<DeviceHistory> dev_history_list;
    //HomeAuto
    private List<Plan> plan_list;
    private Plan plan;
    private Token token;
    private String value;
    //阿拉斯加
    private DeviceInfo.WidgetAttr attrid;
    //IPCAM
    private List<IpCamAttribute> attributes;

    private List<IRPanelInfoList> dev_panels_info_list;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Err getErr() {
        return err;
    }

    public void setErr(Err err) {
        this.err = err;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public String getWidgets_count() {
        return widgets_count;
    }

    public void setWidgets_count(String widgets_count) {
        this.widgets_count = widgets_count;
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<Widget> widgets) {
        this.widgets = widgets;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DeviceInfo.Ext_Type getDev_ext_type() {
        return dev_ext_type;
    }

    public void setDev_ext_type(DeviceInfo.Ext_Type dev_ext_type) {
        this.dev_ext_type = dev_ext_type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Boolean getWidget_mode() {
        return widget_mode;
    }

    public void setWidget_mode(Boolean widget_mode) {
        this.widget_mode = widget_mode;
    }

    // for IR
    public int getPanel_id() {
        return panel_id;
    }

    public void setPanel_id(int panel_id) {
        this.panel_id = panel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getPicture_file() {
        return picture_file;
    }

    public void setPicture_file(String picture_file) {
        this.picture_file = picture_file;
    }

    public List<IRFunc> getFunc_list() {
        return func_list;
    }

    public void setFunc_list(List<IRFunc> func_list) {
        this.func_list = func_list;
    }

    public List<IRPanel> getPanel_list() {
        return panel_list;
    }

    public void setPanel_list(List<IRPanel> panel_list) {
        this.panel_list = panel_list;
    }

    public List<IRScheduleInfo> getSchedule_info_list() {
        return schedule_info_list;
    }

    public void setSchedule_info_list(List<IRScheduleInfo> schedule_info_list) {
        this.schedule_info_list = schedule_info_list;
    }

    public IRScheduleInfo getSchedule_info() {
        return schedule_info;
    }

    public void setSchedule_info(IRScheduleInfo schedule_info) {
        this.schedule_info = schedule_info;
    }

    public List<IrExtendAttr> getAttr_list() {
        return attr_list;
    }

    public void setAttr_list(List<IrExtendAttr> attr_list) {
        this.attr_list = attr_list;
    }

    public String getRelay_status() {
        return relay_status;
    }

    public void setRelay_status(String relay_status) {
        this.relay_status = relay_status;
    }

    public int getIrtype() {
        return irtype;
    }

    public void setIrtype(int irtype) {
        this.irtype = irtype;
    }

    public IRDevSyncState getDev_sync_state() {
        return dev_sync_state;
    }

    public void setDev_sync_state(IRDevSyncState dev_sync_state) {
        this.dev_sync_state = dev_sync_state;
    }

    public List<DeviceHistory> getDev_history_list() {
        return dev_history_list;
    }

    public void setDev_history_list(List<DeviceHistory> dev_history_list) {
        this.dev_history_list = dev_history_list;
    }

    public List<Plan> getPlan_list() {
        return plan_list;
    }

    public void setPlan_list(List<Plan> plan_list) {
        this.plan_list = plan_list;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<IRPanelInfoList> getDev_panels_info_list() {
        return dev_panels_info_list;
    }

    public void setDev_panels_info_list(List<IRPanelInfoList> dev_panels_info_list) {
        this.dev_panels_info_list = dev_panels_info_list;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DeviceInfo.WidgetAttr getAttrid() {
        if (attrid == null) {
            return DeviceInfo.WidgetAttr.DEFAULT;
        }
        return attrid;
    }

    public void setAttrid(DeviceInfo.WidgetAttr attrid) {
        this.attrid = attrid;
    }

    public List<IpCamAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<IpCamAttribute> attributes) {
        this.attributes = attributes;
    }

}