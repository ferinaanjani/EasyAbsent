package com.example.cx62.rpk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.FormUrlEncoded;

public interface API {


    @GET("getAllAbsen/{id}")
    Call<ResponBody> getAllAbsen(@Path("id") String id);

    @FormUrlEncoded
    @POST("login")
    Call<ResponBodyKaryawan> login (
            @Field("NIK") String NIK,
            @Field("Password") String Password,
            @Field("Device_ID") String Device_ID
    );

    @FormUrlEncoded
    @POST("register")
    Call<ResponBodyRegister> register(
      @Field("name") String name,
      @Field("nik") String nik,
      @Field("dev_id") String dev_id,
      @Field("password") String password
    );

}
