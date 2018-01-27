package com.allenti.ticketmanager.infrastructure.repository.mongodb.data


import com.allenti.ticketmanager.infrastructure.repository.mongodb.entities.CustomerEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepositoryMongo : ReactiveMongoRepository<CustomerEntity, Long>