package com.spring_rest.springrest1.entities;

public class Course {
	private int id;
	private  String name;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
