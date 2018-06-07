package com.allenti.ticketmanager.domain.model

import org.springframework.data.annotation.Id


data class Customer(@Id val id: Long, val firstName: String, val lastName: String,
                    val address: Address?, var phone: String?, var email: String?)

data class Address(val street: String?, val postalCode: String?, val city: String?, val country: String?)

