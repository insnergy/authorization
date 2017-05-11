/*
 * Copyright (C) 2017 The InApi Project
 */
package com.insnergy.sample;

import android.app.Application;

import com.insnergy.sample.model.Constants;
import com.insnergy.sample.model.DataManager;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataManager.getInstance().init(Constants.Domain.MAIN, getApplicationContext());
    }

}
