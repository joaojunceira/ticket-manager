package com.allenti.ticketmanager.domain.model


data class Customer (val id: Long, val firstName: String, val lastName: String,
                    val address: Address?, var phone: String?, var email: String?)

data class Address (val street: String?, val postalCode: String?, val city: String?, val country: String?)

