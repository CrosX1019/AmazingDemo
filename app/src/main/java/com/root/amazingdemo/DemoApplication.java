package com.root.amazingdemo;

import android.app.Application;

/**
 * Created by CrosX on 2017/9/27.
 */

public class DemoApplication extends Application{

    private static DemoApplication instance = null;

    public static DemoApplication getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
