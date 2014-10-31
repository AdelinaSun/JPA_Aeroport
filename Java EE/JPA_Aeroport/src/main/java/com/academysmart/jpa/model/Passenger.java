package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGER")
@NamedQuery(name = "selectP", query = "SELECT a FROM Passenger a WHERE a.ID_PASSENGER=1 ")
public class Passenger {
	private static Passenger instance;

	@Id
	@GeneratedValue
	private long ID_PASSENGER;
	private String NAME_PASSENGER;
	private String SURNAME_PASSENGER;
	private String PATRONYMIC_PASSENGER;
	private String TEL_NUMBER_PASSENGER;
	private ArrayList<Passenger> listPassenger = new ArrayList<Passenger>();
	private ArrayList<Ticket> listTicket = new ArrayList<Ticket>();

	/*public static Passenger getRepository() {

		if (instance == null) {
			synchronized (Passenger.class) {
				if (instance == null) {
					instance = new Passenger();
				}
			}
		}
		return instance;
	}*/

	public void addPassenger(long ID_PASSENGER, String NAME_PASSENGER,
			String SURNAME_PASSENGER, String PATRONYMIC_PASSENGER,
			String TEL_NUMBER_PASSENGER) throws IOException, SQLException {

		Passenger passenger = new Passenger();
		passenger.setID_PASSENGER(ID_PASSENGER);
		passenger.setName(NAME_PASSENGER);
		passenger.setSurname(SURNAME_PASSENGER);
		passenger.setPATRONYMIC(PATRONYMIC_PASSENGER);
		passenger.setTEL_NUMBER(TEL_NUMBER_PASSENGER);
		this.listPassenger.add(passenger);
	}

	public long getID_PASSENGER() {
		return ID_PASSENGER;
	}

	public void setID_PASSENGER(long ID_PASSENGER) {
		this.ID_PASSENGER = ID_PASSENGER;
	}

	public String getName() {
		return NAME_PASSENGER;
	}

	public void setName(String NAME_PASSENGER) {
		this.NAME_PASSENGER = NAME_PASSENGER;
	}

	public String getSurname() {
		return SURNAME_PASSENGER;
	}

	public void setSurname(String surname) {
		SURNAME_PASSENGER = surname;
	}

	public String getPATRONYMIC() {
		return PATRONYMIC_PASSENGER;
	}

	public void setPATRONYMIC(String PATRONYMIC) {
		PATRONYMIC_PASSENGER = PATRONYMIC;
	}

	public String getTEL_NUMBER() {
		return TEL_NUMBER_PASSENGER;
	}

	public void setTEL_NUMBER(String TEL_NUMBER) {
		TEL_NUMBER_PASSENGER = TEL_NUMBER;
	}

}
