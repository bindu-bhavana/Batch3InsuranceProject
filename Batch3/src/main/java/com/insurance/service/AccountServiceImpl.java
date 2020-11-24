package com.insurance.service;

import com.insurance.dao.AccountDAO;
import com.insurance.dao.AccountDAOImpl;
import com.insurance.dto.Account;

public class AccountServiceImpl implements AccountService{
    private AccountDAO dao=new AccountDAOImpl();
	@Override
	public int createAccount(Account account) {
		int rows=dao.createAccount(account);
		return rows;
	}
	@Override
	public Account getAccountByUser(String username) {
		Account account=dao.getAccountByUser(username);
		return account;
	}
	@Override
	public Account getUserByAccount(int accountNumber) {
		Account account=dao.getUserByAccount(accountNumber);
		return account;
	}
}
