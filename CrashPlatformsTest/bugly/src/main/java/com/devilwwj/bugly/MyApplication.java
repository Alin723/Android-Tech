package com.devilwwj.bugly;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * com.devilwwj.bugly
 * Created by devilwwj on 16/7/3.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        long start = System.currentTimeMillis();
        CrashReport.initCrashReport(this.getApplicationContext(), "900037672", true);
        long end = System.currentTimeMillis();
        Log.e("time:", (end - start) + "");
    }
}
