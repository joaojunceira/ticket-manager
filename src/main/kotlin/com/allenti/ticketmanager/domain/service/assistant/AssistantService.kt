package com.allenti.ticketmanager.domain.service.assistant

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
interface AssistantService {
	fun create(assistantDetails: AssistantDetails) : Mono<AssistantDetails>
	fun getByName(name: String?) : Flux<AssistantDetails>
	fun get(id: Long): Mono<AssistantDetails>
	fun update(assistantDetails: AssistantDetails) : Mono<Boolean>
}