package com.allenti.ticketmanager.domain.model

import java.util.UUID

data class Address(val id: UUID, val street: String, val postalCode: String, val city: String, val country: String)