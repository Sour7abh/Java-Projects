package com.simplilearn.sporty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sporty.entity.Customer;
import com.simplilearn.sporty.entity.Orders;
import com.simplilearn.sporty.entity.Purchase;
import com.simplilearn.sporty.repository.CustomerRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody Purchase request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerRepository.findAll();
	}
	
	
		
	}

