package com.aslnstbk.tazaaua.home.data

import com.aslnstbk.tazaaua.common.data.models.api.StatusApiData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApiService {

    @GET("v2/city")
    fun getCity(
        @Query("country") country: String,
        @Query("state") state: String,
        @Query("city") city: String
    ): Call<StatusApiData>
}