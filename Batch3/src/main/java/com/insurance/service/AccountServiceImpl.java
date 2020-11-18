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
}
