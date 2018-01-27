package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities


enum class TicketStateEntity(val id: Int) {
    OPEN(1),
    ON_HOLD(2),
    WAITING_FOR_CUSTOMER(3),
    CLOSED(4)
}