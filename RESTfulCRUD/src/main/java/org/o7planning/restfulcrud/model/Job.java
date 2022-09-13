package org.o7planning.restfulcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "JOB")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "JOBS")
public class Job {

	@Id
	@Column(name = "JOB_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name = "JOB_TITLE")
	private String name;
	@Column(name = "MIN_SALARY")
	private Integer minSalary;
	@Column(name = "MAX_SALARY")
	private Integer maxSalary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}
	public Integer getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}
	
	
}