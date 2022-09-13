package org.o7planning.restfulcrud.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
@Table(name = "DEPARTMENTS")
@XmlRootElement(name = "department")
@XmlAccessorType(XmlAccessType.FIELD)
public class Department {

	@Id
	@Column(name = "DEPARTMENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cR_generator")
	@SequenceGenerator(name = "cR_generator", sequenceName = "DEPARTMENTS_SEQ", allocationSize = 10)
	private Integer id;
	@Column(name = "DEPARTMENT_NAME")
	private String name;
	
	@Column(name = "MANAGER_ID")
	private Integer Managerid;
	
	@ManyToOne
	@JoinColumn(name = "LOCATION_ID")
	private Location location;
	
	@XmlTransient
	@OneToMany(mappedBy="department", fetch = FetchType.EAGER)
	private List<Employee> employees;
	
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

	public Integer getManagerid() {
		return Managerid;
	}

	public void setManagerid(Integer managerid) {
		Managerid = managerid;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
