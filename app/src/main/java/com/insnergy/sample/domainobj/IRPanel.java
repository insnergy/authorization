/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import static com.insnergy.sample.domainobj.PanelInfo.CATEGORY;

public class IRPanel {

    public static final String PROPERTY = "irPanel";
    public static final Integer CLOUD = 1;
    public static final Integer KOO_KONG = 2;

    private int panel_id;
    private String dev_id;
    private String name;
    private CATEGORY category;
    private String brand;
    private String model_name;
    private String picture_file;
    private Integer irtype;
    private boolean isSyncing;

    public IRPanel() {
        this.panel_id = 0;
        this.dev_id = "";
        this.category = CATEGORY.TV;
        this.picture_file = "";
        this.name = "";
        this.brand = "";
        this.model_name = "";
        this.isSyncing = false;
    }

    public IRPanel(String dev_id, String category, String icon, String name, String brand, String model) {
        this.dev_id = dev_id;
        this.category = CATEGORY.valueOf(category.toUpperCase());
        this.picture_file = icon;
        this.name = name;
        this.brand = brand;
        this.model_name = model;
        this.isSyncing = false;
    }

    public IRPanel(String dev_id, String category, String icon, String name, String brand, String model, int irtype) {
        this.dev_id = dev_id;
        this.category = CATEGORY.valueOf(category.toUpperCase());
        this.picture_file = icon;
        this.name = name;
        this.brand = brand;
        this.model_name = model;
        this.irtype = irtype;
        this.isSyncing = false;
    }

    public IRPanel(String category, String icon, String name, String brand) {
        this.category = CATEGORY.valueOf(category.toUpperCase());
        this.picture_file = icon;
        this.name = name;
        this.brand = brand;
        this.isSyncing = false;
    }

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

    public CATEGORY getCategory() {
        return category;
    }

    public void setCategory(CATEGORY category) {
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

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }


    public Integer getIrtype() {
        return irtype;
    }

    public void setIrtype(Integer irtype) {
        this.irtype = irtype;
    }

    public boolean isSyncing() {
        return isSyncing;
    }

    public void setSyncing(boolean syncing) {
        isSyncing = syncing;
    }

    @Override
    public String toString() {
        return "IRPanel{" +
                "panel_id=" + panel_id +
                ", dev_id='" + dev_id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", brand='" + brand + '\'' +
                ", model_name='" + model_name + '\'' +
                ", picture_file='" + picture_file + '\'' +
                ", irtype=" + irtype +
                ", isSyncing=" + isSyncing +
                '}';
    }
}
