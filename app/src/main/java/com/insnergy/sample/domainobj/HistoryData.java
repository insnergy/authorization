/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import java.util.List;

public class HistoryData {
    private String attrid;
    private List<Data> attributes_value_list;

    public String getAttrid() {
        return attrid;
    }

    public void setAttrid(String attrid) {
        this.attrid = attrid;
    }

    public List<Data> getAttributes_value_list() {
        return attributes_value_list;
    }

    public void setAttributes_value_list(List<Data> attributes_value_list) {
        this.attributes_value_list = attributes_value_list;
    }
}
