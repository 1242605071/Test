package com.text.huiShopping;

import android.app.Application;
import android.content.Context;

import com.imgsdk.cameralibrary.CameraSnap;

/**
 * @Description:
 * @Author: zheng
 */
public class App extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        CameraSnap.initApplication(this);
    }

}
