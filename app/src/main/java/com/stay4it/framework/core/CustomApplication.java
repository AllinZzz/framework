package com.stay4it.framework.core;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Stay on 2/2/16.
 * Powered by www.stay4it.com
 */
public class CustomApplication extends Application {
    public static ArrayList<String> mTestNullPointers;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
