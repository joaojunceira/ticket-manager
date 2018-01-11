package com.allenti.ticketmanager.domain.repository.entities


enum class TicketState(val id: Int) {
    OPEN(1),
    ON_HOLD(2),
    WAITING_FOR_CUSTOMER(3),
    CLOSED(4)
}