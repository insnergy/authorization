/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Action {
    public static final String TAG = "[Action]";
    public static final String PROPERTY = "action";
    public static final String OFF = "0";
    public static final String ON = "1";

    private int action_id;
    private Category category;
    private Command command;
    private String dev_id;
    private String dev_ext_type;
    private String value;
    private List<String> target_list;
    private String body;

    public enum Category {
        SENSOR("SENSOR"),
        OUTLET("OUTLET"),
        IR_TRANSCEIVER("IR_TRANSCEIVER"),
        CONTROLLER("CONTROLLER"),
        MOBILE("MOBILE"),
        CLOUD("CLOUD"),
        MEDIASPEAKER("MEDIASPEAKER"),
        DEFAULT("");

        private String code;

        Category(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }

    public enum Command {
        @SerializedName("cmd_switch")
        CMD_SWITCH,
        @SerializedName("cmd_siren_warning")
        CMD_SIREN_WARNING,
        @SerializedName("send_all")
        SEND_ALL,
        @SerializedName("send_mail")
        SEND_MAIL,
        @SerializedName("send_notice")
        SEND_NOTICE,
        DEFAULT;
    }

    public enum Outlet_Type {
        @SerializedName("0")
        OFF("0"),
        @SerializedName("1")
        ON("1");

        private String code;

        Outlet_Type(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public boolean equals(@NonNull String value) {
            if (name().equalsIgnoreCase(value) || getCode().equals(value)) {
                return true;
            }
            return false;
        }

        public static Outlet_Type getEnum(@NonNull String value) {
            for (Outlet_Type outletTypeType : values()) {
                if (outletTypeType.name().equals(value) || outletTypeType.getCode().equals(value)) {
                    return  outletTypeType;
                }
            }
            return OFF;
        }
    }

    public enum Siren_Voice_Type {
        @SerializedName("0")
        DISARM("0"),
        @SerializedName("1")
        BURGLAY("1"),
        @SerializedName("2")
        FIRE("2"),
        @SerializedName("3")
        EMERGENCY_1("3"),
        @SerializedName("4")
        EMERGENCY_2("4"),
        @SerializedName("5")
        DOOR_BELL("5"),
        @SerializedName("6")
        DI_DI("6");

        private String code;

        Siren_Voice_Type(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static Siren_Voice_Type getEnum(@NonNull String value) {
            for (Siren_Voice_Type sirenVoiceType : values()) {
                if (sirenVoiceType.name().equals(value) || sirenVoiceType.getCode().equals(value)) {
                    return  sirenVoiceType;
                }
            }
            return DISARM;
        }
    }

    public Action() {
        this.action_id = 0;
        this.category = Category.DEFAULT;
        this.command = Command.DEFAULT;
        this.dev_id = "";
        this.dev_ext_type = DeviceInfo.Ext_Type.DEFAULT.getCode();
        this.value = "";
        this.target_list = new ArrayList<>();
        this.body = "";
    }

    public Action(Category category, String dev_id, String dev_ext_type, Command command, String value) {
        this();
        this.category = category;
        this.dev_id = dev_id;
        this.dev_ext_type = dev_ext_type;
        this.command = command;
        this.value = value;
    }

    public Action(int action_id,
                  Category category, String dev_id, String dev_ext_type, Command command, String value) {
        this();
        this.action_id = action_id;
        this.category = category;
        this.dev_id = dev_id;
        this.dev_ext_type = dev_ext_type;
        this.command = command;
        this.value = value;
    }

    public Action(Category category, List<String> target_list, Command command, String body) {
        this();
        this.category = category;
        this.target_list = target_list;
        this.command = command;
        this.body = body;
    }

    public Action(int action_id,
                  Category category, List<String> target_list, Command command, String body) {
        this();
        this.action_id = action_id;
        this.category = category;
        this.target_list = target_list;
        this.command = command;
        this.body = body;
    }

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public Category getCategory() {
        if (category == null) {
            return Category.DEFAULT;
        }
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Command getCommand() {
        if (command == null) {
            return Command.SEND_NOTICE;
        }
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDev_ext_type() {
        return dev_ext_type;
    }

    public void setDev_ext_type(String dev_ext_type) {
        this.dev_ext_type = dev_ext_type;
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public List<String> getTarget_list() {
        return target_list;
    }

    public void setTarget_list(List<String> target_list) {
        this.target_list = target_list;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Action{" +
                "action_id=" + action_id +
                ", category=" + category +
                ", command=" + command +
                ", dev_id='" + dev_id + '\'' +
                ", dev_ext_type='" + dev_ext_type + '\'' +
                ", value='" + value + '\'' +
                ", target_list=" + target_list +
                ", body='" + body + '\'' +
                '}';
    }
}
