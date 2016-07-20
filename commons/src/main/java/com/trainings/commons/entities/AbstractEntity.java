package com.trainings.commons.entities;

import com.trainings.commons.dao.PersistableData;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity implements PersistableData<String>{
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name="ID", unique = true, nullable = false)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isNew() {
		return null == this.getId();
	}
}
