package com.whw.demo.netwok;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseApi {
    private final static String BASE_URL = "https://api.github.com";

    private static Retrofit gRetrofit;

    public static Retrofit getDefault(){
        if (gRetrofit == null){
            gRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return gRetrofit;
    }

}
