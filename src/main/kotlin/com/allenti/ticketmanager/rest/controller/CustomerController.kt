package com.allenti.ticketmanager.rest.controller

import com.allenti.ticketmanager.domain.service.customer.CustomerDetails
import com.allenti.ticketmanager.domain.service.customer.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController constructor(val customerService: CustomerService) {

    @GetMapping
    fun get(name: String?) : ResponseEntity<CustomerDetails>{
        val list = customerService.get(name.orEmpty())
        val dummy = list[0]
        return ResponseEntity.ok(dummy)
    }
}