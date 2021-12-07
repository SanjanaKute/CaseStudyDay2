package com.CaseStudy.ticketreservationservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reservation")
public class TicketReservation 
{
	
	@Id 
	private String id;
	private String noOfTickets;
	private String startStation;
	private String endStation;
	public TicketReservation(String id, String noOfTickets, String startStation, String endStation) {
		super();
		this.id = id;
		this.noOfTickets = noOfTickets;
		this.startStation = startStation;
		this.endStation = endStation;
	}
	public TicketReservation() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(String noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getEndStation() {
		return endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + ", noOfTickets=" + noOfTickets + ", startStation=" + startStation
				+ ", endStation=" + endStation + "]";
	}
	
	
	
	

}
