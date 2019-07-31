package com.example.cx62.rpk;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    String BASE_URL = "http://192.168.43.106/Laravel/pkl/public/api/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;


    public RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if (mInstance == null){
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public API getAPI(){
        return retrofit.create(API.class);
    }
}
