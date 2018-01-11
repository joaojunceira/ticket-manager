package com.allenti.ticketmanager.domain.model


data class Customer(val id: Long, val firstName: String, val lastName: String,
                    var address: Address, var phone: String?, var email: String?)