package com.aslnstbk.tazaaua.home.data

import com.aslnstbk.tazaaua.common.data.models.StatusData
import com.aslnstbk.tazaaua.common.data.models.api.StatusApiData
import com.aslnstbk.tazaaua.home.domain.HomeRepository
import com.aslnstbk.tazaaua.utils.mappers.ResponseApiDataMapper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DefaultHomeRepository(
    private val homeApiService: HomeApiService,
    private val responseApiDataMapper: ResponseApiDataMapper
) : HomeRepository {

    override fun getCity(
        country: String,
        state: String,
        city: String,
        result: (StatusData) -> Unit,
        fail: (String) -> Unit
    ) {
        homeApiService.getCity(country, state, city).enqueue(object : Callback<StatusApiData> {
            override fun onResponse(
                call: Call<StatusApiData>,
                status: Response<StatusApiData>
            ) {
                if (status.isSuccessful){
                    val statusData: StatusData = responseApiDataMapper.map(status.body())

                    result(statusData)
                } else {
                    fail(status.message())
                }
            }

            override fun onFailure(call: Call<StatusApiData>, t: Throwable) {
                fail(t.localizedMessage)
            }
        })
    }
}