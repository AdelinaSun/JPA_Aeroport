package com.academysmart.jpa.model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_OF_REYS")

public class TypeOfReys {
	private static TypeOfReys instance;

	@GeneratedValue	
	@Id private long ID_TypeOfReys;
	private String NAME_OF_TYPE;
	private long NUMBER_OF_SEATS;
	
	@ManyToOne (targetEntity = Reys.class)
	@JoinColumn(name = "NAME_RAYS")
	private ArrayList<TypeOfReys> listTypeOfReys = new ArrayList<TypeOfReys>();
	
	/*public static TypeOfReys getRepository() {

		if (instance == null) {
			synchronized (TypeOfReys.class) {
				if (instance == null) {
					instance = new TypeOfReys();
				}
			}
		}
		return instance;
	}*/
	
	public void addTypeOfReys(long ID_TypeOfReys, String NAME_OF_TYPE, long NUMBER_OF_SEATS)
			throws IOException, SQLException {

		TypeOfReys typeOfReys = new TypeOfReys();
		typeOfReys.setID_TypeOfReys(ID_TypeOfReys);
		typeOfReys.setNAME_OF_TYPE(NAME_OF_TYPE);
		typeOfReys.setNUMBER_OF_SEATS(NUMBER_OF_SEATS);
				
		this.listTypeOfReys.add(typeOfReys);
	}

	public long getID_TypeOfReys() {
		return ID_TypeOfReys;
	}

	public void setID_TypeOfReys(long ID_TypeOfReys) {
		this.ID_TypeOfReys = ID_TypeOfReys;
	}
	
	public String getNAME_OF_TYPE() {
		return NAME_OF_TYPE;
	}
	
	public void setNAME_OF_TYPE(String NAME_OF_TYPE) {
		this.NAME_OF_TYPE = NAME_OF_TYPE;
	}
	
	public long getNUMBER_OF_SEATS() {
		return NUMBER_OF_SEATS;
	}
	
	public void setNUMBER_OF_SEATS(long NUMBER_OF_SEATS) {
		this.NUMBER_OF_SEATS = NUMBER_OF_SEATS;
	}
	
}
