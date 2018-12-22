package com.finki.dimitri.labpizzas.web;

import com.finki.dimitri.labpizzas.model.ApiSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GooglePlacesApi {

    @GET("json")
    Call<ApiSearchResult> getNearbyPlaces(@Query("type") String placeType,
                                          @Query("radius") String radius,
                                          @Query("location") String location,
                                          @Query("key") String apiKey);
}