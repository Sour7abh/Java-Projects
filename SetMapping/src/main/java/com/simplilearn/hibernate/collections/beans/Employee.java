package com.simplilearn.hibernate.collections.beans;

import java.util.Set;

public class Employee {

	private int empID;
	private String empName;
	private Set<String> technologystack;
	
	public Employee() {}

	public Employee(String empName, Set<String> technologystack) {
		super();
		this.empName = empName;
		this.technologystack = technologystack;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<String> getTechnologystack() {
		return technologystack;
	}

	public void setTechnologystack(Set<String> technologystack) {
		this.technologystack = technologystack;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", technologystack=" + technologystack + "]";
	}
	
	
}
