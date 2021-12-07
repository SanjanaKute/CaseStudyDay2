package com.CaseStudy.ticketreservationservice.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CaseStudy.ticketreservationservice.model.TicketReservation;
import com.CaseStudy.ticketreservationservice.repository.TicketReservationRepository;

@RestController
@RequestMapping("/reserve")
public class TicketReservationController {
	
	@Autowired
	private TicketReservationRepository ticketReservationRepository;
	
	
	@PostMapping("/addTicket")
	public String saveTicket(@RequestBody TicketReservation reserve) 
	{
		ticketReservationRepository.save(reserve);
		return "Reserved ticket with id :  " + reserve.getId();
    }
	
	
	@GetMapping("/{id}")
	public Optional<TicketReservation> getBook(@PathVariable String id)
	{
		return ticketReservationRepository.findById(id);
	}
	
	
	@PutMapping("/update/{id}")
	public TicketReservation updateTicket(@PathVariable("id") String id,@RequestBody TicketReservation order ) 
	{
		order.setId(id);
		ticketReservationRepository.save(order);
		return order;
	}
		
	 @DeleteMapping("/del/{id}")
	 public String deleteOrder (@PathVariable String id)
	 {
		 ticketReservationRepository.deleteById(id);
         return "Ticket deleted with id : "+id;
	}
}
