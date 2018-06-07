package com.allenti.ticketmanager.domain.service.ticket

import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.model.TicketState
import com.allenti.ticketmanager.domain.repository.TicketRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono


@Component
class TicketServiceImpl(val ticketRepository: TicketRepository): TicketService {
	override fun create(ticket: Ticket): Mono<Ticket> {
		return ticketRepository.create(ticket)
	}

	override fun update(ticket: Ticket): Mono<Boolean> {
		return ticketRepository.update(ticket).hasElement()
	}

	override fun changeState(id: Long, state: TicketState): Mono<Boolean> {
		var ticket = ticketRepository.get(id).block()
		ticket.state = state
		return ticketRepository.update(ticket).hasElement()
	}

	override fun delete(id: Long): Mono<Boolean> {
		return ticketRepository.delete(id)
	}
}