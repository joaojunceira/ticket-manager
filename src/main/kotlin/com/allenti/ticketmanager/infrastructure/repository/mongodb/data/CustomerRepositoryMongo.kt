package com.allenti.ticketmanager.infrastructure.repository.mongodb.data


import com.allenti.ticketmanager.domain.model.Customer
import com.allenti.ticketmanager.domain.repository.CustomerRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepositoryMongo : CustomerRepository, ReactiveMongoRepository<Customer, Long>