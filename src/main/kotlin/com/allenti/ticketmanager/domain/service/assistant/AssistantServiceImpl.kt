package com.allenti.ticketmanager.domain.service.assistant

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.repository.AssistantRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Component
class AssistantServiceImpl(val assistantRepository: AssistantRepository): AssistantService {
	override fun get(id: Long): Mono<Assistant> {
		return assistantRepository.get(id)
	}

	override fun create(assistant: Assistant): Mono<Assistant> {
		return assistantRepository.create(assistant)
	}

	override fun getByName(name: String?): Flux<Assistant> {
		return assistantRepository.getByName(name.orEmpty())
	}

	override fun update(assistant: Assistant): Mono<Boolean> {
		return assistantRepository.update(assistant)
	}
}