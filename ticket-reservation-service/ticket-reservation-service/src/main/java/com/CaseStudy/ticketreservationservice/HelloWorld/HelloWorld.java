package com.CaseStudy.ticketreservationservice.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/ticketreservation")
	public String hello()
	{
		return "Hello from Ticket Reservation service";
	}
}
