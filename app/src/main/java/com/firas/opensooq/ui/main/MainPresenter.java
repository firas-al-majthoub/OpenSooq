package com.firas.opensooq.ui.main;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.firas.opensooq.WeatherApplication;
import com.firas.opensooq.data.db.DbHelper;
import com.firas.opensooq.data.db.model.weather.Weather;
import com.firas.opensooq.data.db.model.weather.WeatherInfo;
import com.firas.opensooq.data.network.RemoteDao;
import com.firas.opensooq.ui.base.BasePresenter;
import com.firas.opensooq.utils.ApiConstants;
import com.firas.opensooq.utils.AppConstants;
import com.firas.opensooq.utils.NetworkUtil;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter extends BasePresenter<MainMvp.View> implements MainMvp.Presenter {

    private static final String TAG = MainPresenter.class.getName();

    @Override
    public void getWeatherInfo(String cityName) {
        if (DbHelper.getInstance().getFirst(WeatherInfo.class, "city", cityName) != null) {
            updateObservableWeatherInfo(cityName);
        } else {
            updateWeatherInfo(cityName);
        }
    }

    @Override
    public void updateWeatherInfo(final String cityName) {
        final Context context = WeatherApplication.getInstance().getApplicationContext();
        if (NetworkUtil.isNetworkAvailable(context)) {
            RemoteDao dao = RemoteDao.getInstance();
            Call<WeatherInfo> call = dao.getWeatherInfo(AppConstants.getCityId(cityName), ApiConstants.APP_ID);

            call.enqueue(new Callback<WeatherInfo>() {
                @Override
                public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                    if (response.body() != null) {
                        WeatherInfo weatherInfo = response.body();
                        weatherInfo.setCity(cityName);
                        DbHelper.getInstance().insertOrUpdate(weatherInfo);
                        mView.displayWeatherInfo(weatherInfo);
                    }
                }

                @Override
                public void onFailure(Call<WeatherInfo> call, Throwable t) {
                }
            });
        }
    }

    private void updateObservableWeatherInfo(final String cityName) {
        getObservableWeatherInfo(cityName).subscribe(getObserver());
    }

    private Observable<WeatherInfo> getObservableWeatherInfo(String cityName) {
        return getLocalData(cityName);
    }

    public DisposableObserver<WeatherInfo> getObserver() {
        return new DisposableObserver<WeatherInfo>() {
            @Override
            public void onNext(@NonNull WeatherInfo weatherInfo) {
                Log.d(TAG, "OnNext" + weatherInfo);
                mView.displayWeatherInfo(weatherInfo);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG, "Error" + e);
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "Completed");
            }
        };
    }

    private Observable<WeatherInfo> getLocalData(final String cityName) {
        return Observable.create(new ObservableOnSubscribe<WeatherInfo>() {
            @Override
            public void subscribe(ObservableEmitter<WeatherInfo> emitter) throws Exception {
                WeatherInfo weatherInfo = DbHelper.getInstance().getFirst(WeatherInfo.class, "city", cityName);
                emitter.onNext(weatherInfo);
            }
        });
    }

}
