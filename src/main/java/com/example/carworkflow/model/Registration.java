package com.example.carworkflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String EmailId;
	private String Password;
	private int PhoneNumber;
	private String Address;
	private int Bankaccount;
	private String Ifsc;
//	private int id;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getBankaccount() {
		return Bankaccount;
	}
	public void setBankaccount(int bankaccount) {
		Bankaccount = bankaccount;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public Registration(int id, String name, String emailId, String password, int phoneNumber, String address,
			int bankaccount, String ifsc) {
		super();
		this.id = id;
		Name = name;
		EmailId = emailId;
		Password = password;
		PhoneNumber = phoneNumber;
		Address = address;
		Bankaccount = bankaccount;
		Ifsc = ifsc;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
