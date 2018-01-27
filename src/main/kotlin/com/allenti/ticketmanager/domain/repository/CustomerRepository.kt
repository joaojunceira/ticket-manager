package com.allenti.ticketmanager.domain.repository

import com.allenti.ticketmanager.domain.model.Customer
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


interface CustomerRepository {
    fun create(customer: Customer): Mono<Customer>
    fun getByName(name: String): Flux<Customer>
    fun get(id: Long): Mono<Customer>
    fun update(customer: Customer): Mono<Customer>
}