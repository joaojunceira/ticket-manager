package com.allenti.ticketmanager.domain.service.customer

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
interface CustomerService {
	fun create(customerDetails: CustomerDetails): Mono<CustomerDetails>
	fun get(id: Long): Mono<CustomerDetails>
	fun getByName(name: String?): Flux<CustomerDetails>
	fun update(customerDetails: CustomerDetails): Mono<Boolean>
}