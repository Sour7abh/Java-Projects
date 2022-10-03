package com.simplilearn.icin.service;

import com.simplilearn.icin.model.Account;
import com.simplilearn.icin.response.DepositResponse;
import com.simplilearn.icin.response.TransferResponse;
import com.simplilearn.icin.response.WithdrawResponse;

public interface AccountService {

	public Account newAccount(String username,int userId);
	public Account getAccount(String username);
	public DepositResponse deposit(long acc,int amount);
	public WithdrawResponse withdraw(long acc,int amount);
	public TransferResponse transfer(long saccount,long raccount,int amount);
	public Account getAccountDetails(long account);
	public Account updateAccount(Account account);
}
