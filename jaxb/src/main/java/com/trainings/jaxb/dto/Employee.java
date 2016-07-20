package com.trainings.jaxb.dto;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlRootElement(name="employee")  
public class Employee {
	private int id;  
	private String name;  
	private float salary;  
	
	private List<Contact> contact;

	@XmlAttribute(name="id")  
	public int getId() {  
	    return id;  
	}  
	
	public void setId(int id) {  
	    this.id = id;  
	}  
	
	@XmlElement(name="name")  
	public String getName() {  
	    return name;  
	}  
	
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	@XmlElement(name="salary")  
	public float getSalary() {  
	    return salary;  
	} 
	
	public void setSalary(float salary) {  
	    this.salary = salary;  
	}  
	
	@XmlElementWrapper(name = "contacts")
	@XmlElement
	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
}
