package com.sipingenieria.prueba.api;

import com.sipingenieria.prueba.modelo.SipIngenierium;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/pipn/datos/ejemplo_json1")
    Call<List<SipIngenierium>> getAllSipIngenierium();
}
