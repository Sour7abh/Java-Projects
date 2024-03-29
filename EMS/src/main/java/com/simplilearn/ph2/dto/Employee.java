package com.simplilearn.ph2.dto;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	
	public Employee() {}

	public Employee(int empId, String empName, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
