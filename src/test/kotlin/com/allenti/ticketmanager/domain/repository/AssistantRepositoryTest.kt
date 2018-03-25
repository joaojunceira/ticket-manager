package com.allenti.ticketmanager.domain.repository


import com.allenti.ticketmanager.domain.model.Assistant
import com.allenti.ticketmanager.domain.model.Role
import org.junit.Assert.assertSame
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AssistantRepositoryTest{

	@Autowired lateinit var assistantRepository: AssistantRepository

	val assistantsDummy = listOf(
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

	/*@Test fun updateAssistant(){

	}

	@Test fun deleteAssistant(){

	}

	@Test fun insertAssistantFails(){

	}*/
}