package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.CustomerRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


class CustomerRepositoryImpl: CustomerRepository {
    override fun create(customer: Customer): Mono<Customer> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String): Flux<Customer> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: Long): Mono<Customer> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(customer: Customer): Mono<Customer> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}