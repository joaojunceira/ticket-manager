package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.AssistantRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


class AssistantRepositoryImpl : AssistantRepository {
    override fun create(customer: Customer): Mono<Assistant> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String): Flux<Assistant> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(id: Long): Mono<Assistant> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}