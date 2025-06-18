package com.k911.barkline.controller

import com.k911.barkline.model.EmergencyCall
import com.k911.barkline.service.EmergencyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/emergency")
class EmergencyController(
    private val emergencyService: EmergencyService
) {

    @PostMapping("/report")
    fun reportEmergency(
        @RequestParam caller: String,
        @RequestParam type: String,
        @RequestParam lat: Double,
        @RequestParam lon: Double
    ): ResponseEntity<EmergencyCall> {
        val saved = emergencyService.handleCall(caller, type, lat, lon)
        return ResponseEntity.ok(saved)
    }

    @GetMapping("/calls")
    fun getAllCalls(): ResponseEntity<List<EmergencyCall>> {
        val allCalls = emergencyService.getAllCalls()
        return ResponseEntity.ok(allCalls)
    }
}