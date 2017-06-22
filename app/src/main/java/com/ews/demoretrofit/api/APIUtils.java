package com.ews.demoretrofit.api;

/**
 * Created by wallace on 19/06/17.
 */
public class APIUtils {

    private APIUtils(){}

    public static final String BASE_URL = "http://www.mocky.io";

    public static APICarros getAPICarros() {
        return RetrofitClient.getClient(BASE_URL).create(APICarros.class);
    }

}
