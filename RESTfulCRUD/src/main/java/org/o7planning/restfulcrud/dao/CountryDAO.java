package org.o7planning.restfulcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.metamodel.ListAttribute;

import org.o7planning.restfulcrud.dto.CountryDTO;
import org.o7planning.restfulcrud.model.Country;
import org.o7planning.restfulcrud.util.JPAUtil;

public class CountryDAO {

	public static List<Country> getAll() {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

		Query query = entityManager.createQuery("select c from Country c");

		List<Country> ls = query.getResultList();

		entityManager.close();
		return ls;
	}

	public static List<CountryDTO> getAllDto() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<CountryDTO> query = entityManager.createQuery(
				"select new org.o7planning.restfulcrud.dto.CountryDTO(c.id, c.name) from Country c", CountryDTO.class);
		List<CountryDTO> listaCountry = query.getResultList();
		return listaCountry;
	}

}
