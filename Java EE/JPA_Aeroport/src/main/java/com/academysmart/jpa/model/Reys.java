package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.JoinTable;

@Entity
@Table(name = "RAYS")
public class Reys {
	private static Reys instance;

	@GeneratedValue
	@Id
	private long ID_RAYS;
	private String NAME_RAYS;
	@Column(name="\"FROM\"")
	private String FROM;
	@Column(name="\"WHERE\"")
	private String WHERE;
	private String FROM_WHERE;
	private double PRICE_OF_TICKET;
	private String TYPE_OF_FLIGHT;
	
	
	@ManyToOne (targetEntity = Airport.class)
	@JoinColumn(name = "\"WHERE\"")
	//private List<Airport> airport;

	/*public static Reys getRepository() {

		if (instance == null) {
			synchronized (Reys.class) {
				if (instance == null) {
					instance = new Reys();
				}
			}
		}
		return instance;
	}*/

	public void addReys(long ID_RAYS, String NAME_RAYS, String FROM,
			String WHERE, float PRICE_OF_TICKET, String TYPE_OF_FLIGHT)
			throws IOException, SQLException {

		Reys reys = new Reys();
		reys.setID_RAYS(ID_RAYS);
		reys.setNAME_RAYS(NAME_RAYS);
		reys.setFROM(FROM);
		reys.setWHERE(WHERE);
		reys.setPRICE_OF_TICKET(PRICE_OF_TICKET);
		reys.setTYPE_OF_FLIGHT(TYPE_OF_FLIGHT);
		
	}

	public long getID_RAYS() {
		return ID_RAYS;
	}

	public void setID_RAYS(long ID_RAYS) {
		this.ID_RAYS = ID_RAYS;
	}

	public String getNAME_RAYS() {
		return NAME_RAYS;
	}

	public void setNAME_RAYS(String NAME_RAYS) {
		this.NAME_RAYS = NAME_RAYS;
	}

	public double getPRICE_OF_TICKET() {
		return PRICE_OF_TICKET;
	}

	public void setPRICE_OF_TICKET(float PRICE_OF_TICKET2) {
		this.PRICE_OF_TICKET = PRICE_OF_TICKET2;
	}

	public String getTYPE_OF_FLIGHT() {
		return TYPE_OF_FLIGHT;
	}

	public void setTYPE_OF_FLIGHT(String typeOfFlight) {
		TYPE_OF_FLIGHT = typeOfFlight;
	}

	public String getFROM_WHERE() {
		return FROM_WHERE;
	}

	public void setFROM_WHERE(String FROM_WHERE) {
		this.FROM_WHERE = FROM_WHERE;
	}

	public String getFROM() {
		return FROM;
	}

	public void setFROM(String fROM) {
		FROM = fROM;
	}

	public String getWHERE() {
		return WHERE;
	}

	public void setWHERE(String wHERE) {
		WHERE = wHERE;
	}

}
