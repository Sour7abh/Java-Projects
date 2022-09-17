package com.simplilearn.sporty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simplilearn.sporty.entity.Customer;
import com.simplilearn.sporty.entity.Orders;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
    
   
    public Customer findByName(String name);
}


