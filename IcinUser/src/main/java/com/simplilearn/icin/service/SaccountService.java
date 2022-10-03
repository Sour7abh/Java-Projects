package com.simplilearn.icin.service;

import com.simplilearn.icin.model.Saccount;
import com.simplilearn.icin.response.DepositResponse;
import com.simplilearn.icin.response.TransferResponse;
import com.simplilearn.icin.response.WithdrawResponse;

public interface SaccountService {
	
	public Saccount getAccountDetails(long account);
	public Saccount getAccount(String username);
	public Saccount newAccount(String username,int userId);
	public DepositResponse deposit(long acc,int amount);
	public WithdrawResponse withdraw(long acc,int amount);
	public TransferResponse transfer(long saccount,long raccount,int amount);

}
