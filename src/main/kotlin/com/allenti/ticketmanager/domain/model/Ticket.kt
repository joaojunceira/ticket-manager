package com.allenti.ticketmanager.domain.model

import java.util.*


data class Ticket (val id: UUID, val title: String, val description: String,
                   val customer: Customer, val owner: Assistant, val state: TicketState)