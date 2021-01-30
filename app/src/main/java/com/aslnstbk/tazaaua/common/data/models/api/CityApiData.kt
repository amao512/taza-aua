package com.aslnstbk.tazaaua.common.data.models.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CityApiData(
    @JsonProperty("city")
    val city: String?,
    @JsonProperty("state")
    val state: String?,
    @JsonProperty("country")
    val country: String?,
    @JsonProperty("current")
    val current: CurrentApiData?
)