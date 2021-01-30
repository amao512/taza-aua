package com.aslnstbk.tazaaua.common

class AirQualityManager {

    fun getQualityStatus(aquis: Int): Int {
        return when {
            compareAquis(aquis, AirQualityStatus.GOOD) -> AirQualityStatus.GOOD.status
            compareAquis(aquis, AirQualityStatus.MODERATE) -> AirQualityStatus.MODERATE.status
            compareAquis(aquis, AirQualityStatus.UNHEALTHY_SENSITIVE) -> AirQualityStatus.UNHEALTHY_SENSITIVE.status
            compareAquis(aquis, AirQualityStatus.UNHEALTHY) -> AirQualityStatus.UNHEALTHY.status
            compareAquis(aquis, AirQualityStatus.VERY_UNHEALTHY) -> AirQualityStatus.VERY_UNHEALTHY.status
            compareAquis(aquis, AirQualityStatus.HAZARDOUS) -> AirQualityStatus.HAZARDOUS.status
            else -> 0
        }
    }

    fun getQualityStatusDrawable(aquis: Int): Int {
        return when {
            compareAquis(aquis, AirQualityStatus.GOOD) -> AirQualityStatus.GOOD.drawable
            compareAquis(aquis, AirQualityStatus.MODERATE) -> AirQualityStatus.MODERATE.drawable
            compareAquis(aquis, AirQualityStatus.UNHEALTHY_SENSITIVE) -> AirQualityStatus.UNHEALTHY_SENSITIVE.drawable
            compareAquis(aquis, AirQualityStatus.UNHEALTHY) -> AirQualityStatus.UNHEALTHY.drawable
            compareAquis(aquis, AirQualityStatus.VERY_UNHEALTHY) -> AirQualityStatus.VERY_UNHEALTHY.drawable
            compareAquis(aquis, AirQualityStatus.HAZARDOUS) -> AirQualityStatus.HAZARDOUS.drawable
            else -> 0
        }
    }

    private fun compareAquis(
        aquis: Int,
        airQualityStatus: AirQualityStatus
    ): Boolean = aquis >= airQualityStatus.firstIndex && aquis <= airQualityStatus.lastIndex
}