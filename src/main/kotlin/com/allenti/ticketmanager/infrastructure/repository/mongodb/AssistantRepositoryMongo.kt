package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.repository.AssistantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository
interface AssistantRepositoryMongo : ReactiveMongoRepository<Assistant, Long>

@Component
class AssistantRepositoryImpl(@Autowired val assistantRepositoryMongo: AssistantRepositoryMongo) : AssistantRepository{
	override fun update(assistant: Assistant): Mono<Boolean> {
		return assistantRepositoryMongo.save(assistant).hasElement()
	}

	override fun create(assistant: Assistant): Mono<Assistant> {
		return assistantRepositoryMongo.insert(assistant)
	}

	override fun getByName(name: String): Flux<Assistant> {
		return assistantRepositoryMongo.findAll().filter{it.firstName.contains(name) || it.lastName.contains(name)}
	}

	override fun get(id: Long): Mono<Assistant> {
		return assistantRepositoryMongo.findById(id)
	}

}