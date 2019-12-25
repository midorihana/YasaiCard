package com.example.yasaicard;

import android.app.Application;
import android.content.Context;

public class YasaiCardApp extends Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    public void onCreate() {
        super.onCreate();
        YasaiCardApp.context = getApplicationContext();
    }
}
