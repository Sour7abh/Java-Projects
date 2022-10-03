package com.simplilearn.icin.service;

import com.simplilearn.icin.details.LoginDetails;
import com.simplilearn.icin.response.LoginResponse;

public interface LoginService {
	
	public LoginResponse customerLogin(LoginDetails details);

}
