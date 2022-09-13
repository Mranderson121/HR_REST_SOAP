package org.o7planning.restfulcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.o7planning.restfulcrud.model.Region;
import org.o7planning.restfulcrud.util.JPAUtil;

public class RegionsDao {

	 
	public static List<Region> getAll() {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

		Query query = entityManager.createQuery("select r from Region r");

		List<Region> ls = query.getResultList();

		entityManager.close();
		return ls;
	}

}
