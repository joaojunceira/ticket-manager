package com.allenti.ticketmanager.domain.service.customer

import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.CustomerRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*


@Component
class CustomerServiceImpl(val customerRepository: CustomerRepository) : CustomerService {
	override fun getByName(name: String?): Flux<Customer> {
		return customerRepository.getByName(name.orEmpty())
	}

	override fun update(customer: Customer): Mono<Boolean> {
		return customerRepository.update(customer).hasElement()
	}

	override fun create(customer: Customer): Mono<Customer> {
		return customerRepository.update(customer)
	}

	override fun get(id: Long): Mono<Customer> {
		return customerRepository.get(id)
	}

}