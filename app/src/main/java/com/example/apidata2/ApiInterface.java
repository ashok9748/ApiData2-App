package com.example.apidata2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("users")
 Call<Pojo> getData();
}
