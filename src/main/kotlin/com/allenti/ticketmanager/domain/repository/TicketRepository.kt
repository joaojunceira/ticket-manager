package com.allenti.ticketmanager.domain.repository

import com.allenti.ticketmanager.domain.model.Tag
import com.allenti.ticketmanager.domain.model.Ticket
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


interface TicketRepository {
	fun create(ticket: Ticket): Mono<Ticket>
	fun get(id: Long): Mono<Ticket>
	fun getByName(name: String): Flux<Ticket>
	fun getByCustomer(customerId: Long): Flux<Ticket>
	fun getByTag(tags: Collection<Tag>): Flux<Ticket>
	fun update(ticket: Ticket): Mono<Ticket>
}