package com.trainings.jaxb.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="contact")
public class Contact {
	private int id;
	private String number;
	
	public Contact(){}
	
	public Contact(int id,  String number){
		this.id = id;
		this.number = number;
	}
	
	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name = "number")
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
}
