package com.midhun.springAssignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonsModel {
	
	@Id
	int Id;
	String Firstname;
	String Lastname;
	String City;
	String Address;
	
	public PersonsModel() {}
	
	public PersonsModel(int id, String firstname, String lastname, String city, String address) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		City = city;
		Address = address;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
}
