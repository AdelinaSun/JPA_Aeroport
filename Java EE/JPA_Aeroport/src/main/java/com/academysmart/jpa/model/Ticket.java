package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TICKET")

public class Ticket {
	private static Ticket instance;

	@GeneratedValue
	@Id
	private long TICKET_ID;
	private String NAME_PASSENGER;
	private String SURNAME_PASSENGER;
	private String PATRONYMIC_PASSENGER;

	private String NAME_RAYS;

	private String DATA;

	private String TYPE_OF_FLIGHT;
	private double TICKET_PRICE;
	private double LUGGAGE;
	private String TYPE_OF_TICKET;

	@ManyToOne(targetEntity = Passenger.class)
	@JoinColumn(name = "PASSENGER")
	private Passenger passenger;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void addTicket(long PASSENGER, String TYPE_OF_FLIGHT,
			double TICKET_PRICE, double LUGGAGE, String TYPE_OF_TICKET)
			throws IOException, SQLException {

		Ticket ticket = new Ticket();
		ticket.setTICKET_ID(TICKET_ID);
		ticket.setLUGGAGE(LUGGAGE);
		ticket.setTICKET_PRICE(TICKET_PRICE);
		ticket.setTYPE_OF_FLIGHT(TYPE_OF_FLIGHT);
		ticket.setTYPE_OF_TICKET(TYPE_OF_TICKET);

		// DataBase.getDatabase().addDataToDb(employee);
//		this.listTicket.add(ticket);
	}

	public long getTICKET_ID() {
		return TICKET_ID;
	}

	public void setTICKET_ID(long TICKET_ID) {
		this.TICKET_ID = TICKET_ID;
	}

	public String getTYPE_OF_FLIGHT() {
		return TYPE_OF_FLIGHT;
	}

	public void setTYPE_OF_FLIGHT(String TYPE_OF_FLIGHT) {
		this.TYPE_OF_FLIGHT = TYPE_OF_FLIGHT;
	}

	public double getTICKET_PRICE() {
		return TICKET_PRICE;
	}

	public void setTICKET_PRICE(double TICKET_PRICE) {
		this.TICKET_PRICE = TICKET_PRICE;
	}

	/*
	 * public String getCATEGORY() { return CATEGORY; } public void
	 * setCATEGORY(String CATEGORY) { this.CATEGORY = CATEGORY; }
	 */
	public double getLUGGAGE() {
		return LUGGAGE;
	}

	public void setLUGGAGE(double lUGGAGE2) {
		this.LUGGAGE = lUGGAGE2;
	}

	public String getTYPE_OF_TICKET() {
		return TYPE_OF_TICKET;
	}

	public void setTYPE_OF_TICKET(String TYPE_OF_TICKET) {
		this.TYPE_OF_TICKET = TYPE_OF_TICKET;
	}

	public String getNAME_PASSENGER() {
		return NAME_PASSENGER;
	}

	public void setNAME_PASSENGER(String nAME_PASSENGER) {
		NAME_PASSENGER = nAME_PASSENGER;
	}

	public String getSURNAME_PASSENGER() {
		return SURNAME_PASSENGER;
	}

	public void setSURNAME_PASSENGER(String sURNAME_PASSENGER) {
		SURNAME_PASSENGER = sURNAME_PASSENGER;
	}

	public String getPATRONYMIC_PASSENGER() {
		return PATRONYMIC_PASSENGER;
	}

	public void setPATRONYMIC_PASSENGER(String pATRONYMIC_PASSENGER) {
		PATRONYMIC_PASSENGER = pATRONYMIC_PASSENGER;
	}

	public String getNAME_RAYS() {
		return NAME_RAYS;
	}

	public void setNAME_RAYS(String nAME_RAYS) {
		NAME_RAYS = nAME_RAYS;
	}

	public String getDATA() {
		return DATA;
	}

	public void setDATA(String dATA) {
		DATA = dATA;
	}

}
