package com.allenti.ticketmanager.domain.repository


import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.model.Role

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.extension.ExtendWith

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
class AssistantRepositoryTest{

	@Autowired lateinit var assistantRepository: AssistantRepository

	@TestFactory
	fun assistantsDummy() = listOf(
			Assistant(1,"John","Smith",Role.LEAD),
			Assistant(2, "Marie","Curie",Role.OWNER),
			Assistant(3,"John","Wayne",Role.SUPPORT))

	@Test
	fun createNewAssistant() {
		val assistant = Assistant(null,"John","Smith",Role.LEAD)
		val expectedResult = Assistant(1,"John","Smith",Role.LEAD)

		val result = assistantRepository.create(assistant)

		assertSame(result.block(), expectedResult)
	}

	@Test fun updateAssistant(){

	}

	@Test fun deleteAssistant(){

	}

	@Test fun insertAssistantFails(){

	}
}