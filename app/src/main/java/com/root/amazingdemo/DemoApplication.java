package com.root.amazingdemo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;


import com.root.amazingdemo.utils.LogUtil;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by CrosX on 2017/9/27.
 */

public class DemoApplication extends Application {

    private static DemoApplication sInstance = null;

    private static List<Activity> sActivities = Collections.synchronizedList(new LinkedList<Activity>());


    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        registerActivityListener();
        LogUtil.init(true);
    }

    public static DemoApplication getInstance() {
        return sInstance;
    }

    /**
     * 添加activity
     *
     * @param activity
     */
    public void pushActivity(Activity activity) {
        sActivities.add(activity);
        LogUtil.i("push: " + activity.getClass().getSimpleName());
    }

    /**
     * 删除activity
     *
     * @param activity
     */
    public void popActivity(Activity activity) {
        sActivities.remove(activity);
        LogUtil.i("pop: " + activity.getClass().getSimpleName());
    }

    /**
     * 获取当前栈顶activity
     *
     * @return
     */
    public static Activity getCurrentActivity() {
        if (sActivities.size() == 0) {
            return null;
        } else {
            return sActivities.get(sActivities.size() - 1);
        }
    }

    /**
     * 结束当前activity
     */
    public static void finishCurrentActivity() {
        if (sActivities.isEmpty()) {
            return;
        }
        finishActivity(sActivities.get(sActivities.size() - 1));
    }

    /**
     * 结束指定activity
     *
     * @param activity
     */
    public static void finishActivity(Activity activity) {
        if (sActivities.isEmpty()) {
            return;
        }

        if (activity != null) {
            sActivities.remove(activity);
            activity.finish();
        }
        LogUtil.i("finish: " + activity.getClass().getSimpleName());

    }

    /**
     * 按照类名结束activity
     *
     * @param cls
     */
    public static void finishActivity(Class<?> cls) {
        if (sActivities.isEmpty()) {
            return;
        }
        for (Activity activity : sActivities) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }

    /**
     * 结束所有activity
     */
    public static void finishAllActivity() {
        for (Activity activity : sActivities) {
            activity.finish();
        }
        sActivities.clear();
        LogUtil.i("finishAllActivity,the size is :" + sActivities.size());
    }

    public static void appExit() {
        try {
            finishAllActivity();
            System.exit(0);
        } catch (Exception e) {
            LogUtil.e(e);
        }
    }

    /**
     * 注册activity管理监听
     */
    private void registerActivityListener() {

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                /**
                 *  监听到 Activity创建事件 将该 Activity 加入list
                 */
                pushActivity(activity);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                if (null == sActivities && sActivities.isEmpty()) {
                    return;
                }
                if (sActivities.contains(activity)) {
                    /**
                     *  监听到 Activity销毁事件 将该Activity 从list中移除
                     */
                    popActivity(activity);
                }
            }
        });

    }


}
