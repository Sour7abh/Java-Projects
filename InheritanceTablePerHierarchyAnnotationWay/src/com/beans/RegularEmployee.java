package com.beans;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("reg_emp")
public class RegularEmployee extends Employee{
	@Column
	private float salary;
	
	@Column
	private int bonus;
	
	public RegularEmployee() {}
	
	

	public RegularEmployee(String name,float salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}



	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}

	
}
