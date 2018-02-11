package com.allenti.ticketmanager.domain.service.assistant

import com.allenti.ticketmanager.domain.model.Role


data class AssistantDetails(val id: Long, val firstName: String, val lastName: String, val role: Role)