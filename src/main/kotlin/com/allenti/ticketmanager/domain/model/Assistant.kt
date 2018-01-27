package com.allenti.ticketmanager.domain.model


class Assistant(val id: Long, val firstName: String, val lastName: String, val role: Role)

enum class Role(val id: Int) {
    LEAD(1),
    OWNER(2)
}