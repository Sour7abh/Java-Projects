package com.simplilearn.sporty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.sporty.entity.Customer;
import com.simplilearn.sporty.entity.Product;
import com.simplilearn.sporty.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo1;
	
	public Customer saveCustomer(Customer Customer) {
        return repo1.save(Customer);
    }

    public List<Customer> getCustomers() {
        return repo1.findAll();
    }

    public Customer getCustomerById(int id) {
    	if(repo1.findById(id).isPresent()) 
        return repo1.findById(id).get();
    	else
    		return null;
    }

    public Customer getCustomerByName(String name) {
        return repo1.findByName(name);
    }

    public boolean deleteCustomer(int id) {
    	if(repo1.findById(id).isPresent()) {
        repo1.deleteById(id);
        return true;
    	}
    	return false;
    	
    }
    public Customer updateCustomer(Customer customer,int id) {
    	if(repo1.findById(id).isPresent()) {
        Customer existingCustomer = repo1.findById(id).get();
        existingCustomer.setName(customer.getName());
        
        return repo1.save(existingCustomer);
    }
    	else
    		return null;

    }
}
