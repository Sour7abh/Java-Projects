package com.simplilearn.ph2.dto;

public class Students {

	private int id;
	private String fname;
	private String lname;
	private int age;
	private int aclass;
	
	public Students() {}

	public Students(int id, String fname, String lname, int age, int aclass) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.aclass = aclass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAclass() {
		return aclass;
	}

	public void setAclass(int aclass) {
		this.aclass = aclass;
	}

    
}
