package com.k911.barkline.controller

import com.k911.barkline.model.VoiceAlertRequest
import com.k911.barkline.service.VoiceAlertService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class VoiceAlertController(val voiceAlertService: VoiceAlertService) {

    @PostMapping("/voice-alert")
    fun triggerVoiceAlert(@RequestBody request: VoiceAlertRequest): ResponseEntity<Map<String, String>> {
        val message = voiceAlertService.sendVoiceAlert(request)
        return ResponseEntity.ok(mapOf("status" to "queued","message" to message))
    }
}