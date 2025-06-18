package com.k911.barkline.service

import com.k911.barkline.model.ChicagoCrime
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder


@Service
class ChicagoCrimeService(
    private val restTemplate: RestTemplate = RestTemplate()
) {
    private val baseUrl = "https://data.cityofchicago.org/resource/ijzp-q8t2.json"

    fun fetchRecentCrimes(limit: Int = 10, type: String? = null): List<ChicagoCrime> {
        val uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
            .queryParam("\$limit", limit)
            .apply {
                if (!type.isNullOrBlank()) {
                    queryParam("primary_type", type)
                }
            }
            .build().toUri()

        val response: ResponseEntity<List<ChicagoCrime>> = restTemplate.exchange(
            uri,
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<List<ChicagoCrime>>() {}
        )

        return response.body ?: emptyList()
    }
}