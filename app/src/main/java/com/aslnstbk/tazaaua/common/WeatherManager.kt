package com.aslnstbk.tazaaua.common

import com.aslnstbk.tazaaua.R
import com.aslnstbk.tazaaua.common.data.models.WeatherData

const val TEMPERATURE_TEXT_FORMAT = "%s°C"

class WeatherManager {

    fun getWeatherTemperature(weather: WeatherData): String {
        return TEMPERATURE_TEXT_FORMAT.format(weather.tp)
    }

    fun getWeatherIcon(weather: WeatherData): Int {
        return when (weather.ic) {
            "01d" -> R.drawable.ic_sun
            "01n" -> R.drawable.ic_moon
            "02d" -> R.drawable.ic_cloudy
            "02n" -> R.drawable.ic_cloud
            "03d" -> R.drawable.ic_cloud
            "04d" -> R.drawable.ic_broken_clouds
            "09d" -> R.drawable.ic_rain
            "10d" -> R.drawable.ic_rain
            "10n" -> R.drawable.ic_rain
            "11d" -> R.drawable.ic_thunderstorm
            "13d" -> R.drawable.ic_snowflake
            "50d" -> R.drawable.ic_mist
            else -> R.drawable.ic_cloud
        }
    }
}