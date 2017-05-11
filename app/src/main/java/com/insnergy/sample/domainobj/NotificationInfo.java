/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample.domainobj;

public class NotificationInfo {

    public static final String PROPERTY = "NotificationInfo";

    private boolean isServer;
    private String title;
    private String body;
    private int icon;
    private int android_support_content_wakelockid;

    public NotificationInfo(String title, String body, boolean isServer, int android_support_content_wakelockid) {
        this.title = title;
        this.body = body;
        this.isServer = isServer;
        this.android_support_content_wakelockid = android_support_content_wakelockid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isServer() {
        return isServer;
    }

    public void setServer(boolean server) {
        isServer = server;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getAndroid_support_content_wakelockid() {
        return android_support_content_wakelockid;
    }

    public void setAndroid_support_content_wakelockid(int android_support_content_wakelockid) {
        this.android_support_content_wakelockid = android_support_content_wakelockid;
    }

    @Override
    public String toString() {
        return "NotificationInfo{" +
                "isServer=" + isServer +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", icon=" + icon +
                ", android_support_content_wakelockid=" + android_support_content_wakelockid +
                '}';
    }
}
