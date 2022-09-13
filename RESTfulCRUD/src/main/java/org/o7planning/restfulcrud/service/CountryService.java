package org.o7planning.restfulcrud.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.o7planning.restfulcrud.dao.CountryDAO;
import org.o7planning.restfulcrud.dao.DepartmentDAO;
import org.o7planning.restfulcrud.dao.EmployeeDAO;
import org.o7planning.restfulcrud.dto.CountryDTO;
import org.o7planning.restfulcrud.dto.EmployeeDTO;
import org.o7planning.restfulcrud.model.Country;
import org.o7planning.restfulcrud.model.Department;


@Path("/countries")
public class CountryService {

	// URI:
	// /contextPath/servletPath/employees
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Country> getEmployees_JSON() {
		List<Country> listOfCountries = CountryDAO.getAll();
		return listOfCountries;
	}
	
	@GET
	@Path("/dto")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<CountryDTO> getEmployee() {
		List<CountryDTO> listOfCountries = CountryDAO.getAllDto();
		return listOfCountries;
	}

	// URI:
	// /contextPath/servletPath/employees/{empNo}
//	@GET
//	@Path("/{empNo}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Employee getEmployee(@PathParam("empNo") String empNo) {
//		return EmployeeDAO.getEmployee(empNo);
//	}
//
//	// URI:
//	// /contextPath/servletPath/employees
//	@POST
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Employee addEmployee(Employee emp) {
//		return EmployeeDAO.addEmployee(emp);
//	}
//
//	// URI:
//	// /contextPath/servletPath/employees
//	@PUT
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Employee updateEmployee(Employee emp) {
//		return EmployeeDAO.updateEmployee(emp);
//	}
//
//	@DELETE
//	@Path("/{empNo}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public void deleteEmployee(@PathParam("empNo") String empNo) {
//		EmployeeDAO.deleteEmployee(empNo);
//	}

}
