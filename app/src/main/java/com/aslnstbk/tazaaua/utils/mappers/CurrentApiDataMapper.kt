package com.aslnstbk.tazaaua.utils.mappers

import com.aslnstbk.tazaaua.common.data.models.CurrentData
import com.aslnstbk.tazaaua.common.data.models.api.CurrentApiData

class CurrentApiDataMapper(
    private val weatherApiDataMapper: WeatherApiDataMapper,
    private val pollutionApiDataMapper: PollutionApiDataMapper
) {

    fun map(currentApiData: CurrentApiData?): CurrentData {
        return CurrentData(
            weather = weatherApiDataMapper.map(currentApiData?.weather),
            pollution = pollutionApiDataMapper.map(currentApiData?.pollution)
        )
    }
}