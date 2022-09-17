package com.simplilearn.trg.hibernate.beans;

import java.util.List;

public class Employee {
	private Integer empId;
	private String empName;
	private List<String> technologyStack;
	
	 public Employee() {}

	public Employee(String empName, List<String> technologyStack) {
		this.empName = empName;
		this.technologyStack = technologyStack;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getTechnologyStack() {
		return technologyStack;
	}

	public void setTechnologyStack(List<String> technologyStack) {
		this.technologyStack = technologyStack;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", technologyStack=" + technologyStack + "]";
	}
	 
	 
	

}
