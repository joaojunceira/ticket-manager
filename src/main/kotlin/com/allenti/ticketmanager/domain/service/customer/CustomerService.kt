package com.allenti.ticketmanager.domain.service.customer

import org.springframework.stereotype.Service

@Service
interface CustomerService {
    fun create()

    fun get(name: String) : List<CustomerDetails>
}