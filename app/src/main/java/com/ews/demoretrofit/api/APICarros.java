package com.ews.demoretrofit.api;

import com.ews.demoretrofit.model.Carro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by wallace on 19/06/17.
 */
public interface APICarros {

    @POST("/v2/594bd0fe1200005b12424be1")
    Call<String> salvar(@Body Carro carro);

    @GET("/v2/594bd0fe1200005b12424be1")
    Call<List<Carro>> listarTodos();

}
