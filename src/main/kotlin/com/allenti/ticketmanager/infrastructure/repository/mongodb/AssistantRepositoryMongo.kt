package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.repository.AssistantRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AssistantRepositoryMongo : AssistantRepository, ReactiveMongoRepository<Assistant, Long>