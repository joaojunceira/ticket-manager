package com.allenti.ticketmanager.domain.model

import org.springframework.data.annotation.Id

data class Ticket(@Id val id: Long, val title: String, val description: String, val tags: List<Tag>?,
                  val customer: Customer, val owner: Assistant, var state: TicketState)

data class Tag(val name: String)

enum class TicketState(val id: Int) {
	OPEN(1),
	ON_HOLD(2),
	WAITING_FOR_CUSTOMER(3),
	CLOSED(4)
}