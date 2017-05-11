/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class WidgetFilter {
    private String widget_inst_id;
    private String dev_id;
    private String dev_category;
    private String dev_ext_type;
    private String dev_type_name;
    private String net_type;
    private String prod_kit;// NOTE: this value is case sensitive
    private String type_code;

    public WidgetFilter() {}

    public String getWidget_inst_id() {
        return widget_inst_id;
    }

    public void setWidget_inst_id(String widget_inst_id) {
        this.widget_inst_id = widget_inst_id;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getDev_category() {
        return dev_category;
    }

    public void setDev_category(String dev_category) {
        this.dev_category = dev_category;
    }

    public String getDev_ext_type() {
        return dev_ext_type;
    }

    public void setDev_ext_type(String dev_ext_type) {
        this.dev_ext_type = dev_ext_type;
    }

    public String getDev_type_name() {
        return dev_type_name;
    }

    public void setDev_type_name(String dev_type_name) {
        this.dev_type_name = dev_type_name;
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

    public String getType_code() {
        return type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
    }
}
