package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities


enum class RoleEntity(val id: Int) {
    MANAGER(1),
    OWNER(2)
}