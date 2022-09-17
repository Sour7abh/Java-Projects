package com.simplilearn.sporty.entity;

public class Purchase {
	
	private Customer customer;
	
	public Purchase() {}

	public Purchase(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Purchase [customer=" + customer + "]";
	}
	
	

}
