package com.simplilearn.trg.hibernate.collections.beans;

import java.util.Map;

public class Employee {
	private int empID;
	private String empName;
	private Map<String,Integer> technologyExperience;
	
	public Employee() {}

	public Employee(String empName, Map<String, Integer> technologyExperience) {
		super();
		this.empName = empName;
		this.technologyExperience = technologyExperience;
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

	public Map<String, Integer> getTechnologyExperience() {
		return technologyExperience;
	}

	public void setTechnologyExperience(Map<String, Integer> technologyExperience) {
		this.technologyExperience = technologyExperience;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", technologyExperience=" + technologyExperience
				+ "]";
	}

	
}
