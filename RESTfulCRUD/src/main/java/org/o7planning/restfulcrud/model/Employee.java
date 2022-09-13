package org.o7planning.restfulcrud.model;

import java.sql.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "EMPLOYEES")
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD) 
@DynamicUpdate
public class Employee {


	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
	@SequenceGenerator(name = "c_generator", sequenceName = "EMPLOYEES_SEQ")
	private Integer id;
	@Column(name = "FIRST_NAME")
	private String name;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	@Column(name = "JOB_ID")
	private String jobId;
	@Column(name = "SALARY")
	private Integer salary;
	@Column(name = "COMMISSION_PCT")
	private Integer commisionPct;
	
//	@ManyToOne(cascade = { CascadeType.ALL })
//	@JoinColumn(name = "MANAGER_ID")
//	private Employee manager;

	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID", referencedColumnName="DEPARTMENT_ID")
	private Department department;
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(Integer commisionPct) {
		this.commisionPct = commisionPct;
	}

//	public Employee getManager() {
//		return manager;
//	}
//
//	public void setManagerId(Employee manager) {
//		this.manager = manager;
//	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}




}