package com.example.contego.lifecycle;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class MainApplication extends Application {

    public String TAG = "MainApplication";

    public MainApplication() {
        super();
        Log.i(TAG, "constructor");
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate");
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        Log.i(TAG, "onTerminate");
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.i(TAG, "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        Log.i(TAG, "onLowMemory");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.i(TAG, "onTrimMemory");
        super.onTrimMemory(level);
    }
}
