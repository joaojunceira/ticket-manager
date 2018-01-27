package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities

import org.springframework.data.annotation.Id

data class AddressEntity(@Id val id: Long,
                         val street: String,
                         val postalCode: String,
                         val city: String,
                         val country: String)