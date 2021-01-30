package com.aslnstbk.tazaaua.home.presentation

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.aslnstbk.tazaaua.R
import com.aslnstbk.tazaaua.common.AirQualityManager
import com.aslnstbk.tazaaua.common.WeatherManager
import com.aslnstbk.tazaaua.common.data.model.ResponseData
import com.aslnstbk.tazaaua.common.data.models.CityData
import com.aslnstbk.tazaaua.home.presentation.viewModel.HomeViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val homeViewModel: HomeViewModel by viewModel()
    private val airQualityManager: AirQualityManager by inject()
    private val weatherManager: WeatherManager by inject()

    private lateinit var cardView: View
    private lateinit var cityNameTextView: TextView
    private lateinit var stateAndCountryNameTextView: TextView
    private lateinit var temperatureTextView: TextView
    private lateinit var weatherIconImageView: ImageView
    private lateinit var airQualityIndexTextView: TextView
    private lateinit var airQualityStatusNameTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.onStart(
            country = "USA",
            state = "California",
            city = "San-Francisco"
        )

        initViews(view)
        observeLiveData()
    }

    private fun initViews(view: View) {
        cardView = view.findViewById(R.id.fragment_home_air_quality_card)
        cityNameTextView = view.findViewById(R.id.fragment_home_city_name)
        stateAndCountryNameTextView = view.findViewById(R.id.fragment_home_city_state_and_country_name)
        temperatureTextView = view.findViewById(R.id.fragment_home_weather_temperature)
        weatherIconImageView = view.findViewById(R.id.fragment_home_weather_image)
        airQualityIndexTextView = view.findViewById(R.id.fragment_home_air_quality_index)
        airQualityStatusNameTextView = view.findViewById(R.id.fragment_home_air_quality_status_name)
    }

    private fun observeLiveData() {
        homeViewModel.cityLiveData.observe(viewLifecycleOwner, ::handleCity)
    }

    private fun handleCity(responseData: ResponseData<CityData, String>) {
        when (responseData) {
            is ResponseData.Success -> fillCityData(responseData.result)
            is ResponseData.Error -> {}
        }
    }

    private fun fillCityData(result: CityData) {
        val aquis: Int = result.current.pollution.aqius

        cardView.setBackgroundResource(airQualityManager.getQualityStatusDrawable(aquis))
        cityNameTextView.text = result.city
        stateAndCountryNameTextView.text = "${result.state}, ${result.country}"
        temperatureTextView.text = weatherManager.getWeatherTemperature(result.current.weather)
        weatherIconImageView.setImageResource(weatherManager.getWeatherIcon(result.current.weather))
        airQualityIndexTextView.text = aquis.toString()
        airQualityStatusNameTextView.text = getString(airQualityManager.getQualityStatus(aquis))
    }
}