package com.aslnstbk.tazaaua.common.data.models.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PollutionApiData(
    @JsonProperty("ts")
    val ts: String?,
    @JsonProperty("aqius")
    val aqius: Int?,
    @JsonProperty("mainus")
    val mainus: String?,
    @JsonProperty("aqicn")
    val aqicn: Int?,
    @JsonProperty("maincn")
    val maincn: String?
)