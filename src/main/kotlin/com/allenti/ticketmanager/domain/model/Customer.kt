package com.allenti.ticketmanager.domain.model

import java.util.*

data class Customer(val id: UUID, val firstName: String, val lastName: String,
                    var address: Address, var phone: String?, var email: String?)