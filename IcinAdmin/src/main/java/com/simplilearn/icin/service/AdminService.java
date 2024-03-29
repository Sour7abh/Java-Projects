package com.simplilearn.icin.service;

import java.util.List;

import com.simplilearn.icin.model.ChequebookRequest;
import com.simplilearn.icin.model.Transfer;
import com.simplilearn.icin.model.User;
import com.simplilearn.icin.model.UserDisplay;


public interface AdminService {
	
	public List<UserDisplay> getAllUsers();
	public List<Transfer> getAllTransactions(long accountNo);
	public List<ChequebookRequest> getAllChequebookRequests();
	//public void acceptChequebookRequest(int accNo);
	public void enableUser(String username);
	public void disableUser(String username);
	public void authorizeUser(String username);
	public void cancelAuthorization(String username);
	public List<User> getAllUnauthorizedUsers();
	public void setUserFeatures(String username, int featureId);
	public UserDisplay searchUser(String userDetail);
	void acceptChequebookRequest(long accNo);
	

}
