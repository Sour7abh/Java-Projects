package com.simplilearn.icin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.icin.details.LoginDetails;
import com.simplilearn.icin.response.LoginResponse;
import com.simplilearn.icin.service.impl.LoginServiceImpl;


@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {
	
	@Autowired
	LoginServiceImpl service;
	
	@PostMapping("/login")
	public LoginResponse userLogin(@RequestBody LoginDetails details) {
		
		return service.customerLogin(details);
		
	}

}
