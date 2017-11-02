package com.allenti.ticketmanager.domain.model

import java.util.*

data class Customer(val id: UUID, val firstName: String, val lastName: String,
                    val address: Address, val phone: String, val email: String)