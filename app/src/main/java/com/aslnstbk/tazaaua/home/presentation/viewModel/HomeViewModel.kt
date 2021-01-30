package com.aslnstbk.tazaaua.home.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aslnstbk.tazaaua.common.data.model.ProgressState
import com.aslnstbk.tazaaua.common.data.model.ResponseData
import com.aslnstbk.tazaaua.common.data.models.CityData
import com.aslnstbk.tazaaua.home.domain.HomeRepository

class HomeViewModel(
    private val homeRepository: HomeRepository
) : ViewModel() {

    val cityLiveData: MutableLiveData<ResponseData<CityData, String>> = MutableLiveData()
    val progressLiveData: MutableLiveData<ProgressState> = MutableLiveData()

    fun onStart(
        country: String,
        state: String,
        city: String
    ){
        progressLiveData.value = ProgressState.Loading

        getCity(country, state, city)
    }

    private fun getCity(
        country: String,
        state: String,
        city: String
    ) {
        homeRepository.getCity(country, state, city,
            result = {
                cityLiveData.value = ResponseData.Success(it.data)
                progressLiveData.value = ProgressState.Done
            },
            fail = {
                cityLiveData.value = ResponseData.Error(it)
                progressLiveData.value = ProgressState.Done
            }
        )
    }
}