package com.aslnstbk.tazaaua.utils.mappers

import com.aslnstbk.tazaaua.common.data.models.StatusData
import com.aslnstbk.tazaaua.common.data.models.api.StatusApiData

const val EMPTY_STRING = ""
const val DEFAULT_INT = 0

class ResponseApiDataMapper(
    private val cityApiDataMapper: CityApiDataMapper
) {

    fun map(statusApiData: StatusApiData?): StatusData {
        return StatusData(
            status = statusApiData?.status ?: EMPTY_STRING,
            data = cityApiDataMapper.map(statusApiData?.data)
        )
    }
}