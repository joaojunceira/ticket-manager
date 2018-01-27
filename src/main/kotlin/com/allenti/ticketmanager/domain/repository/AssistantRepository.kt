package com.allenti.ticketmanager.domain.repository

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.model.Customer
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


interface AssistantRepository {
    fun create(customer: Customer): Mono<Assistant>
    fun getByName(name: String): Flux<Assistant>
    fun get(id: Long): Mono<Assistant>
}