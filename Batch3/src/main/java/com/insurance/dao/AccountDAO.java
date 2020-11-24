package com.insurance.dao;

import com.insurance.dto.Account;

public interface AccountDAO {
     public int createAccount(Account account);    
     public Account getAccountByUser(String username);
     public Account getUserByAccount(int accountNumber);
}
