package com.allenti.ticketmanager.infrastructure.repository.mongodb.data

import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.repository.TicketRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketRepositoryMongo : TicketRepository, ReactiveMongoRepository<Ticket, Long>