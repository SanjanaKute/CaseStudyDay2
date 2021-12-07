package com.CaseStudy.ticketreservationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketReservationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketReservationServiceApplication.class, args);
	}

}
