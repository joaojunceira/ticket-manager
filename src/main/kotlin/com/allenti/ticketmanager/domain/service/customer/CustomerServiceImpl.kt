package com.allenti.ticketmanager.domain.service.customer

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*


@Component
class CustomerServiceImpl : CustomerService {
	override fun getByName(name: String?): Flux<CustomerDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun update(customerDetails: CustomerDetails): Mono<Boolean> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun create(customerDetails: CustomerDetails): Mono<CustomerDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun get(id: Long): Mono<CustomerDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

}