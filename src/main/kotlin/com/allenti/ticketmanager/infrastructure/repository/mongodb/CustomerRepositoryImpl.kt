package com.allenti.ticketmanager.infrastructure.repository.mongodb

import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.CustomerRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepositoryImpl : CustomerRepository, ReactiveMongoRepository<Customer, Long>