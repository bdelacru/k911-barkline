package com.k911.barkline.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ChicagoCrime(
    @JsonProperty("primary_type") val type: String?,
    @JsonProperty("date") val date: String?,
    @JsonProperty("location_description") val locationDescription: String?,
    @JsonProperty("latitude") val latitude: Double?,
    @JsonProperty("longitude") val longitude: Double?
)
