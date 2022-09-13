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

import org.o7planning.restfulcrud.dao.LocationDAO;
import org.o7planning.restfulcrud.model.Location;

@Path("/locations")
public class LocationService {

	// URI:
	// /contextPath/servletPath/Locations
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Location> getEmployees_JSON() {
		List<Location> listOfCountries = LocationDAO.getAllEmployees();
		return listOfCountries;
	}

}// URI:
//	// /contextPath/servletPath/Location/{empNo}
//	@GET
//	@Path("/{empNo}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Location getLocation(@PathParam("empNo") int empNo) {
//		return LocationDAO.getLocation(empNo);
//	}
//
////	// URI:
////	// /contextPath/servletPath/Locations
//	@POST
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Location addLocation(Location emp) {
//		return LocationDAO.addLocation(emp);
//	}
////
////	// URI:
////	// /contextPath/servletPath/employees
//	@PUT
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public Location updateEmployee(Location emp) {
//		return LocationDAO.updateLocation(emp);
//	}
////
//	@DELETE
//	@Path("/{empNo}")
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//	public void deleteLocation(@PathParam("empNo") String empNo) {
//		LocationDAO.deleteLocation(empNo);
//	}
//
//}
