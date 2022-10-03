package com.simplilearn.icin.service;

import com.simplilearn.icin.model.User;
import com.simplilearn.icin.response.RegisterResponse;

public interface RegistrationService {

	public RegisterResponse createAccount(User details); 
	public boolean usernameAlreadyExists(String username);
	public boolean EmailAlreadyExists(String email);
	public boolean PhoneAlreadyExists(long l);
}
