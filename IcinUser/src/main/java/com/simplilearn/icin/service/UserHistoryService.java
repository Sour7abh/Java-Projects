package com.simplilearn.icin.service;

import java.util.List;

import com.simplilearn.icin.model.UserHistory;

public interface UserHistoryService {

	public UserHistory addAction(long account,int amount,int balance,String action);
	public List<UserHistory> getHistory(long account);
}
