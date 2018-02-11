package com.allenti.ticketmanager.domain.service.ticket

import com.allenti.ticketmanager.domain.model.TicketState
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
interface TicketService {
	fun create(ticketDetails: TicketDetails): Mono<TicketDetails>
	fun update(ticketDetails: TicketDetails): Mono<Boolean>
	fun changeState(id: Long, state: TicketState): Mono<Boolean>
	fun delete(id: Long): Mono<Boolean>
}