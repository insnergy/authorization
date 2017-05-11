/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class DeviceHistory {
    private Device device;
    private List<HistoryData> history_data_list;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public List<HistoryData> getHistory_data_list() {
        return history_data_list;
    }

    public void setHistory_data_list(List<HistoryData> history_data_list) {
        this.history_data_list = history_data_list;
    }
}
