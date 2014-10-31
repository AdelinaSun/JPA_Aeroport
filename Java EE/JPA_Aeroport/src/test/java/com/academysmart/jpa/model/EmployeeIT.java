package com.academysmart.jpa.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeIT {

	/*private static EntityManagerFactory emf = Persistence
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

	@Test
	public void shouldFindEmployee() throws Exception {
		//Employee employee = em.find(Employee.class, 1L);
		//assertEquals("Иванов", employee.getLname());
	}

	@Test
	public void shouldCreateAdress() throws Exception {
		Adress adress = new Adress();
		//adress.setCity("Нью-Йорк");
		//adress.setStreet("Клинтона");
		tx.begin();
		em.persist(adress);
		tx.commit();
		@SuppressWarnings("unchecked")
		List<Adress> adresses = em.createNamedQuery("selectAll").getResultList();
		assertEquals(4, adresses.size());
		}*/

}
