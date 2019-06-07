package com.example.dell.broadcastbestpractive;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    /**
     * 活动集合，暂存活动
     */
    static List<Activity> activities = new ArrayList<>();

    /**
     * 添加活动
     * @param activity
     */
    static void addActivity(Activity activity){
        activities.add(activity);
    }

    /**
     * 移除活动
     * @param activity
     */
    static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * finish 全部活动
     */
    static void finishAll(){
        for (Activity activity:activities) {
            if(!activity.isFinishing()){
                activity.finish();
            }

        }
    }
}
