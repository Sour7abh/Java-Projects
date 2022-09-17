package com.beans;

public class RegularEmployee extends Employee{
	private float salary;
	private int bonus;
	
	public RegularEmployee() {}

	public RegularEmployee(String name, int bonus, float salary) {
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
