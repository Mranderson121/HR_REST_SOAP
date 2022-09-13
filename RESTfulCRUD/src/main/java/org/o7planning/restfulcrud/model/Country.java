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

@XmlRootElement(name = "country")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "COUNTRIES")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name = "COUNTRY_NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;
	
	@XmlTransient
	@OneToMany(mappedBy="country", fetch = FetchType.EAGER)
	private List<Location> locations;

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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	

}