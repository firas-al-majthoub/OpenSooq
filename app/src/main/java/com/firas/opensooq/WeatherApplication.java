package com.firas.opensooq;

import android.app.Application;

import com.firas.opensooq.ui.main.MainActivity;

import io.realm.Realm;

public class WeatherApplication extends Application {

    private static final String TAG = MainActivity.class.getName();
    private static WeatherApplication instance;

    public static WeatherApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Realm.init(this);
    }

    public Realm getRealm() {
        return Realm.getDefaultInstance();
    }

}
