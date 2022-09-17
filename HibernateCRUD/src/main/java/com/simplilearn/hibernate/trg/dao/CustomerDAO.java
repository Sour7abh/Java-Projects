package com.simplilearn.hibernate.trg.dao;

import java.util.List;
import java.util.Set;

import com.simplilearn.hibernate.trg.dto.Customer;

public interface CustomerDAO {
	public Integer addCustomer(Customer customer);
	public void updateCustomer(int customerId,String address);
	public void deleteCustomer(int customerId);
	public Customer searchCustomer(int customerId);
	public Set<Customer> getAllCustomers();
	public List<String> getAllCustomerNames();

}
