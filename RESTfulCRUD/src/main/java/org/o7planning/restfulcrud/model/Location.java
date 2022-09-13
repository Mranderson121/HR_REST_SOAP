package org.o7planning.restfulcrud.model;

import java.util.List;

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

@XmlRootElement(name = "Location")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "LOCATIONS")
public class Location {

	@Id
	@Column(name = "LOCATION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loc_seq")
	@SequenceGenerator(name = "loc_seq", sequenceName = "LOCATIONS_SEQ", allocationSize = 100 )
	private Integer id;
	
	@Column(name = "STREET_ADDRESS")
	private String streetAddress;
	@Column(name = "POSTAL_CODE")
	private String postalCode;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE_PROVINCE")
	private String stateProvince;
	
	@ManyToOne
	@JoinColumn(name="COUNTRY_ID")
	private Country country;
	
	@XmlTransient
	@OneToMany(mappedBy="location", fetch = FetchType.EAGER)
	private List<Department> departments;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


}