package com.allenti.ticketmanager.domain.service.ticket

import com.allenti.ticketmanager.domain.model.TicketState
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono


@Component
class TicketServiceImpl: TicketService {
	override fun create(ticketDetails: TicketDetails): Mono<TicketDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun update(ticketDetails: TicketDetails): Mono<Boolean> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun changeState(id: Long, state: TicketState): Mono<Boolean> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun delete(id: Long): Mono<Boolean> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}