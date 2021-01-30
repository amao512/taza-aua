package com.aslnstbk.tazaaua.common.data.models.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CurrentApiData(
    @JsonProperty("weather")
    val weather: WeatherApiData?,
    @JsonProperty("pollution")
    val pollution: PollutionApiData?
)