/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.google.gson.annotations.SerializedName;

public class PanelInfo {

    public enum BUNDLE_KEY_STRING {
        DEV_ID("dev_id"),
        NAME("name"),
        CATEGORY("category"),
        BRAND("brand"),
        MODEL("model"),
        PANEL_ID("panel_id"),
         GO_TO("go_to"),
        IR_TYPE("irtype"),
        MODIFY("modify");

        private String code;

        BUNDLE_KEY_STRING(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum BEHAVIOR {
        ADD_PANEL("add_panel"),
        EDIT_PANEL("edit_panel");

        private String code;

        BEHAVIOR(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum CATEGORY {
        @SerializedName("aircon")
        AIRCON("aircon"),
        @SerializedName("tv")
        TV("tv"),
        @SerializedName("other")
        OTHER("other"),
        @SerializedName("other_diy")
        OTHER_DIY("other_diy"),
        @SerializedName("aircon_diy")
        AIRCON_DIY("aircon_diy"),
        @SerializedName("tv_diy")
        TV_DIY("tv_diy");

        private String code;

        CATEGORY(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum IR_FUNCTION {
        //Common
        @SerializedName("power")
        POWER("power"),
        @SerializedName("enter")
        ENTER("enter"),

        //Number
        @SerializedName("0")
        ZERO("0"),
        @SerializedName("1")
        ONE("1"),
        @SerializedName("2")
        TWO("2"),
        @SerializedName("3")
        THREE("3"),
        @SerializedName("4")
        FOUR("4"),
        @SerializedName("5")
        FIVE("5"),
        @SerializedName("6")
        SIX("6"),
        @SerializedName("7")
        SEVEN("7"),
        @SerializedName("8")
        EIGHT("8"),
        @SerializedName("9")
        NINE("9"),

        //Air Con
        @SerializedName("cooling")
        COOLING("cooling"),
        @SerializedName("dehumidify")
        DEHUMIDIFY("dehumidify"),
        @SerializedName("wind")
        WIND("wind"),
        @SerializedName("heating")
        HEARING("heating"),
        @SerializedName("strongWind")
        STRONG_WIND("strongWind"),
        @SerializedName("weakWind")
        WEAK_WIND("weakWind"),
        @SerializedName("breeze")
        BREEZE("breeze"),
        @SerializedName("auto")
        AUTO("auto"),
        @SerializedName("temperature_up")
        TEMPERATURE_UP("temperature_up"),
        @SerializedName("temperature_down")
        TEMPERATURE_DOWN("temperature_down"),
        @SerializedName("mode")
        MODE("mode"),
        @SerializedName("windDirection")
        TEMP("windDirection"),
        @SerializedName("fanspeed")
        FANSPEED("fanspeed"),

        //TV
        @SerializedName("volume_down")
        VOLUME_DOWN("volume_down"),
        @SerializedName("volume_up")
        VOLUME_UP("volume_up"),
        @SerializedName("channel_down")
        CHANNEL_DOWN("channel_down"),
        @SerializedName("channel_up")
        CHANEL_UP("channel_up"),
        @SerializedName("mute")
        MUTE("mute"),
        @SerializedName("back")
        BACK("back"),

        //User Button
        @SerializedName("userBtn1")
        USER_BTN_1("userBtn1"),
        @SerializedName("userBtn2")
        USER_BTN_2("userBtn2"),
        @SerializedName("userBtn3")
        USER_BTN_3("userBtn3"),
        @SerializedName("userBtn4")
        USER_BTN_4("userBtn4"),
        @SerializedName("userBtn5")
        USER_BTN_5("userBtn5"),
        @SerializedName("userBtn6")
        USER_BTN_6("userBtn6"),
        @SerializedName("userBtn7")
        USER_BTN_7("userBtn7"),
        @SerializedName("userBtn8")
        USER_BTN_8("userBtn8"),
        @SerializedName("userBtn9")
        USER_BTN_9("userBtn9"),
        @SerializedName("userBtn10")
        USER_BTN_10("userBtn10"),
        @SerializedName("userBtn11")
        USER_BTN_11("userBtn11"),
        @SerializedName("userBtn12")
        USER_BTN_12("userBtn12"),
        @SerializedName("userBtn13")
        USER_BTN_13("userBtn13"),
        @SerializedName("userBtn14")
        USER_BTN_14("userBtn14"),
        @SerializedName("userBtn15")
        USER_BTN_15("userBtn15"),
        @SerializedName("userBtn16")
        USER_BTN_16("userBtn16"),
        @SerializedName("userBtn17")
        USER_BTN_17("userBtn17"),
        @SerializedName("userBtn18")
        USER_BTN_18("userBtn18"),
        @SerializedName("userBtn19")
        USER_BTN_19("userBtn19"),
        @SerializedName("userBtn20")
        USER_BTN_20("userBtn20"),
        @SerializedName("userBtn21")
        USER_BTN_21("userBtn21");

        private String code;

        IR_FUNCTION(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }
}
