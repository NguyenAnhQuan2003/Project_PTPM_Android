package com.example.project_ptpm_android;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Chạy 1 lần duy nhất khi app khởi động
        Log.d("MyApplication", "App started!");
    }
}
