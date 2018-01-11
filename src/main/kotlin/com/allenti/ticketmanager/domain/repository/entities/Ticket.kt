package com.allenti.ticketmanager.domain.repository.entities

import java.util.*


data class Ticket (val id: UUID, val title: String, val description: String,
                   val customer: CustomerEntity, val owner: Assistant, val state: TicketState)