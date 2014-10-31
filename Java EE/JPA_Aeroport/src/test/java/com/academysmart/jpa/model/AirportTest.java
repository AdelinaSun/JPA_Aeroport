package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import junit.framework.Assert;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirportTest {
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("derbyTest");
	private EntityManager em;
	private EntityTransaction tx;

	@Before
	public void setUp() throws Exception {
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@After
	public void tearDown() throws Exception {
		if (em != null) {
			em.clear();
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldFind() throws Exception {
		Airport airport = em.find(Airport.class, 1L);
		assertEquals("Харьков", airport.getAIRPORT_NAME());

		ConcreteReys concreteReys = em.find(ConcreteReys.class, 1L);
		assertEquals("12.03.2015", concreteReys.getDATA());

		Passenger passenger = em.find(Passenger.class, 1L);
		assertEquals("Роксолана", passenger.getName());

		Reys reys = em.find(Reys.class, 1L);
		assertEquals("Киев-Харьков", reys.getNAME_RAYS());

		Ticket ticket = em.find(Ticket.class, 1L);
		Assert.assertEquals(600.0, ticket.getTICKET_PRICE());

		TypeOfReys typeOfReys = em.find(TypeOfReys.class, 1L);
		assertEquals("Люкс", typeOfReys.getNAME_OF_TYPE());
	}

	@Test
	public void shouldCreate() throws Exception {
		Airport airport1 = new Airport();

		airport1.setAIRPORT_NAME("Одесса");

		tx.begin();
		em.persist(airport1);
		tx.commit();

		@SuppressWarnings("unchecked")
		List<Airport> airport2 = em.createNamedQuery("selectAll")
				.getResultList();
		assertEquals(4, airport2.size());
	}

	@Test
	public void shouldUpdate() throws Exception {
		Airport airport = new Airport();

		airport.setAIRPORT_NAME("Анталия");
		airport.setID_AIRPORT(2);

		tx.begin();
		em.merge(airport);
		tx.commit();

		@SuppressWarnings("unchecked")
		List<Airport> airport2 = em.createNamedQuery("selectAll")
				.getResultList();

		airport = em.find(Airport.class, 1L);
		assertEquals("Анталия", airport2.get(1).getAIRPORT_NAME());
	}

	@Test
	public void checkRelation() throws Exception {
		Ticket ticket = em.find(Ticket.class, 1L);
		Passenger passenger = em.find(Passenger.class, 1L);

		assertEquals(passenger,ticket.getPassenger());
	}

	@Test
	public void checkRelation1() throws Exception {
		
		@SuppressWarnings("unchecked")
		List<Airport> ticket = em.createNamedQuery("selectP").getResultList();
		@SuppressWarnings("unchecked")
		List<Passenger> ticket2 = em.createQuery(
				"SELECT t from Passenger p, Ticket t where p.ID_PASSENGER=t")
				.getResultList();
		assert(ticket2.size()>0);
		assert(ticket.size()>0);
	}

}
