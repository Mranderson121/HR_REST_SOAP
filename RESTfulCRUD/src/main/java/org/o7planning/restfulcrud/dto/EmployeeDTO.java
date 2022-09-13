package org.o7planning.restfulcrud.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD) 
public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 6754529219893555249L;

	private Integer id;
	private String name;
	private String lastName;
	private String departmentName;

	public EmployeeDTO() {
		super();
	}
	
	public EmployeeDTO(Integer id, String name, String lastName, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.departmentName=departmentName;

	}



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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


}