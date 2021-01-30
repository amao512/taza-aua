package com.aslnstbk.tazaaua.common.data.models.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class StatusApiData(
    @JsonProperty("status")
    val status: String?,
    @JsonProperty("data")
    val data: CityApiData?
)