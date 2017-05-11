/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class IRPanelInfoList {

    private String dev_id;
    private int max_panel_count;
    private int panel_count;
    private List<IRPanel> panel_list;
    private IRDevSyncState dev_sync_state;

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public int getMax_panel_count() {
        return max_panel_count;
    }

    public void setMax_panel_count(int max_panel_count) {
        this.max_panel_count = max_panel_count;
    }

    public int getPanel_count() {
        return panel_count;
    }

    public void setPanel_count(int panel_count) {
        this.panel_count = panel_count;
    }

    public List<IRPanel> getPanel_list() {
        return panel_list;
    }

    public void setPanel_list(List<IRPanel> panel_list) {
        this.panel_list = panel_list;
    }

    @Override
    public String toString() {
        return "IRPanels{" +
                "dev_id='" + dev_id + '\'' +
                ", max_panel_count=" + max_panel_count +
                ", panel_count=" + panel_count +
                ", panel_list=" + panel_list +
                '}';
    }

    public IRDevSyncState getDev_sync_state() {
        return dev_sync_state;
    }

    public void setDev_sync_state(IRDevSyncState dev_sync_state) {
        this.dev_sync_state = dev_sync_state;
    }
}
