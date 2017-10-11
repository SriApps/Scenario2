package com.example.srikanth.sampleapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Srikanth 
 */

public interface RetrofitApiService {
           /*
        Retrofit get annotation with our URL
       */
        @GET("/sample.json")
        Call<ArrayList<jsonData>> getMyJSON();
    }

