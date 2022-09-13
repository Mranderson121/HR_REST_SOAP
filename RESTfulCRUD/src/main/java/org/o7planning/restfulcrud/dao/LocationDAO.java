package org.o7planning.restfulcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.o7planning.restfulcrud.model.Location;
import org.o7planning.restfulcrud.util.JPAUtil;

public class LocationDAO {

	 
	public static List<Location> getAllEmployees() {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Query query = entityManager.createQuery("select l from Location l");

		List<Location> ls = query.getResultList();

		entityManager.close();
		return ls;
	}

}
