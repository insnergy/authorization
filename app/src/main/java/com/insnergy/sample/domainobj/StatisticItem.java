/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class StatisticItem {
//    public static final String STRIP_DEV_EXT_TYPE = "06";
    public static final String STRIP_TITLE = "StripTitle";
    private double mValue;
    private double mPrice;
    private String mDevCategory;
    private String mDevTypeName;
    private String mAlias;
    private String mDevId;
    private DeviceInfo.Ext_Type mDevExtType;
    private boolean mIsStrip;
    private String mIcon;
    private String mChildTitle;


    public StatisticItem(
            double values, double price, String category, String dev_type_name, String alias,
            String dev_id, DeviceInfo.Ext_Type dev_ext_type, String icon, String childTitle) {
        mValue = values;
        mPrice = price;
        mDevCategory = category;
        mDevTypeName = dev_type_name;
        mAlias = alias;
        mDevId = dev_id;
        mDevExtType = dev_ext_type;
        mIcon = icon;
        mIsStrip = (mDevExtType.equals(DeviceInfo.Ext_Type.OUTLET_STRIP_06))? true: false;
        mChildTitle = childTitle;
    }

    public double getmValue() {
        return mValue;
    }

    public void setmValue(float mValue) {
        this.mValue = mValue;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }

    public String getmDevCategory() {
        return mDevCategory;
    }

    public void setmDevCategory(String mDevCategory) {
        this.mDevCategory = mDevCategory;
    }

    public String getmDevTypeName() {
        return mDevTypeName;
    }

    public void setmDevTypeName(String mDevTypeName) {
        this.mDevTypeName = mDevTypeName;
    }

    public static DeviceInfo.Ext_Type getStripDevExtType() {
        return DeviceInfo.Ext_Type.OUTLET_STRIP_06;
    }

    public String getmAlias() {
        return mAlias;
    }

    public void setmAlias(String mAlias) {
        this.mAlias = mAlias;
    }

    public String getmDevId() {
        return mDevId;
    }

    public void setmDevId(String mDevId) {
        this.mDevId = mDevId;
    }

    public DeviceInfo.Ext_Type getmDevExtType() {
        return mDevExtType;
    }

    public void setmDevExtType(DeviceInfo.Ext_Type mDevExtType) {
        this.mDevExtType = mDevExtType;
    }

    public boolean ismIsStrip() {
        return mIsStrip;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String icon) {
        mIcon = icon;
    }

    public String getmChildTitle() {
        return mChildTitle;
    }
}
