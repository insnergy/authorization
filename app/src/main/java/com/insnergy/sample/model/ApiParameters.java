/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.model;

import com.insnergy.sample.model.Constants.HttpMethod;
import com.insnergy.sample.model.Constants.Server;

public final class ApiParameters {
    // User
    public static final String[] getUserInfo = new String[]{Server.ISAS, "/core/1/user/me", HttpMethod.GET.getCode()};

    // Device
    public static final String[] getMyDevices = new String[]{Server.ISAS, "/ifa/1/device/my", HttpMethod.GET.getCode(), "email"};
    public static final String[] getUserInfoAndUserGateway = new String[]{Server.ISAS, "/ifa/1/user/widgets", HttpMethod.GET.getCode(), "email", "dev_category"};
    public static final String[] addDevice = new String[]{Server.ISAS, "/ifa/1/device/register", HttpMethod.POST.getCode(), "email", "widget_mode", "dev_id", "dev_ext_type", "timezone", "alias", "icon"};
    public static final String[] controlDevice = new String[]{Server.ISAS, "/ifa/1/device/control", HttpMethod.GET.getCode(), "email", "dev_id", "action"};
    public static final String[] getNewDevice = new String[]{Server.ISAS, "/ifa/1/device/unregistered/list", HttpMethod.GET.getCode(), "email"};
    public static final String[] deleteDevice = new String[]{Server.ISAS, "/ifa/1/device/edit", HttpMethod.DELETE.getCode(), "email", "dev_id"};
    public static final String[] getWidgets = new String[]{Server.ISAS, "/ifa/1/user/widgets", HttpMethod.GET.getCode(), "email", "type_code"};
    public static final String[] getDeviceWidget = new String[]{Server.ISAS, "/ifa/1/user/widgets", HttpMethod.GET.getCode(), "email", "dev_id", "type_code"};
    public static final String[] setUserPrefs = new String[]{Server.ISAS, "/ifa/1/user/widgets", HttpMethod.POST.getCode(), "email", "type_code", "style_name", "custom_field"};
    public static final String[] putDevice = new String[]{Server.ISAS, "/ifa/1/user/widgets", HttpMethod.PUT.getCode(), "email", "widget_inst_id", "alias", "icon"};

    // Schedule
    public static final String[] getDeviceAllSchedule = new String[]{Server.ISAS, "/ifa/1/device/schedule", HttpMethod.GET.getCode(), "email", "dev_id"};
    public static final String[] addSchedule = new String[]{Server.ISAS, "/ifa/1/device/schedule/edit", HttpMethod.POST.getCode(), "email", "dev_id", "action", "sched_freq", "sched_date", "sched_week","sched_time"};
    public static final String[] editSchedule = new String[]{Server.ISAS, "/ifa/1/device/schedule/edit", HttpMethod.PUT.getCode(), "email", "trigger_name", "dev_id", "action", "sched_freq", "sched_date", "sched_time", "enable"};
    public static final String[] deleteSchedule = new String[]{Server.ISAS, "/ifa/1/device/schedule/edit", HttpMethod.DELETE.getCode(), "email", "trigger_name"};
    public static final String[] settingOverload = new String[]{Server.ISAS, "/ifa/1/device/overload_setting", HttpMethod.PUT.getCode(), "email", "dev_id", "notice_enable", "notice_thold", "cutoff_enable", "cutoff_thold"};

    // Device History
    public static final String[] getDeviceHistoryExt = new String[]{Server.IF3, "/3/device/history_ext", HttpMethod.GET.getCode(), "email", "dev_id", "attr", "start_time", "end_time"};

    //HomeAuto
    //Plan
    public static final String[] getPlanList = new String[]{Server.ISAS, "/ifa/1/user/plan", HttpMethod.GET.getCode(), "user_id", "verbose"};
    public static final String[] addPlan = new String[]{Server.ISAS, "/ifa/1/user/plan", HttpMethod.POST.getCode(), "user_id", "name", "enable_status"};
    public static final String[] editPlan = new String[]{Server.ISAS, "/ifa/1/user/plan", HttpMethod.PUT.getCode(), "user_id", "plan_id", "name", "enable_status"};
    public static final String[] deletePlan = new String[]{Server.ISAS, "/ifa/1/user/plan", HttpMethod.DELETE.getCode(), "user_id", "plan_id"};
    //Rule
    public static final String[] getRuleList = new String[]{Server.ISAS, "/ifa/1/user/rule_action", HttpMethod.GET.getCode(), "user_id", "plan_id"};
    public static final String[] setRule = new String[]{Server.ISAS, "/ifa/1/user/rule_action", HttpMethod.POST.getCode(), "user_id", "plan_id", "rule"};
    public static final String[] deleteRule = new String[]{Server.ISAS, "/ifa/1/user/rule_action", HttpMethod.DELETE.getCode(), "user_id", "rule_id"};
    public static final String[] deleteAction = new String[]{Server.ISAS, "/ifa/1/user/rule_action", HttpMethod.DELETE.getCode(), "user_id", "rule_id", "action_ids"};

    public static final String[] addMobileToken = new String[]{Server.ISAS, "/core/1/user/mobile_token", HttpMethod.POST.getCode(), "user_id", "channels", "mobile_token", "client_alias"};
    public static final String[] deleteMobileToken = new String[]{Server.ISAS, "/core/1/user/mobile_token", HttpMethod.DELETE.getCode(), "user_id", "mobile_token"};
    public static final String[] triggerRule = new String[]{Server.ISAS, "/ifa/1/user/rule_event", HttpMethod.POST.getCode(), "user_id", "rule_id"};

    //SIREN
    public static final String[] controlSiren = new String[] {Server.ISAS, "/core/1/command/siren_warning_control", HttpMethod.POST.getCode(), "dev_id", "value", "user_id"};
    public static final String[] controlSyncSwitch = new String[] {Server.ISAS, "/core/1/command/sync_switch", HttpMethod.POST.getCode(), "dev_id", "value", "user_id"};

    //ISAS Statistics Data
    public static final String[] getStatisticsData = new String[] {Server.ISAS, "/core/1/statistics/device_ext", HttpMethod.GET.getCode()};
}
