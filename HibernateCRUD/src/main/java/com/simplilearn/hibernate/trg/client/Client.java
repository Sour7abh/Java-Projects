package com.simplilearn.hibernate.trg.client;

import java.util.List;
import java.util.Set;

import com.simplilearn.hibernate.trg.dto.Customer;
import com.simplilearn.hibernate.trg.service.CustomerService;
import com.simplilearn.hibernate.trg.service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
//		//add Customer
//		Customer customer = new Customer("Asha", "Pune");
//		Integer custId = service.addCustomer(customer);
//		System.out.println("Customer ID : " + custId);
		
		//update Customer
		//service.updateCustomer(4, "Delhi");
		
		//delete Customer
		//service.deleteCustomer(7);
		
		//search Customer
//		Customer customer2 = service.searchCustomer(4);
//		System.out.println(customer2);
		
		//Get all customers in console
//		Set<Customer> customers = service.getAllCsutomers();
//		for (Customer customer : customers) {
//			System.out.println(customer);
//			
//		}
	//	System.out.println(customers);
		System.out.println("***************************************");
		List<String> names = service.getAllCustomerNames();
		for (String string : names) {
			System.out.println(string);
		}
		
	}
}

