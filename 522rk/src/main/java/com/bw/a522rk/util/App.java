package com.bw.a522rk.util;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * date:2020/5/25
 * author:王成虎(13671)
 * month:五月
 * function:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
