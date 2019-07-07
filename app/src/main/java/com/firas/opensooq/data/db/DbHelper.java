package com.firas.opensooq.data.db;

import com.firas.opensooq.WeatherApplication;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmResults;

public class DbHelper {

    private static volatile DbHelper instance;
    private static Realm realm;

    private DbHelper() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static DbHelper getInstance() {
        if (instance == null) {
            synchronized (DbHelper.class) {
                if (instance == null) {
                    realm = WeatherApplication.getInstance().getRealm();
                    instance = new DbHelper();
                }
            }
        }
        return instance;
    }

    public <T extends RealmModel> RealmResults<T> getAll(Class<T> clazz) {
        return realm.where(clazz).findAll();
    }

    public <T extends RealmModel> T getFirst(Class<T> clazz, String col, String value) {
        return realm.where(clazz).equalTo(col, value).findFirst();
    }

    public <T extends RealmModel> void insertOrUpdate(List<T> clazz) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(clazz);
        realm.commitTransaction();
    }

    public <T extends RealmModel> void insertOrUpdate(T clazz) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(clazz);
        realm.commitTransaction();
    }

}
