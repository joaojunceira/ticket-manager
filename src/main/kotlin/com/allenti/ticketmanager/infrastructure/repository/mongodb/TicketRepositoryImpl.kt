package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Tag
import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.repository.TicketRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


class TicketRepositoryImpl: TicketRepository {
    override fun create(ticket: Ticket): Mono<Ticket> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: Long): Mono<Ticket> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String): Flux<Ticket> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByCustomer(customerId: Long): Flux<Ticket> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByTag(tags: List<Tag>): Flux<Ticket> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}