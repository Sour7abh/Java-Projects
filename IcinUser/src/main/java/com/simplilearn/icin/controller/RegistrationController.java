package com.simplilearn.icin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.icin.model.User;
import com.simplilearn.icin.response.RegisterResponse;
import com.simplilearn.icin.service.RegistrationService;



@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegistrationController {

	@Autowired
	private RegistrationService service;

	@PostMapping("/register")
	public RegisterResponse createUser(@RequestBody User user) {

		return service.createAccount(user);
	}
}
