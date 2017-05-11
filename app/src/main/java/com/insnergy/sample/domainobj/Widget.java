/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.ArrayList;
import java.util.List;

public class Widget {
    public static final String PROPERTY = "widget";
    public static final String SUB_STRIP_NUMBER_PROPERTY = "subStripNumber";

    private String instance_id;
    private String alias;
    private DeviceInfo.Icon icon;
    private String sub_alias;
    private String sub_icon;
    private String widget_id;
    private String widget_type_code;
    private String widget_type_name;
    private String dev_id;
    private String dev_type_name;
    private DeviceInfo.Ext_Type dev_ext_type;
    private DeviceInfo.Category dev_category;
    private String gw_dev_id;
    private String net_type;
    private String prod_kit;
    private String style_id;
    private String style_name;
    private String seq_num;
    private String active;
    private String display;
    private String status;
    private List<WidgetInfo> widget_infos;
    private String create_time;
    private String update_time;
    private WidgetInfo widgetInfo;
    private SUB_DEVICE_NUMBER subStripNumber;
    private List<IRPanel> irPanelList;
    private DeviceInfo.WidgetAttr lossnayControlAttr;

    public DeviceInfo.WidgetAttr getLossnayControlAttr() {
        if (lossnayControlAttr == null) {
            return DeviceInfo.WidgetAttr.DEFAULT;
        }
        return lossnayControlAttr;
    }

    public void setLossnayControlAttr(DeviceInfo.WidgetAttr lossnayControlAttr) {
        this.lossnayControlAttr = lossnayControlAttr;
    }

    public enum SUB_DEVICE_NUMBER {
        A("A"),
        B("B"),
        C("C"),
        D("D"),
        DEFAULT("");
        private String code;

        SUB_DEVICE_NUMBER(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }

    public Widget() {
        this.instance_id = "";
        this.alias = "";
        this.icon = DeviceInfo.Icon.DEFAULT;
        this.sub_alias = "";
        this.sub_icon = "";
        this.widget_id = "";
        this.widget_type_code = "";
        this.widget_type_name = "";
        this.dev_id = "";
        this.dev_type_name = "";
        this.dev_ext_type = DeviceInfo.Ext_Type.DEFAULT;
        this.dev_category = DeviceInfo.Category.DEFAULT;
        this.gw_dev_id = "";
        this.net_type = "";
        this.prod_kit = "";
        this.style_id = "";
        this.style_name = "";
        this.seq_num = "";
        this.active = "";
        this.display = "";
        this.status = "";
        this.widget_infos = new ArrayList<>();
        this.widget_infos.add(new WidgetInfo());
        this.create_time = "";
        this.update_time = "";
//        this.widgetInfo = new WidgetInfo();
        this.subStripNumber = SUB_DEVICE_NUMBER.DEFAULT;
        this.irPanelList = new ArrayList<>();
//        this.irPanelList.add(new IRPanel());
    }

    public boolean isSub() {
        return isSub;
    }

    public void setSub(boolean sub) {
        isSub = sub;
    }

    private boolean isSub;

    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DeviceInfo.Icon getIcon() {
        if (icon == null) {
            return DeviceInfo.Icon.DEFAULT;
        }
        return icon;
    }

    public void setIcon(DeviceInfo.Icon icon) {
        this.icon = icon;
    }

    public String getSub_alias() {
        return sub_alias;
    }

    public void setSub_alias(String sub_alias) {
        this.sub_alias = sub_alias;
    }

    public String getSub_icon() {
        return sub_icon;
    }

    public void setSub_icon(String sub_icon) {
        this.sub_icon = sub_icon;
    }

    public String getWidget_id() {
        return widget_id;
    }

    public void setWidget_id(String widget_id) {
        this.widget_id = widget_id;
    }

    public String getWidget_type_code() {
        return widget_type_code;
    }

    public void setWidget_type_code(String widget_type_code) {
        this.widget_type_code = widget_type_code;
    }

    public String getWidget_type_name() {
        return widget_type_name;
    }

    public void setWidget_type_name(String widget_type_name) {
        this.widget_type_name = widget_type_name;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getDev_type_name() {
        return dev_type_name;
    }

    public void setDev_type_name(String dev_type_name) {
        this.dev_type_name = dev_type_name;
    }

    public DeviceInfo.Ext_Type getDev_ext_type() {
        if (dev_ext_type == null) {
            return DeviceInfo.Ext_Type.DEFAULT;
        }
        return dev_ext_type;
    }

    public void setDev_ext_type(DeviceInfo.Ext_Type dev_ext_type) {
        this.dev_ext_type = dev_ext_type;
    }

    public DeviceInfo.Category getDev_category() {
        if (this.dev_category == null) {
            return DeviceInfo.Category.DEFAULT;
        }
        return dev_category;
    }

    public void setDev_category(DeviceInfo.Category dev_category) {
        this.dev_category = dev_category;
    }

    public String getGw_dev_id() {
        return gw_dev_id;
    }

    public void setGw_dev_id(String gw_dev_id) {
        this.gw_dev_id = gw_dev_id;
    }

    public String getNet_type() {
        return net_type;
    }

    public void setNet_type(String net_type) {
        this.net_type = net_type;
    }

    public String getProd_kit() {
        return prod_kit;
    }

    public void setProd_kit(String prod_kit) {
        this.prod_kit = prod_kit;
    }

    public String getStyle_id() {
        return style_id;
    }

    public void setStyle_id(String style_id) {
        this.style_id = style_id;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }

    public String getSeq_num() {
        return seq_num;
    }

    public void setSeq_num(String seq_num) {
        this.seq_num = seq_num;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<WidgetInfo> getWidget_infos() {
        return widget_infos;
    }

    public void setWidget_infos(List<WidgetInfo> widget_infos) {
        this.widget_infos = widget_infos;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public WidgetInfo getWidgetInfo() {
        return widgetInfo;
    }

    public void setWidgetInfo(WidgetInfo widgetInfo) {
        this.widgetInfo = widgetInfo;
    }

    public SUB_DEVICE_NUMBER getSubStripNumber() {
        return subStripNumber;
    }

    public void setSubStripNumber(SUB_DEVICE_NUMBER subStripNumber) {
        this.subStripNumber = subStripNumber;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "instance_id='" + instance_id + '\'' +
                ", alias='" + alias + '\'' +
                ", icon='" + icon + '\'' +
                ", sub_alias='" + sub_alias + '\'' +
                ", sub_icon='" + sub_icon + '\'' +
                ", widget_id='" + widget_id + '\'' +
                ", widget_type_code='" + widget_type_code + '\'' +
                ", widget_type_name='" + widget_type_name + '\'' +
                ", dev_id='" + dev_id + '\'' +
                ", dev_type_name='" + dev_type_name + '\'' +
                ", dev_ext_type='" + dev_ext_type + '\'' +
                ", dev_category='" + dev_category + '\'' +
                ", gw_dev_id='" + gw_dev_id + '\'' +
                ", net_type='" + net_type + '\'' +
                ", prod_kit='" + prod_kit + '\'' +
                ", style_id='" + style_id + '\'' +
                ", style_name='" + style_name + '\'' +
                ", seq_num='" + seq_num + '\'' +
                ", active='" + active + '\'' +
                ", display='" + display + '\'' +
                ", status='" + status + '\'' +
                ", widget_infos=" + widget_infos +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", widgetInfo=" + widgetInfo +
                ", subStripNumber=" + subStripNumber +
                '}';
    }

    public List<IRPanel> getIrPanelList() {
        return irPanelList;
    }

    public void setIrPanelList(List<IRPanel> irPanelList) {
        this.irPanelList = irPanelList;
    }
}
