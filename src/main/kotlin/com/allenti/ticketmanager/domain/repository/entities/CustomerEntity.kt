package com.allenti.ticketmanager.domain.repository.entities

data class CustomerEntity(val id: Long, val firstName: String, val lastName: String,
                          var address: AddressEntity, var phone: String?, var email: String?)