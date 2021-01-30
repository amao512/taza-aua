package com.aslnstbk.tazaaua.utils.mappers

import com.aslnstbk.tazaaua.common.data.models.WeatherData
import com.aslnstbk.tazaaua.common.data.models.api.WeatherApiData

class WeatherApiDataMapper {

    fun map(weatherApiData: WeatherApiData?): WeatherData {
        return WeatherData(
            ts = weatherApiData?.ts ?: EMPTY_STRING,
            tp = weatherApiData?.tp ?: DEFAULT_INT,
            pr = weatherApiData?.pr ?: DEFAULT_INT,
            hu = weatherApiData?.hu ?: DEFAULT_INT,
            ws = weatherApiData?.ws ?: DEFAULT_INT,
            wd = weatherApiData?.wd ?: DEFAULT_INT,
            ic = weatherApiData?.ic ?: EMPTY_STRING
        )
    }
}