package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Tag
import com.allenti.ticketmanager.domain.model.Ticket
import com.allenti.ticketmanager.domain.repository.TicketRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface TicketRepositoryMongo : ReactiveMongoRepository<Ticket, Long>

class TicketRepositoryImpl(val mongoRepository: TicketRepositoryMongo) : TicketRepository{
	override fun create(ticket: Ticket): Mono<Ticket> {
		return mongoRepository.insert(ticket)
	}

	override fun get(id: Long): Mono<Ticket> {
		return mongoRepository.findById(id)
	}

	override fun getByName(name: String): Flux<Ticket> {
		return mongoRepository.findAll().filter { t -> t.title.contains(name) }
	}

	override fun getByCustomer(customerId: Long): Flux<Ticket> {
		return mongoRepository.findAll().filter { t -> t.customer.id == customerId }
	}

	override fun getByTag(tags: Collection<Tag>): Flux<Ticket> {
		return mongoRepository.findAll().filter{ t -> t.tags!!.containsAll(tags) }
	}

	override fun update(ticket: Ticket): Mono<Ticket> {
		return mongoRepository.save(ticket)
	}

}