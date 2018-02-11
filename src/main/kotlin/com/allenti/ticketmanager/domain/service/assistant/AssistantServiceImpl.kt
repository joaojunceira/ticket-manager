package com.allenti.ticketmanager.domain.service.assistant

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Component
class AssistantServiceImpl: AssistantService {
	override fun create(assistantDetails: AssistantDetails): Mono<AssistantDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getByName(name: String?): Flux<AssistantDetails> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun update(assistantDetails: AssistantDetails): Mono<Boolean> {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}