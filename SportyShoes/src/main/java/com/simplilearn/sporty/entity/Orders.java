package com.simplilearn.sporty.entity;

public class Orders {

	private String name;
	private String productName;
	
	public Orders() {}

	
	public Orders(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


	@Override
	public String toString() {
		return "Orders [name=" + name + ", productName=" + productName + "]";
	}
	
	
}
