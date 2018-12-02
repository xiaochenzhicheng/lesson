package com.example.zhaomeng.app.util;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static com.example.zhaomeng.app.BuildConfig.DEBUG;

public class ActivityCollector {
    private static final String TAG = ActivityCollector.class.getSimpleName();
    public static List<Activity> sActivities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        sActivities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        sActivities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : sActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        if (DEBUG) {
            Log.i(TAG, "pid:" + android.os.Process.myPid());
        }
//        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
