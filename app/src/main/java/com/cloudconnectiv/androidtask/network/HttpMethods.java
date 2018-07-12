package com.cloudconnectiv.androidtask.network;

import com.cloudconnectiv.androidtask.model.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mohammad Johar on 7/11/2018.
 */
public interface HttpMethods {

    String SERVERS_API_METHOD = "machine";

    @GET(SERVERS_API_METHOD)
    Call<BaseModel> getServers(@Query("page") int page, @Query("size") int size);
}
