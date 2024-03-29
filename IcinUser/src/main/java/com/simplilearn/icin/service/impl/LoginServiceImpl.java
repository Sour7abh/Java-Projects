package com.simplilearn.icin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;

import com.simplilearn.icin.dao.UserRepository;
import com.simplilearn.icin.details.LoginDetails;
import com.simplilearn.icin.model.User;
import com.simplilearn.icin.response.LoginResponse;
import com.simplilearn.icin.service.LoginService;



@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository dao;
	
	@Override
	public LoginResponse customerLogin(LoginDetails login){
		LoginResponse response = new LoginResponse();
		boolean flag = true;
		String message = "Login succesfull";
		User user = null;
		String hashedPassword = DigestUtils.sha256Hex(login.getPassword());
		try {
			user=dao.findByUsername(login.getUsername());
			if(user.getStatus()) {
				flag = false;
				message = "Dear Mr/Ms."+user.getFname()+" your account has been blocked for security reasons.";
			}
			if(!user.getAuthorizationStatus()) {
				flag = false;
				message = "Dear Mr/Ms."+user.getFname()+" your account has not been activated yet";
			}
			if(!hashedPassword.equals(user.getPassword())) {
				flag = false;
				message = "Username or password is incorrect";
			}
		} 
		catch (Exception e) {
			flag = false;
			message = "Username or password is incorrect";
		}
		
		response.setLoginStatus(flag);
		response.setResponseMessage(message);
		try {
			response.setUsername(user.getUsername());
		} catch (Exception e) {
			response.setUsername(login.getUsername());
		}
		return response;
	}


}
