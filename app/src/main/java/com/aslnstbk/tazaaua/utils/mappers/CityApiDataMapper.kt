package com.aslnstbk.tazaaua.utils.mappers

import com.aslnstbk.tazaaua.common.data.models.CityData
import com.aslnstbk.tazaaua.common.data.models.api.CityApiData

class CityApiDataMapper(
    private val currentApiDataMapper: CurrentApiDataMapper
) {

    fun map(cityApiData: CityApiData?): CityData {
        return CityData(
            city = cityApiData?.city ?: EMPTY_STRING,
            state = cityApiData?.state ?: EMPTY_STRING,
            country = cityApiData?.country ?: EMPTY_STRING,
            current = currentApiDataMapper.map(cityApiData?.current)
        )
    }
}