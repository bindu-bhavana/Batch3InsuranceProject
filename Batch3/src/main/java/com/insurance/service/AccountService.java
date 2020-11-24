package com.insurance.service;

import com.insurance.dto.Account;

public interface AccountService {
	 public int createAccount(Account account);
	 public Account getAccountByUser(String username);
	 public Account getUserByAccount(int accountNumber);
}
