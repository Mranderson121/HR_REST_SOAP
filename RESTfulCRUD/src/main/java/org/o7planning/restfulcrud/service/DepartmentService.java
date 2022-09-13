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

import org.o7planning.restfulcrud.dao.DepartmentDAO;
import org.o7planning.restfulcrud.dao.EmployeeDAO;
import org.o7planning.restfulcrud.dto.DepartmentDTO;
import org.o7planning.restfulcrud.dto.EmployeeDTO;
import org.o7planning.restfulcrud.model.Department;


@Path("/departments")
public class DepartmentService {

	// URI:
	// /contextPath/servletPath/departments
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Department> getDepartmens_JSON() {
		List<Department> listOfCountries = DepartmentDAO.getAll();
		return listOfCountries;
	}

	@GET
	@Path("/dto")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<DepartmentDTO> getDepartment() {
		List<DepartmentDTO> listOfDepartment = DepartmentDAO.getAllDto();
		return listOfDepartment;
	}
	
	// URI:
	// /contextPath/servletPath/departments/{empNo}
	@GET
	@Path("/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Department getDepartmen(@PathParam("empNo") int empNo) {
		return DepartmentDAO.getDepartment(empNo);
	}
//
//	// URI:
//	// /contextPath/servletPath/departments
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Department addDepartment(Department emp) {
	return DepartmentDAO.addDepartment(emp);
	}
//
//	// URI:
//	// /contextPath/servletPath/employees
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Department updateDepartmen(Department emp) {
		return DepartmentDAO.updateDepartment(emp);
	}
//
	@DELETE
	@Path("/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteDepartment(@PathParam("empNo") int empNo) {
		DepartmentDAO.deleteDepartment(empNo);
	}

}
