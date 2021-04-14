package com.example.spring.entitty;

public class Zip {
	
	private long zip;
	private String state;
	private String City;
	private String country;
	public Zip(long zip, String state, String city, String country) {
		super();
		this.zip = zip;
		this.state = state;
		City = city;
		this.country = country;
	}
	public Zip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
