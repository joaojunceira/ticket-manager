package com.allenti.ticketmanager.domain.model

import org.springframework.data.annotation.Id


class Assistant(@Id val id: Long?, val firstName: String, val lastName: String, val role: Role)

enum class Role(val id: Int) {
	LEAD(1),
	OWNER(2),
	SUPPORT(3)
}