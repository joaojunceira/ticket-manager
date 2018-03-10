package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.repository.AssistantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface AssistantRepositoryMongo : ReactiveMongoRepository<Assistant, Long>

class AssistantRepositoryImpl(@Autowired val assistantRepositoryMongo: AssistantRepositoryMongo) : AssistantRepository{
	override fun create(customer: Assistant): Mono<Assistant> {
		return assistantRepositoryMongo.insert(customer)
	}

	override fun getByName(name: String): Flux<Assistant> {
		return assistantRepositoryMongo.findAll().filter{it.firstName.contains(name) || it.lastName.contains(name)}
	}

	override fun get(id: Long): Mono<Assistant> {
		return assistantRepositoryMongo.findById(id)
	}

}