package com.akamahesh.firebaseninza.authappexample;

import android.app.Application;
import android.support.multidex.MultiDexApplication;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by akaMahesh on 23/3/18.
 * Copyright to Mobulous Technology Pvt. Ltd.
 */

public class ApplicationManager extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }


}
