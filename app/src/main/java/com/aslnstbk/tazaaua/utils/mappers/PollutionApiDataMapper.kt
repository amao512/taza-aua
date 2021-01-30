package com.aslnstbk.tazaaua.utils.mappers

import com.aslnstbk.tazaaua.common.data.models.PollutionData
import com.aslnstbk.tazaaua.common.data.models.api.PollutionApiData

class PollutionApiDataMapper {

    fun map(pollutionApiData: PollutionApiData?): PollutionData {
        return PollutionData(
            ts = pollutionApiData?.ts ?: EMPTY_STRING,
            aqius = pollutionApiData?.aqius ?: DEFAULT_INT,
            mainus = pollutionApiData?.mainus ?: EMPTY_STRING,
            aqicn = pollutionApiData?.aqicn ?: DEFAULT_INT,
            maincn = pollutionApiData?.maincn ?: EMPTY_STRING
        )
    }
}