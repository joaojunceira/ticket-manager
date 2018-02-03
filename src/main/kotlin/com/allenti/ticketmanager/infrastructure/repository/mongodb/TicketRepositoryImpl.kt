package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.repository.TicketRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository


@Repository
interface TicketRepositoryImpl : TicketRepository, ReactiveMongoRepository<Ticket, Long>