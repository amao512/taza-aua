package com.aslnstbk.tazaaua.common

import com.aslnstbk.tazaaua.R

enum class AirQualityStatus(
    val status: Int,
    val firstIndex: Int,
    val lastIndex: Int,
    val drawable: Int
) {
    GOOD(
        status = R.string.air_quality_status_good,
        firstIndex = 0,
        lastIndex = 50,
        drawable = R.drawable.bg_good_quality_card
    ),
    MODERATE(
        status = R.string.air_quality_status_moderate,
        firstIndex = 51,
        lastIndex = 100,
        drawable = R.drawable.bg_moderate_quality_card
    ),
    UNHEALTHY_SENSITIVE(
        status = R.string.air_quality_status_unhealthy_sensitive,
        firstIndex = 101,
        lastIndex = 150,
        drawable = R.drawable.bg_unhealthy_sensitive_quality_card
    ),
    UNHEALTHY(
        status = R.string.air_quality_status_unhealthy,
        firstIndex = 151,
        lastIndex = 200,
        drawable = R.drawable.bg_unhealthy_quality_card
    ),
    VERY_UNHEALTHY(
        status = R.string.air_quality_status_very_unhealthy,
        firstIndex = 201,
        lastIndex = 300,
        drawable = R.drawable.bg_very_unhealthy_quality_card
    ),
    HAZARDOUS(
        status = R.string.air_quality_status_hazardous,
        firstIndex = 301,
        lastIndex = 500,
        drawable = R.drawable.bg_hazardous_quality_card
    )
}