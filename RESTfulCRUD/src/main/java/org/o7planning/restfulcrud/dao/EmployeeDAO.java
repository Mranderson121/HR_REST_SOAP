package org.o7planning.restfulcrud.dao;

import java.sql.Date;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.o7planning.restfulcrud.dto.CountryDTO;
import org.o7planning.restfulcrud.dto.EmployeeDTO;
import org.o7planning.restfulcrud.model.Employee;
import org.o7planning.restfulcrud.util.JPAUtil;

public class EmployeeDAO {

	public static List<Employee> getAllEmployees() {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query query = entityManager.createQuery("select e from Employee e");
		List<Employee> ls = query.getResultList();
		entityManager.close();
		return ls;

	}

	public static List<EmployeeDTO> getAllDto() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<EmployeeDTO> query = entityManager.createQuery(
				"select new org.o7planning.restfulcrud.dto.EmployeeDTO(em.id,em.name,em.lastName,em.department.name) from Employee em",
				EmployeeDTO.class);
		List<EmployeeDTO> listaEmployee = query.getResultList();
		return listaEmployee;
	}

	public static Employee getEmployee(int id) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Employee e = entityManager.find(Employee.class, id);
		entityManager.getTransaction().commit();
		entityManager.close();
		return e;

	}

	public static Employee addEmployee(Employee employee) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

		employee.setHireDate(new Date(2000, 1, 10));

		// int idDep=employee.getDepartment().getId();
		employee.setDepartment(DepartmentDAO.getDepartment(90));
		System.out.println(employee.getDepartment().getName());

		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();

		Employee em = getEmployee(employee.getId());

		return em;

	}

	public static Employee updateEmployee(Employee emp) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		emp.setHireDate(new Date(2000, 1, 10)); // CAPIRE FORMAmato data
		Employee e = entityManager.merge(emp);
		entityManager.getTransaction().commit();
		entityManager.close();
		return e;

	}

	public static void deleteEmployee(int id) {

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Employee e = entityManager.find(Employee.class, id);
		entityManager.remove(e);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

}
