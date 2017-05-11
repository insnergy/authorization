/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    public static final String PROPERTY = "plan";

    private String plan_id;
    private String user_id;
    private String enable_status;
    private String name;
    private int rule_count;
    private List<Rule> rule_list;

    public Plan() {
        this.plan_id = "";
        this.user_id = "";
        this.enable_status = "";
        this.name = "";
        this.rule_count = 0;
        this.rule_list = new ArrayList<>();
        this.rule_list.add(new Rule());
    }

    public Plan(String name) {
        this.name = name;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEnable_status() {
        return enable_status;
    }

    public void setEnable_status(String enable_status) {
        this.enable_status = enable_status;
    }

    public int getRule_count() {
        return rule_count;
    }

    public void setRule_count(int rule_count) {
        this.rule_count = rule_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rule> getRule_list() {
        return rule_list;
    }

    public void setRule_list(List<Rule> rule_list) {
        this.rule_list = rule_list;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "plan_id='" + plan_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", enable_status='" + enable_status + '\'' +
                ", name='" + name + '\'' +
                ", rule_count=" + rule_count +
                ", rule_list=" + rule_list +
                '}';
    }
}
