package com.allenti.ticketmanager

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TicketManagerApplication

fun main(args: Array<String>) {
    SpringApplication.run(TicketManagerApplication::class.java, *args)
}
