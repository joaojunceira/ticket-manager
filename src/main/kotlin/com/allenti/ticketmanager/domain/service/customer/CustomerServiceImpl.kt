package com.allenti.ticketmanager.domain.service.customer

import org.springframework.stereotype.Component
import java.util.*

@Component
class CustomerServiceImpl : CustomerService{
    override fun create() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(name: String) : List<CustomerDetails> {
        val list = LinkedList<CustomerDetails>()
        list.add(CustomerDetails("Sherlock", "Holmes", null, null))
        list.add(CustomerDetails("John", "Watson", null, null))
        return list
    }
}