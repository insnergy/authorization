/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private static final String TAG = "[Rule]";
    public static final String PROPERTY = "rule";
    public static final String GE = "≧";
    public static final String LT = "＜";
    public static final String EQ = "=";
    public static final String SWITCH_STATUS_OPEN = "1";
    public static final String SWITCH_STATUS_CLOSE = "0";

    private DeviceInfo.Category category;
    private String rule_id;

    //common
    private List<Action> action_list;
    private RULE_LIST operator;
    private String dev_id;
    private DeviceInfo.WidgetAttr attribute;
    private String condition;
    private DeviceInfo.Ext_Type dev_ext_type;
    private RULE_ATTY_TYPE attribute_type;

    public Rule() {
        this.category = DeviceInfo.Category.DEFAULT;
        this.action_list = new ArrayList<>();
        this.action_list.add(new Action());
        this.operator = RULE_LIST.GE;
        this.dev_id = "";
        this.attribute = DeviceInfo.WidgetAttr.DEFAULT;
        this.condition = "";
        this.dev_ext_type = DeviceInfo.Ext_Type.DEFAULT;
        this.attribute_type = RULE_ATTY_TYPE.Value;
    }

    public RULE_ATTY_TYPE getAttribute_type() {
        if (attribute_type == null) {
            return RULE_ATTY_TYPE.Value;
        }
        return attribute_type;
    }

    public void setAttribute_type(RULE_ATTY_TYPE attr_type) {
        this.attribute_type = attr_type;
    }

    public enum RULE_LIST {
        GE,
        EQ,
        LT;
    }

    public enum RULE_ATTY_TYPE {
        @SerializedName("Value")
        Value,
        @SerializedName("Reporttime")
        Reporttime,
        @SerializedName("Month.Sum")
        Month_Sum;
    }

    public String getRule_id() {
        return rule_id;
    }

    public void setRule_id(String rule_id) {
        this.rule_id = rule_id;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public DeviceInfo.WidgetAttr getAttribute() {
        return attribute;
    }

    public void setAttribute(DeviceInfo.WidgetAttr attr) {
        this.attribute = attr;
    }

    public RULE_LIST getOperator() {
        return operator;
    }

    public void setOperator(RULE_LIST operator) {
        this.operator = operator;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<Action> getAction_list() {
        return action_list;
    }

    public void setAction_list(List<Action> action_list) {
        this.action_list = action_list;
    }

    public DeviceInfo.Category getCategory() {
        return category;
    }

    public void setCategory(DeviceInfo.Category category) {
        this.category = category;
    }

    public DeviceInfo.Ext_Type getDev_ext_type() {
        return dev_ext_type;
    }

    public void setDev_ext_type(DeviceInfo.Ext_Type dev_ext_type) {
        this.dev_ext_type = dev_ext_type;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "category='" + category + '\'' +
                ", rule_id='" + rule_id + '\'' +
                ", action_list=" + action_list +
                ", operator=" + operator +
                ", dev_id='" + dev_id + '\'' +
                ", attribute=" + attribute +
                ", condition='" + condition + '\'' +
                ", dev_ext_type='" + dev_ext_type + '\'' +
                ", attribute_type='" + attribute_type + '\'' +
                '}';
    }
}
