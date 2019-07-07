package com.firas.opensooq.data.network;

import com.firas.opensooq.data.db.model.weather.WeatherInfo;
import com.firas.opensooq.utils.ApiConstants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {

    @GET(ApiConstants.GET_WEATHER)
    Call<WeatherInfo> getWeatherInfo(@Query("id") int cityId, @Query("appid") String appid);
}
