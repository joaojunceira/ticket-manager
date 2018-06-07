package com.allenti.ticketmanager.api.rest.assistant

import com.allenti.ticketmanager.domain.service.assistant.AssistantDetails
import com.allenti.ticketmanager.domain.service.assistant.AssistantService
import kotlinx.coroutines.experimental.Unconfined
import kotlinx.coroutines.experimental.reactive.awaitFirst
import kotlinx.coroutines.experimental.reactor.mono
import org.springframework.http.ResponseEntity.ok
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest


@Component
class AssistantHandler(val assistantService: AssistantService) {

	fun get(serverRequest: ServerRequest) = mono(Unconfined) {
		val assistant = assistantService.get(
				serverRequest.pathVariable("id").toLong()).awaitFirst()
		ok().body(assistant)
	}

	fun post(serverRequest: ServerRequest) = mono(Unconfined) {

	}

	fun update() = mono(Unconfined) {

	}
}