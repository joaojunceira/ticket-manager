package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tickets")
data class TicketEntity(@Id val id: Long, val title: String, val description: String,
                        val customer: CustomerEntity, val owner: AssistantEntity, val state: TicketStateEntity)