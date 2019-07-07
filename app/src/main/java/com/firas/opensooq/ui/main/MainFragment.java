package com.firas.opensooq.ui.main;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.firas.opensooq.R;
import com.firas.opensooq.data.db.model.weather.WeatherInfo;
import com.firas.opensooq.ui.base.BaseFragment;
import com.firas.opensooq.utils.AppConstants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends BaseFragment<MainMvp.Presenter> implements MainMvp.View {

    private static final String TAG = MainFragment.class.getName();
    private static final String ARG_SECTION_NUMBER = "section_number";

    private int index;
    private ImageView imageViewWeatherIcon;
    private TextView textViewWeatherStat;
    private TextView textViewTemperature;
    private TextView textViewMinTemperature;
    private TextView textViewMaxTemperature;
    private TextView textViewHumidity;
    private TextView textViewWindSpeed;
    private FloatingActionButton fab;

    public static MainFragment newInstance(int index) {
        MainFragment fragment = new MainFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        initUi(root);
        getWeatherInfo();

        return root;
    }

    private void getWeatherInfo() {
        switch (index) {
            case 1:
                mPresenter.getWeatherInfo(AppConstants.AMMAN);
                break;
            case 2:
                mPresenter.getWeatherInfo(AppConstants.IRBID);
                break;
            case 3:
                mPresenter.getWeatherInfo(AppConstants.AQABA);
                break;
        }
    }

    private void updateWeatherInfo() {
        switch (index) {
            case 1:
                mPresenter.updateWeatherInfo(AppConstants.AMMAN);
                break;
            case 2:
                mPresenter.updateWeatherInfo(AppConstants.IRBID);
                break;
            case 3:
                mPresenter.updateWeatherInfo(AppConstants.AQABA);
                break;
        }
    }

    private void initUi(View root) {
        fab = root.findViewById(R.id.fabRefresh);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateWeatherInfo();
            }
        });
        imageViewWeatherIcon = root.findViewById(R.id.imageViewWeatherIcon);
        textViewWeatherStat = root.findViewById(R.id.textViewWeatherStat);
        textViewTemperature = root.findViewById(R.id.textViewTemperature);
        textViewMinTemperature = root.findViewById(R.id.textViewMinTemperature);
        textViewMaxTemperature = root.findViewById(R.id.textViewMaxTemperature);
        textViewHumidity = root.findViewById(R.id.textViewHumidity);
        textViewWindSpeed = root.findViewById(R.id.textViewWindSpeed);
    }

    @Override
    public void initPresenter() {
        buildMVP(this, new MainPresenter());
    }

    @Override
    public void displayWeatherInfo(WeatherInfo weatherInfo) {
        Glide.with(getActivity().getApplicationContext()).load("http://openweathermap.org/img/wn/" + weatherInfo.getWeather().get(0).getIcon() + "@2x.png").into(imageViewWeatherIcon);
        textViewWeatherStat.setText(weatherInfo.getWeather().get(0).getDescription());
        textViewTemperature.setText(Html.fromHtml("<b>" + kelvinToCelsius(weatherInfo.getMain().getTemp()) + "</b><small><sup>o</sup></small>C"));
        textViewMinTemperature.setText(Html.fromHtml("<b>" + kelvinToCelsius(weatherInfo.getMain().getTempMin()) + "</b><small><sup>o</sup></small>"));
        textViewMaxTemperature.setText(Html.fromHtml("<b>" + kelvinToCelsius(weatherInfo.getMain().getTempMax()) + "</b><small><sup>o</sup></small>"));
        String humidity = weatherInfo.getMain().getHumidity() + getResources().getString(R.string.humidity_unit);
        textViewHumidity.setText(humidity);
        String windSpeed = weatherInfo.getWind().getSpeed() + getResources().getString(R.string.wind_speed_unit);
        textViewWindSpeed.setText(windSpeed);
    }

    private int kelvinToCelsius(double kelvin) {
        return (int) (kelvin - 273.15);
    }

}