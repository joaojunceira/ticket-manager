package com.allenti.ticketmanager.domain.service.ticket

import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.model.TicketState
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
interface TicketService {
	fun create(ticket: Ticket): Mono<Ticket>
	fun update(ticket: Ticket): Mono<Boolean>
	fun changeState(id: Long, state: TicketState): Mono<Boolean>
	fun delete(id: Long): Mono<Boolean>
}