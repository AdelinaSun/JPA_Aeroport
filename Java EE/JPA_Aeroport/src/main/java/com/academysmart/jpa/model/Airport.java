package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AIRPORT")
@NamedQuery(name = "selectAll", query = "SELECT a FROM Airport a")
public class Airport {
	//private static Airport instance;

	@GeneratedValue
	@Id
	private long ID_AIRPORT;
	private String AIRPORT_NAME;
		
	
	/*public static Airport getRepository() {

		if (instance == null) {
			synchronized (Airport.class) {
				if (instance == null) {
					instance = new Airport();
				}
			}
		}
		return instance;
	}*/

	public void addAirport(long ID_AIRPORT, String AIRPORT_NAME)
			throws IOException, SQLException {

		Airport airport = new Airport();
		airport.setAIRPORT_NAME(AIRPORT_NAME);
		airport.setID_AIRPORT(ID_AIRPORT);

		// DataBase.getDatabase().addDataToDb(employee);
		//this.airportList.add(airport);
	}

	public String getAIRPORT_NAME() {
		return AIRPORT_NAME;
	}

	public void setAIRPORT_NAME(String AIRPORT_NAME) {
		this.AIRPORT_NAME = AIRPORT_NAME;
	}

	public long getID_AIRPORT() {
		return ID_AIRPORT;
	}

	public void setID_AIRPORT(long ID_AIRPORT) {
		this.ID_AIRPORT = ID_AIRPORT;
	}

}
