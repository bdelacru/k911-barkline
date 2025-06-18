package com.k911.barkline.repository

import com.k911.barkline.model.EmergencyCall
import org.springframework.data.mongodb.repository.MongoRepository

interface EmergencyCallRepository : MongoRepository<EmergencyCall, String> {
}