package com.k911.barkline.service

import com.k911.barkline.model.VoiceAlertRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class VoiceAlertService(
    @Value("\${sinch.key}") private val sinchKey: String,
    @Value("\${sinch.secret}") private val sinchSecret: String,
    @Value("\${sinch.fromPhone}") private val fromPhone: String
) {

    private val sinchUrl = "https://calling.api.sinch.com/calling/v1/callouts"


    fun sendVoiceAlert(request: VoiceAlertRequest): String {
        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_JSON
            setBasicAuth(sinchKey, sinchSecret)
        }

        val payload = mapOf(
            "method" to "ttsCallout",
            "ttsCallout" to mapOf(
                "cli" to fromPhone,
                "destination" to mapOf("type" to "number", "endpoint" to request.toPhone),
                "domain" to "pstn",
                "locale" to "en-US",
                "text" to request.message
            )
        )
        val entity = HttpEntity(payload, headers)
        val restTemplate = RestTemplate()
        val response = restTemplate.postForEntity(sinchUrl, entity, String::class.java)
        return if (response.statusCode.is2xxSuccessful) {
            "Voice alert sent successfully"
        } else {
            throw RuntimeException("Failed to send voice alert: ${response.statusCode}")
        }
    }
}