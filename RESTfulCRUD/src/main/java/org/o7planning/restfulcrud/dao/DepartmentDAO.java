package org.o7planning.restfulcrud.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.o7planning.restfulcrud.dto.DepartmentDTO;
import org.o7planning.restfulcrud.dto.EmployeeDTO;
import org.o7planning.restfulcrud.model.Department;
import org.o7planning.restfulcrud.model.Employee;
import org.o7planning.restfulcrud.util.JPAUtil;

public class DepartmentDAO {

	public static List<Department> getAll() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createQuery("select d from Department d");
		List<Department> ls = query.getResultList();
		entityManager.close();
		return ls;
	}
	
	public static List<DepartmentDTO> getAllDto() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<DepartmentDTO> query = entityManager.createQuery(
				"select new org.o7planning.restfulcrud.dto.DepartmentDTO(d.id,d.name,d.location.city,d.location.streetAddress) from Department d",
				DepartmentDTO.class);
		List<DepartmentDTO> listaDepartmen = query.getResultList();
		return listaDepartmen;
	}

	public static Department getDepartment(int empNo) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Department d = entityManager.find(Department.class, empNo);
		entityManager.getTransaction().commit();
		entityManager.close();
		return d;
		
	}

	public static Department addDepartment(Department d) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(d);
		entityManager.getTransaction().commit();
		entityManager.close();
		Department de = getDepartment(d.getId());
		return de;

	}

	public static Department updateDepartment(Department dep) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Department d = entityManager.merge(dep);
		entityManager.getTransaction().commit();
		entityManager.close();
		return d;

	}

	public static void deleteDepartment(int id) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Department d = entityManager.find(Department.class, id);
		entityManager.remove(d);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
