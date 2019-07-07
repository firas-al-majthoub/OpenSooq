package com.firas.opensooq.data.network;

import com.firas.opensooq.utils.ApiConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static volatile Retrofit retrofit;

    private RetrofitClientInstance() {
        if (retrofit != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            synchronized (RetrofitClientInstance.class) {
                if (retrofit == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    OkHttpClient okHttpClient = builder.build();

                    retrofit = new Retrofit.Builder()
                            .baseUrl(ApiConstants.BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(okHttpClient)
                            .build();
                }
            }
        }
        return retrofit;
    }

}
