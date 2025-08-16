package com.EKart.Company.Entities;

import jakarta.persistence.Entity;

@Entity
public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}
	private String  number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	private String Street;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}

}
