package com.simplilearn.icin.service;

import com.simplilearn.icin.details.UpdateDetails;
import com.simplilearn.icin.model.User;
import com.simplilearn.icin.model.UserDisplay;
import com.simplilearn.icin.response.UpdateResponse;

public interface ProfileService {

	public UpdateResponse updateUser(UpdateDetails user);
	public User getUser(String username);
	public UserDisplay userDisplay(String username);

}
