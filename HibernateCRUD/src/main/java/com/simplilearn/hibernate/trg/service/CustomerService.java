package com.simplilearn.hibernate.trg.service;

import java.util.List;
import java.util.Set;

import com.simplilearn.hibernate.trg.dto.Customer;

public interface CustomerService {
	public Integer addCustomer(Customer customer);
	public void updateCustomer(int customerId,String address);
	public void deleteCustomer(int customerId);
	public Customer searchCustomer(int customerId);
	public Set<Customer> getAllCustomers();
	public List<String> getAllCustomerNames();
}
