package com.allenti.ticketmanager.domain.repository

import com.allenti.ticketmanager.domain.model.Assistant
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface AssistantRepository {
	fun create(assistant: Assistant): Mono<Assistant>
	fun getByName(name: String): Flux<Assistant>
	fun get(id: Long): Mono<Assistant>
	fun update(assistant: Assistant): Mono<Boolean>
}