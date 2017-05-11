/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class IpCamAttribute {

    private DeviceInfo.WidgetAttr attribute;
    private String value;

    public IpCamAttribute(DeviceInfo.WidgetAttr attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public DeviceInfo.WidgetAttr getAttribute() {
        if (attribute == null) {
            return DeviceInfo.WidgetAttr.DEFAULT;
        }
        return attribute;
    }

    public void setAttribute(DeviceInfo.WidgetAttr attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "attribute=" + attribute.getCode() +
                ", value='" + value + '\'' +
                '}';
    }

}
