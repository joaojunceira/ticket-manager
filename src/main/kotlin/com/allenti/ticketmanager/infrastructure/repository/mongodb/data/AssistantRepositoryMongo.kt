package com.allenti.ticketmanager.infrastructure.repository.mongodb.data

import com.allenti.ticketmanager.domain.model.Assistant
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AssistantRepositoryMongo : ReactiveMongoRepository<Assistant, Long>