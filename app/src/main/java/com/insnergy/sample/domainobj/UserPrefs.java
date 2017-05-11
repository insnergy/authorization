/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class UserPrefs {
    private String attr_name;
    private String value;
    private String action;

    public UserPrefs(String _attr_name, String _value, String _action) {
        attr_name = _attr_name;
        value = _value;
        action = _action;
    }
}
