package com.allenti.ticketmanager.domain.service.assistant

import com.allenti.ticketmanager.domain.model.Assistant
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
interface AssistantService {
	fun create(assistantDetails: Assistant) : Mono<Assistant>
	fun getByName(name: String?) : Flux<Assistant>
	fun get(id: Long): Mono<Assistant>
	fun update(assistantDetails: Assistant) : Mono<Boolean>
}