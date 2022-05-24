package com.example.carworkflow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Manufacture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column( name= "WORK",nullable=true)
	private String work;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Manufacture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manufacture(int id, String work) {
		super();
		this.id = id;
		this.work = work;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}

}
