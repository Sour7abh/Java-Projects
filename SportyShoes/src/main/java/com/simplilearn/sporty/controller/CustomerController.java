package com.simplilearn.sporty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.simplilearn.sporty.entity.Customer;
import com.simplilearn.sporty.entity.Product;
import com.simplilearn.sporty.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer Customer) {
		return service.saveCustomer(Customer);

}
	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return service.getCustomers();
}
	@GetMapping("/customers/{id}")
	public ResponseEntity<Object> getCustomertById(@PathVariable int id) {
    	Customer obj1= service.getCustomerById(id);
    	if(obj1!=null)
        return new ResponseEntity<Object>(obj1,HttpStatus.FOUND);
    	else
    		return new ResponseEntity<Object>("No Customer available with this id",HttpStatus.NOT_FOUND);
        
    	}

	@GetMapping("/customer/{name}")
	public Customer findCustomerByName(@PathVariable String name) {
		return service.getCustomerByName(name);
}
	@PutMapping("/customers/{id}")
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer, @PathVariable int id){
    	Customer obj1 = service.updateCustomer(customer,id);
    	if(obj1!=null)
    		return new ResponseEntity<Object>(obj1,HttpStatus.OK);
    	else 
    		return new ResponseEntity<Object>("No customer available to update",HttpStatus.NOT_FOUND);
    }
	@DeleteMapping("/customers/{id}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable int id) {
       if(service.deleteCustomer(id))
    		   return new ResponseEntity<Object>("Customer deleted",HttpStatus.OK);
       else 
    	   return new ResponseEntity<Object>("No Customer found to delete",HttpStatus.NOT_FOUND);
    }
}
	
	
	
