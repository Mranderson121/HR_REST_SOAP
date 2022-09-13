package org.o7planning.restfulcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.o7planning.restfulcrud.model.Job;
import org.o7planning.restfulcrud.util.JPAUtil;

public class JobDAO {

	 
	public static List<Job> getAllEmployees() {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Query query = entityManager.createQuery("select l from Job l");

		List<Job> ls = query.getResultList();

		entityManager.close();
		return ls;
	}

}
