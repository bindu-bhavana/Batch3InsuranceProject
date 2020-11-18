package com.insurance.applications;

import com.insurance.dto.Account;
import com.insurance.service.AccountService;
import com.insurance.service.AccountServiceImpl;

public class GetAccount {

	public static void main(String[] args) {
		AccountService service=new AccountServiceImpl();
		Account account=new Account("Kavya","Gandhi Nagar","Wanaparthy","Telangana",509131,"Restaurant","kavya");
		int rows=service.createAccount(account);
		if(rows>0)
			System.out.println("Inserted");
		else
			System.out.println("Not Inserted");
	}

}
