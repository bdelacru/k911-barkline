package com.k911.barkline.controller

import com.k911.barkline.model.ChicagoCrime
import com.k911.barkline.service.ChicagoCrimeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/chicago")
class ChicagoCrimeController(
    private val chicagoCrimeService: ChicagoCrimeService
) {

    @GetMapping("/recent-crimes")
    fun getCrimes(
        @RequestParam(defaultValue = "10") limit: Int,
        @RequestParam(required = false) type: String?
    ): ResponseEntity<List<ChicagoCrime>> {
        val crimes = chicagoCrimeService.fetchRecentCrimes(limit, type)
        return ResponseEntity.ok(crimes)
    }
}