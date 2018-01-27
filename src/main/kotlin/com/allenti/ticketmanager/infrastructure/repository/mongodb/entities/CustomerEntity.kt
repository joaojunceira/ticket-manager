package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.Email

@Document(collection = "customers")
data class CustomerEntity(@Id val id: Long, val firstName: String, val lastName: String,
                          var address: AddressEntity, var phone: String?, @Email var email: String?)