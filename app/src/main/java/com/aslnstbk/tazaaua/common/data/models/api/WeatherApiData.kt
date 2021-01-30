package com.aslnstbk.tazaaua.common.data.models.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class WeatherApiData(
    @JsonProperty("ts")
    val ts: String?,
    @JsonProperty("tp")
    val tp: Int?,
    @JsonProperty("pr")
    val pr: Int?,
    @JsonProperty("hu")
    val hu: Int?,
    @JsonProperty("ws")
    val ws: Int?,
    @JsonProperty("wd")
    val wd: Int?,
    @JsonProperty("ic")
    val ic: String?
)