package com.allenti.ticketmanager.infrastructure.repository.mongodb.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "assistants")
class AssistantEntity(@Id val id: Long,
                      val firstName: String,
                      val lastName: String,
                      val role: RoleEntity)