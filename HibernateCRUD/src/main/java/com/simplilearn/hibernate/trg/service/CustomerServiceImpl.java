package com.simplilearn.hibernate.trg.service;

import java.util.List;
import java.util.Set;

import com.simplilearn.hibernate.trg.dao.CustomerDAO;
import com.simplilearn.hibernate.trg.dao.CustomerDaoImpl;
import com.simplilearn.hibernate.trg.dto.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO dao;
	public CustomerServiceImpl() {
		dao = new CustomerDaoImpl();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(int customerId, String address) {
		dao.updateCustomer(customerId, address);
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		dao.deleteCustomer(customerId);
		
	}

	@Override
	public Customer searchCustomer(int customerId) {
		return dao.searchCustomer(customerId);
	}

	@Override
	public Set<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}

	@Override
	public List<String> getAllCustomerNames() {
		return dao.getAllCustomerNames();
	}

}
