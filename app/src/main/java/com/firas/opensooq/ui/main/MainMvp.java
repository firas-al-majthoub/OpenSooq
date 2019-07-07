package com.firas.opensooq.ui.main;

import com.firas.opensooq.data.db.model.weather.WeatherInfo;
import com.firas.opensooq.ui.base.BaseMvp;

public interface MainMvp {
    interface Presenter extends BaseMvp.Presenter {
        void getWeatherInfo(String cityName);
        void updateWeatherInfo(String cityName);
    }

    interface View extends BaseMvp.View {
        void displayWeatherInfo(WeatherInfo weatherInfo);
    }
}
