package com.k911.barkline.service
import com.k911.barkline.model.EmergencyCall
import com.k911.barkline.model.GeoPoint
import com.k911.barkline.repository.EmergencyCallRepository
import org.springframework.stereotype.Service

@Service
class EmergencyService(
    private val emergencyCallRepository: EmergencyCallRepository
) {
    fun handleCall(callerName: String, type: String, lat: Double, lon: Double): EmergencyCall {
        val call = EmergencyCall(
            callerName = callerName,
            emergencyType = type,
            priorityLevel = "bark",
            testMode = true,
            location = GeoPoint(lat, lon)
        )
        return emergencyCallRepository.save(call)
    }
    fun getAllCalls(): List<EmergencyCall> = emergencyCallRepository.findAll()

}