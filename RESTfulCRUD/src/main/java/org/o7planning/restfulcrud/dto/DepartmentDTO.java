package org.o7planning.restfulcrud.dto;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
@XmlAccessorType(XmlAccessType.FIELD) 
public class DepartmentDTO implements Serializable {

	

	private static final long serialVersionUID = 6754529219893555249L;
	
	
	private Integer id;
	private String name;
	private String locationcity;
	private String locationstreet;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocationcity() {
		return locationcity;
	}
	public void setLocationcity(String locationcity) {
		this.locationcity = locationcity;
	}
	public String getLocationstreet() {
		return locationstreet;
	}
	public void setLocationstreet(String locationstreet) {
		this.locationstreet = locationstreet;
	}
	public DepartmentDTO(Integer id, String name, String locationcity, String locationstreet) {
		super();
		this.id = id;
		this.name = name;
		this.locationcity = locationcity;
		this.locationstreet = locationstreet;
	}
	public DepartmentDTO() {
		super();
	}
	
	
	
}