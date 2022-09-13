package org.o7planning.restfulcrud.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
@XmlAccessorType(XmlAccessType.FIELD) 
public class CountryDTO implements Serializable {

	private static final long serialVersionUID = 6754529219893555249L;
	private String id;
	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CountryDTO() {
		super();
	}

	public CountryDTO(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

}
