package com.andmobi.myweather;

import android.app.Application;
import android.content.Context;

/**
 * Description:
 * Created by andmobi003 on 2016/8/3 15:52
 */
public class App extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }


}
