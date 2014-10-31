package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONCRETE_RAYS")
public class ConcreteReys {
	private static ConcreteReys instance;

	@GeneratedValue
	@Id
	private long ID_CONCRETE_RAYS;
	private String DATA;
	private String NAME;
	@Column(name="\"FROM\"")
	private String FROM;
	@Column(name="\"WHERE\"")
	private String WHERE;
	private int PRICE_OF_TICKET;
	private String TYPE_OF_FLIGHT;

	@ManyToOne(targetEntity = Reys.class)
	@JoinColumn(name = "NAME_RAYS")
	private ArrayList<ConcreteReys> listConcreteReys = new ArrayList<ConcreteReys>();

	/*public static ConcreteReys getRepository() {

		if (instance == null) {
			synchronized (ConcreteReys.class) {
				if (instance == null) {
					instance = new ConcreteReys();
				}
			}
		}
		return instance;
	}*/

	public void addConcreteReys(String DATA, String NAME, String FROM,
			String WHERE, int PRICE_OF_TICKET, String TYPE_OF_FLIGHT)
			throws IOException, SQLException {

		ConcreteReys ConcreteReys = new ConcreteReys();
		ConcreteReys.setID_CONCRETE_RAYS(ID_CONCRETE_RAYS);
		ConcreteReys.setDATA(DATA);
		ConcreteReys.setFROM(FROM);
		ConcreteReys.setWHERE(WHERE);
		ConcreteReys.setNAME(NAME);
		ConcreteReys.setPRICE_OF_TICKET(PRICE_OF_TICKET);
		ConcreteReys.setTYPE_OF_FLIGHT(TYPE_OF_FLIGHT);
	}

	public long getID_CONCRETE_RAYS() {
		return ID_CONCRETE_RAYS;
	}

	public void setID_CONCRETE_RAYS(long ID_CONCRETE_RAYS) {
		this.ID_CONCRETE_RAYS = ID_CONCRETE_RAYS;
	}

	public String getDATA() {
		return DATA;
	}

	public void setDATA(String DATA) {
		this.DATA = DATA;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getFROM() {
		return FROM;
	}

	public void setFROM(String FROM) {
		this.FROM = FROM;
	}

	public String getWHERE() {
		return WHERE;
	}

	public void setWHERE(String WHERE) {
		this.WHERE = WHERE;
	}

	public int getPRICE_OF_TICKET() {
		return PRICE_OF_TICKET;
	}

	public void setPRICE_OF_TICKET(int pRICE_OF_TICKET2) {
		this.PRICE_OF_TICKET = pRICE_OF_TICKET2;
	}

	public String getTYPE_OF_FLIGHT() {
		return TYPE_OF_FLIGHT;
	}

	public void setTYPE_OF_FLIGHT(String TYPE_OF_FLIGHT) {
		this.TYPE_OF_FLIGHT = TYPE_OF_FLIGHT;
	}

}
