package com.allenti.ticketmanager.domain.service.customer

import com.allenti.ticketmanager.domain.model.Customer
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
interface CustomerService {
	fun create(customer: Customer): Mono<Customer>
	fun get(id: Long): Mono<Customer>
	fun getByName(name: String?): Flux<Customer>
	fun update(customer: Customer): Mono<Boolean>
}