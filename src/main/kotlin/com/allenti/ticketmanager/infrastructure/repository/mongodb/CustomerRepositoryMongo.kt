package com.allenti.ticketmanager.infrastructure.repository.mongodb


import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.CustomerRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface CustomerRepositoryMongo : ReactiveMongoRepository<Customer, Long>

class CustomerRepositoryImpl(val customerRepositoryMongo: CustomerRepositoryMongo) : CustomerRepository{
	override fun create(customer: Customer): Mono<Customer> {
		return customerRepositoryMongo.insert(customer)
	}

	override fun getByName(name: String): Flux<Customer> {
		return customerRepositoryMongo.findAll().filter { it.firstName.contains(name) || it.lastName.contains(name) }
	}

	override fun get(id: Long): Mono<Customer> {
		return customerRepositoryMongo.findById(id)
	}

	override fun update(customer: Customer): Mono<Customer> {
		return customerRepositoryMongo.save(customer)
	}
}