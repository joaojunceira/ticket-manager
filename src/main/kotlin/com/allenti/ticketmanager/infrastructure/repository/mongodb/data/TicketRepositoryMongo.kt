package com.allenti.ticketmanager.infrastructure.repository.mongodb.data

import com.allenti.ticketmanager.infrastructure.repository.mongodb.entities.TicketEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketRepositoryMongo : ReactiveMongoRepository<TicketEntity, Long>