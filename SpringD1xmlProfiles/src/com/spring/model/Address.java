package com.spring.model;

public class Address {
	private String street;
	private String city;
	private String countery;
	private String zip;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String countery, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.countery = countery;
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountery() {
		return countery;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + "\n, city=" + city + "\n, countery=" + countery + "\n, zip=" + zip + "\n]";
	}
	
	
}
