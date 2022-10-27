package com.empower.hr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Float marks;
	
	public Candidate() {}

	public Candidate(Integer id, String name, Float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}
	
}
