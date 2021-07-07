package com.text.huiShopping;

import android.app.Application;
import android.content.Context;



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
    }

}
