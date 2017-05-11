/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

import com.google.gson.annotations.SerializedName;

public class DeviceInfo {

    public static final String OFFLINE = "offline";
    public static final String ENABLED_TEXT = "on";
    public static final String DISABLED_TEXT = "off";
    public static final String ENABLED_NUMBER = "0";
    public static final String DISABLED_NUMBER = "1";

    public enum Category {
        SENSOR("SENSOR"),
        GATEWAY("GATEWAY"),
        OUTLET("OUTLET"),
        IR_TRANSCEIVER("IR_TRANSCEIVER"),
        CONTROLLER("CONTROLLER"),
        MOBILE("MOBILE"),
        CLOUD("CLOUD"),
        AIR_CONDITIONER("AIR_CONDITIONER"),
        CAMERA("CAMERA"),
        DEFAULT("");

        private String code;

        Category(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
    }

    public enum Ext_Type {
        @SerializedName("02")
        OUTLET_02("02"),
        @SerializedName("06")
        OUTLET_STRIP_06("06"),
        @SerializedName("07")
        OUTLET_220V_07("07"),
        @SerializedName("04")
        OUTLET_SINGLE_CT_04("04"),
        @SerializedName("098")
        OUTLET_SINGLE_CT_098("098"),
        @SerializedName("03")
        OUTLET_DOUBLE_CT_03("03"),
        @SerializedName("099")
        OUTLET_DOUBLE_CT_099("099"),
        @SerializedName("092")
        OUTLET_092("092"),
        @SerializedName("093")
        OUTLET_093("093"),
        @SerializedName("094")
        OUTLET_STRIP_094("094"),
        @SerializedName("095")
        OUTLET_B_TYPE_095("095"),
        @SerializedName("096")
        OUTLET_T_TYPE_096("096"),
        @SerializedName("097")
        OUTLET_DOUBLE_OUT_097("097"),
        @SerializedName("0910")
        OUTLET_I18N_0910("0910"),

        @SerializedName("S6")
        SENSOR_CO2("S6"),
        @SerializedName("2119")
        SENSOR_IN_CO2("2119"),
        @SerializedName("S7")
        SENSOR_CO("S7"),
        @SerializedName("215")
        SENSOR_CO_215("215"),
        @SerializedName("2118")
        SENSOR_IN_CO("2118"),
        @SerializedName("21")
        SENSOR_HYGRO_21("21"),
        @SerializedName("212")
        SENSOR_HYGRO_212("212"),
        @SerializedName("214")
        SENSOR_SMOKE("214"),
        @SerializedName("22")
        SENSOR_IR_TRANSCEIVER("22"),
        @SerializedName("2110")
        SENSOR_GAS("2110"),
        @SerializedName("219")
        SENSOR_COLOR_BUTTON("219"),
        @SerializedName("2120")
        SENSOR_TEMP_HYGRO_2120("2120"),

        @SerializedName("362")
        WIFI_IRC("362"),

        @SerializedName("900")
        GATEWAY_600("900"),
        @SerializedName("901")
        GATEWAY_SG6200("901"),
        @SerializedName("902")
        GATEWAY_RSG3000("902"),
        @SerializedName("C3")
        GATEWAY_LOSSNAY("C3"),
        @SerializedName("301")
        GATEWAY_DLINK("301"),
        //For IRC, Lossnay
        @SerializedName("C4")
        GATEWAY_VIRTUAL("C4"),


        @SerializedName("291")
        CONTROLLER_GAS("291"),
        @SerializedName("292")
        CONTROLLER_SIREN("292"),

        @SerializedName("ZZ")
        OTHER_TYPE("ZZ"),

        @SerializedName("2471")
        AIR_CONDITIONER_LOSSNAY("2471"),

        @SerializedName("")
        DEFAULT("");

        private String code;

        Ext_Type(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static Ext_Type getEnum(String value) {
            for (DeviceInfo.Ext_Type ext_type : values()) {
                if (ext_type.name().equalsIgnoreCase(value) || ext_type.getCode().equalsIgnoreCase(value)) {
                    return ext_type;
                }
            }
            return DEFAULT;
        }
    }

    public enum Icon {
        @SerializedName("air_conditioner")
        AIR_CONDITIONER("air_conditioner"),
        @SerializedName("aquarium")
        AQUARIUM("aquarium"),
        @SerializedName("blender")
        BLENDER("blender"),
        @SerializedName("coffee_maker")
        COFFEE_MAKER("coffee_maker"),
        @SerializedName("default_ir_transceiver")
        DEFAULT_IR_TRANSCEIVER("default_ir_transceiver"),
        @SerializedName("dehumidifier")
        DEHUMIDIFIER("dehumidifier"),
        @SerializedName("dish_dryer")
        DISH_DRYER("dish_dryer"),
        @SerializedName("dispenser")
        DISPENSER("dispenser"),
        @SerializedName("dvd_player")
        DVD_PLAYER("dvd_player"),
        @SerializedName("fan")
        FAN("fan"),
        @SerializedName("fridge")
        FRIDGE("fridge"),
        @SerializedName("hair_dryer")
        HAIR_DRYER("hair_dryer"),
        @SerializedName("heater")
        HEATER("heater"),
        @SerializedName("home_theater")
        HOME_THEATER("home_theater"),
        @SerializedName("lamp")
        LAMP("lamp"),
        @SerializedName("laptop")
        LAPTOP("laptop"),
        @SerializedName("microwave")
        MICROWAVE("microwave"),
        @SerializedName("monitor")
        MONITOR("monitor"),
        @SerializedName("other")
        OTHER("other"),
        @SerializedName("oven")
        OVEN("oven"),
        @SerializedName("pc")
        PC("pc"),
        @SerializedName("projector")
        PROJECTOR("projector"),
        @SerializedName("rice_cooker")
        RICE_COOKER("rice_cooker"),
        @SerializedName("thermos")
        THERMOS("thermos"),
        @SerializedName("tv")
        TV("tv"),
        @SerializedName("vacuum_cleaner")
        VACUUM_CLEANER("vacuum_cleaner"),
        @SerializedName("washer")
        WASHER("washer"),
        @SerializedName("strip")
        STRIP("strip"),
        @SerializedName("outlet_double_ct")
        OUTLET_DOUBLE_CT("outlet_double_ct"),
        @SerializedName("outlet_single_ct")
        OUTLET_SINGLE_CT("outlet_single_ct"),
        @SerializedName("")
        DEFAULT("");

        private String code;

        Icon(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static Icon getEnum(String value) {
            for (Icon icon : values()) {
                if (icon.getCode().equalsIgnoreCase(value)) {
                    return icon;
                }
            }
            return DEFAULT;
        }
    }

    public enum WidgetAttr {
        @SerializedName("100600")
        DEVICE_ERROR_CODE("100600"),

        @SerializedName("100700")
        POWER_STATUS("100700"),
        POWER_STATUS_OFF("100700.0"),
        POWER_STATUS_ON("100700.1"),

        @SerializedName("100800")
        DIMMING("100800"),

        @SerializedName("100900")
        CONNECTION_STATUS("100900"),
        CONNECTION_STATUS_OFFLINE("100900.0"),
        CONNECTION_STATUS_ONLINE("100900.1"),
        CONNECTION_STATUS_REGISTERED("100900.2"),

        @SerializedName("101000")
        SWITCH_STATUS("101000"),
        SWITCH_STATUS_OFF("101000.0"),
        SWITCH_STATUS_ON("101000.1"),

        @SerializedName("101100")
        FIRMWARE_UPDATE_STATUS("101100"),
        FIRMWARE_UPDATE_STATUS_SUCCESS("101100.0"),
        FIRMWARE_UPDATE_STATUS_IMAGE_NOT_FOUND("101100.1"),
        FIRMWARE_UPDATE_STATUS_IMAGE_DOWNLOAD_FAILED("101100.2"),
        FIRMWARE_UPDATE_STATUS_MD5_NOT_FOUND("101100.3"),
        FIRMWARE_UPDATE_STATUS_MD5_DOWNLOAD_FAILED("101100.4"),
        FIRMWARE_UPDATE_STATUS_MD5_CHECK_FAILED("101100.5"),
        FIRMWARE_UPDATE_STATUS_UPGRADE_FAILED("101100.6"),

        @SerializedName("101200")
        DEVICE_ENABLE_STATUS("101200"),
        DEVICE_ENABLE_STATUS_DISABLED("101200.0"),
        DEVICE_ENABLE_STATUS_ENABLED("101200.1"),
        DEVICE_ENABLE_STATUS_TO_BE_REMOVED("101200.2"),
        DEVICE_ENABLE_STATUS_DELETE("101200.3"),
        DEVICE_ENABLE_STATUS_NOT_EXIST("101200.4"),
        DEVICE_ENABLE_STATUS_RETURNED("101200.5"),

        @SerializedName("101800")
        BATTERY_STORAGE_STATUS("101800"),
        BATTERY_STORAGE_STATUS_NORMAL("101800.0"),
        BATTERY_STORAGE_STATUS_LOW("101800.1"),

        @SerializedName("101900")
        COLOR_TEMPERATURE_CTRL_STATUS("101900"),

        @SerializedName("102000")
        DEVICE_SYNC_STATUS("102000"),
        DEVICE_SYNC_STATUS_COMPLETED("102000.0"),
        DEVICE_SYNC_STATUS_SYNCING("102000.1"),
        DEVICE_SYNC_STATUS_GATEWAY_SYNC_FAILED("102000.2"),
        DEVICE_SYNC_STATUS_SYNC_TIMEOUT_1_HOUR("102000.3"),

        @SerializedName("110100")
        TEMPERATURE_STATUS("110100"),
        TEMPERATURE_STATUS_NORMAL("110100.0"),
        TEMPERATURE_STATUS_HIGH("110100.1"),
        TEMPERATURE_STATUS_LOW("110100.2"),

        @SerializedName("110200")
        HUMIDITY_STATUS("110200"),
        HUMIDITY_STATUS_NORMAL("110200.0"),
        HUMIDITY_STATUS_HIGH("110200.1"),
        HUMIDITY_STATUS_LOW("110200.2"),

        @SerializedName("110300")
        CO_STATUS("110300"),
        CO_STATUS_NORMAL("110300.0"),
        CO_STATUS_EXCEEDED("110300.1"),

        @SerializedName("110400")
        CO2_STATUS("110400"),
        CO2_STATUS_NORMAL("110400.0"),
        CO2_STATUS_EXCEEDED("110400.1"),

        @SerializedName("110500")
        MOTION_STATUS("110500"),
        MOTION_STATUS_STATIC("110500.0"),
        MOTION_STATUS_MOVING("110500.1"),

        @SerializedName("110600")
        SMOKE_STATUS("110600"),
        SMOKE_STATUS_NORMAL("110600.0"),
        SMOKE_STATUS_EXCEEDED("110600.1"),

        @SerializedName("110700")
        GAS_STATUS("110700"),
        GAS_STATUS_NORMAL("110700.0"),
        GAS_STATUS_EXCEEDED("110700.1"),

        @SerializedName("400100")
        TEMP("400100"),//temp
        @SerializedName("400200")
        HUMID("400200"),//humid
        @SerializedName("400300")
        ILLUMINANCE("400300"),
        @SerializedName("400400")
        IRRADIANCE("400400"),
        @SerializedName("400500")
        INSOLATION("400500"),
        @SerializedName("400600")
        CO2("400600"),//co2
        @SerializedName("400700")
        CO("400700"),//co
        @SerializedName("400800")
        COUNTER("400800"),
        @SerializedName("400900")
        PMV("400900"),
        @SerializedName("401000")
        FLOW("401000"),
        @SerializedName("401100")
        FLOW_ORIGINAL("401100"),
        @SerializedName("401200")
        PRESSURE("401200"),
        @SerializedName("401300")
        WIND_DIRECTION("401300"),
        @SerializedName("401400")
        WIND_SPEED("401400"),
        @SerializedName("401500")
        PM2_5("401500"),
        @SerializedName("500500")
        VOLTAGE("500500"),
        @SerializedName("500600")
        CURRENT("500600"),
        @SerializedName("500700")
        FREQUENCY("500700"),
        @SerializedName("500800")
        POWER_FACTOR("500800"),
        @SerializedName("500900")
        ACTIVE_POWER("500900"),//kwh
        COST("500900_cost"),
        @SerializedName("501000")
        APPARENT_POWER("501000"),
        @SerializedName("501100")
        REACTIVE_POWER("501100"),
        @SerializedName("501200")
        KWH("501200"),//statistics
        @SerializedName("501300")
        REVERSE_KWH("501300"),
        @SerializedName("501400")
        KVAH("501400"),
        @SerializedName("501500")
        REVERSE_KVAH("501500"),
        @SerializedName("501600")
        KVARH("501600"),
        @SerializedName("501700")
        REVERSE_KVARH("501700"),
        @SerializedName("501800")
        AVGLINE_VOLTAGE("501800"),
        @SerializedName("501900")
        AVG_CURRENT("501900"),
        @SerializedName("502000")
        PHASE_ANGLE_AB("502000"),
        @SerializedName("502100")
        PHASE_ANGLE_AC("502100"),
        @SerializedName("502200")
        SHORT_KWH("502200"),
        @SerializedName("502300")
        SHORT_REVERSE_KWH("502300"),
        @SerializedName("550100")
        METER_CAPABILITY("550100"),
        METER_CAPABILITY_NONE("550100.0"),
        METER_CAPABILITY_CONTROLLABLE("550100.1"),
        METER_CAPABILITY_MEANSURABLE("550100.2"),
        METER_CAPABILITY_CONTROLLABLE_MEANSURABLE("550100.3"),

        @SerializedName("551300")
        MAX_CURREN_SPEC("551300"),
        @SerializedName("551500")
        OVERLOAD_NOTIFICATION_CURRENTH_THRESHOLD("551500"),

        @SerializedName("551600")
        OVERLOAD_NOTIFICATION_ENABLE_SETTING("551600"),
        OVERLOAD_NOTIFICATION_ENABLE_SETTING_DISABLED("551600.0"),
        OVERLOAD_NOTIFICATION_ENABLE_SETTING_ENABLED("551600.1"),

        @SerializedName("551700")
        OVERLOAD_CUT_OFF_CURRENT_THRESHOLD("551700"),

        @SerializedName("551800")
        OVERLOAD_CUT_OFF_ENABLE_SETTING("551800"),
        OVERLOAD_CUT_OFF_ENABLE_SETTING_DISABLED("551800.0"),
        OVERLOAD_CUT_OFF_ENABLE_SETTING_ENABLED("551800.1"),

        @SerializedName("551900")
        BATTERY_CAPACITY("551900"),
        @SerializedName("610100")
        POWER_CONTROL_ABILITY("610100"),
        @SerializedName("610200")
        DIMMING_CONTROL_ABILITY("610200"),
        @SerializedName("610300")
        LIGHT_SWITCH_ABILITY("610300"),
        @SerializedName("610400")
        POWER_MEAS_ABILITY("610400"),
        @SerializedName("610500")
        IS_OFFLINE_NOTICE_ENABLED("610500"),
        @SerializedName("610600")
        IS_STATS_DISABLED("610600"),

        @SerializedName("610800")
        OVERLOAD_DETECT_ABILITY("610800"),
        OVERLOAD_DETECT_ABILITY_NONE("610800.0"),
        OVERLOAD_DETECT_ABILITY_INCLUDED("610800.1"),

        @SerializedName("620500")
        NET_TYPE("620500"),
        NET_TYPE_ZIG_BEE("620500.1"),
        NET_TYPE_RS485("620500.2"),
        NET_TYPE_PLC("620500.3"),
        NET_TYPE_ETHERNET("620500.4"),
        NET_TYPE_WIFI("620500.5"),

        @SerializedName("640100")
        TIMEZONE_OFFSET("640100"),
        @SerializedName("640200")
        TZ_SOURCE("640200"),
        @SerializedName("640300")
        LAST_DATA_REPORT_TIME("640300"),
        @SerializedName("640400")
        DEVICE_CREATE_TIMEDE_640400("640400"),
        @SerializedName("640500")
        DATA_REPORT_PERIOD("640500"),
        @SerializedName("640600")
        DEVICE_DATA_STEADY_TIME("640600"),
        @SerializedName("640700")
        USAGE_TIME("640700"),
        @SerializedName("640800")
        DST_ENABLE_SETTING("640800"),
        @SerializedName("640900")
        TIMEZONE_AREA("640900"),
        @SerializedName("641000")
        DST_START_TIME("641000"),
        @SerializedName("641100")
        DST_END_TIME("641100"),
        @SerializedName("641200")
        SENSING_PERIOD_SETTING_SEC("641200"),
        @SerializedName("641300")
        HW_LAST_DATA_SAVED_TIME("641300"),
        @SerializedName("641400")
        LAST_DATA_MODIFIED_TIME("641400"),
        @SerializedName("641500")
        LAST_EVENT_REPORT_TIME("641500"),
        @SerializedName("650100")
        TEMP_HIGH_THRESHOLD_SETTING("650100"),
        @SerializedName("650200")
        TEMP_LOW_THRESHOLD_SETTING("650200"),
        @SerializedName("650300")
        HUMI_HIGH_THRESHOLD_SETTING("650300"),
        @SerializedName("650400")
        HUMI_LOW_THRESHOLD_SETTING("650400"),
        @SerializedName("650500")
        CO2_HIGH_THRESHOLD_SETTING("650500"),
        @SerializedName("650600")
        CO_HIGH_THRESHOLD_SETTING("650600"),
        @SerializedName("650700")
        LIGHT_SENSING_PRECISION_SETTING("650700"),
        @SerializedName("650800")
        ILLUMINANCE_HIGH_THR_SETTING("650800"),
        @SerializedName("650900")
        ILLUMINANCE_LOW_THR_SETTING("650900"),
        @SerializedName("651000")
        IRRADIANCE_HIGH_THR_SETTING("651000"),
        @SerializedName("651100")
        IRRADIANCE_LOW_THR_SETTING("651100"),
        @SerializedName("651200")
        WIND_DIRECTION_UP_THR_SETTING("651200"),
        @SerializedName("651300")
        WIND_DIRECTION_DOWN_THR_SETTING("651300"),
        @SerializedName("651400")
        WIND_SPEED_HIGH_THR_SETTING("651400"),
        @SerializedName("651500")
        WIND_SPEED_LOW_THR_SETTING("651500"),
        @SerializedName("651600")
        PM25_HIGH_THR_SETTING("651600"),
        @SerializedName("651700")
        PM25_LOW_THR_SETTING("651700"),
        @SerializedName("651800")
        PIR_SENSITIVITY_SETTING("651800"),
        @SerializedName("651900")
        PIR_TRIGGER_INTERVAL_SETTING("651900"),
        @SerializedName("662001")
        ZIGBEE_SIGNAL_STRENGTH("662001"),
        @SerializedName("620800")
        DEVICE_LOCAL_IP_V4("620800"),
        @SerializedName("620900")
        DEVICE_LOCAL_PORT("620900"),
        @SerializedName("621000")
        DEVICE_LOCAL_PROTOCOL("621000"),
        @SerializedName("102100")
        CODE_102100("102100"),
        @SerializedName("100300")
        CODE_100300("100300"),

        //AIR CONTROLLER Lossnay
        @SerializedName("760900")
        CODE_760900("760900"),
        @SerializedName("761000")
        CODE_761000("761000"),
        @SerializedName("760100")
        CODE_760100("760100"),
        @SerializedName("760200")
        CODE_760200("760200"),
        @SerializedName("760300")
        CODE_760300("760300"),
        @SerializedName("760400")
        CODE_760400("760400"),
        @SerializedName("760500")
        CODE_760500("760500"),
        @SerializedName("760600")
        CODE_760600("760600"),
        @SerializedName("760700")
        CODE_760700("760700"),
        @SerializedName("760800")
        CODE_760800("760800"),

        //IPCAM
        @SerializedName("600100")
        DEVICE_ALIAS_NAME("600100"),
        @SerializedName("600200")
        DEVICE_BRAND_MODEL_TYPE("600200"),
        @SerializedName("600300")
        CONNECT_PASSWORD("600300"),
        @SerializedName("620700")
        CODE_620700("620700"),

        @SerializedName("IFA.POE")
        ATTR_POE("IFA.POE"),
        @SerializedName("IFA.TPS")
        ATTR_TPS("IFA.TPS"),
        @SerializedName("IFA.WOI")
        ATTR_WOI("IFA.WOI"),
        @SerializedName("IFA.MOI")
        ATTR_MOI("IFA.MOI"),

        DEFAULT("");

        private String code;

        WidgetAttr(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public static WidgetAttr getEnum(String value) {
            for (WidgetAttr widgetInfoCode : values()) {
                if (widgetInfoCode.getCode().equalsIgnoreCase(value)) {
                    return widgetInfoCode;
                }
            }
            return DEFAULT;
        }
    }

}
