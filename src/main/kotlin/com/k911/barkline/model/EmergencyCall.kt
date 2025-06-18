package com.k911.barkline.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "emergency_calls")
data class EmergencyCall(
    @Id val id: String? = null,
    val callerName: String,
    val emergencyType: String,
    val species: String? = null,
    val priorityLevel: String,
    val testMode: Boolean,
    val timestamp: LocalDateTime = LocalDateTime.now(),
    val location: GeoPoint,
    val status: String = "routed",
    val dispatchCenter: String? = null
)

data class GeoPoint(
    val lat: Double,
    val lon: Double
)