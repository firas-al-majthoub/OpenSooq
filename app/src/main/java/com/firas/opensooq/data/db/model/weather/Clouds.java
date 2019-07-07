package com.firas.opensooq.data.db.model.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Clouds extends RealmObject {
    @SerializedName("all")
    @Expose
    private Integer all;


    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }
}
