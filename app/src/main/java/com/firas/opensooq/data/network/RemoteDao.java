package com.firas.opensooq.data.network;

import com.firas.opensooq.data.db.model.weather.WeatherInfo;

import retrofit2.Call;

public class RemoteDao {
    private static RemoteDao instance;
    private GetDataService service;

    private RemoteDao() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
    }

    public static RemoteDao getInstance() {
        if (instance == null) {
            synchronized (RemoteDao.class) {
                if (instance == null) {
                    instance = new RemoteDao();
                }
            }
        }

        return instance;
    }

    public Call<WeatherInfo> getWeatherInfo(int cityId, String appId) {
        return service.getWeatherInfo(cityId, appId);
    }

}
