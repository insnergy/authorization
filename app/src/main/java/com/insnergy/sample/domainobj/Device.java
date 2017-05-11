/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class Device {
    private String dev_id;
    private DeviceInfo.Ext_Type dev_ext_type;
    private DeviceInfo.Category dev_category;
    private String gw_dev_id;
    private String connected;
    private String relay_status;
    private String owner;
    private String alias;
    private DeviceInfo.Icon icon;
    private String sub_dev_id;
    private String sub_alias;
    private String sub_icon;
    private String enable_status;
    private String dev_type_name;
    private String net_type;
    private String prod_kit;
    private List<Data> data;

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public DeviceInfo.Ext_Type getDev_ext_type() {
        if (this.dev_ext_type == null) {
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

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public String getRelay_status() {
        return relay_status;
    }

    public void setRelay_status(String relay_status) {
        this.relay_status = relay_status;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getEnable_status() {
        return enable_status;
    }

    public void setEnable_status(String enable_status) {
        this.enable_status = enable_status;
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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getSub_dev_id() {
        return sub_dev_id;
    }

    public void setSub_dev_id(String sub_dev_id) {
        this.sub_dev_id = sub_dev_id;
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

}
