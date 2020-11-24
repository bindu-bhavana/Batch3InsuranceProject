package com.insurance.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.insurance.dto.Account;
import com.insurance.service.AccountService;
import com.insurance.service.AccountServiceImpl;

public class TestAccount {
		/*@Test
		public void testCreateAccountPositive() {
			AccountService service=new AccountServiceImpl();
			Account account=new Account("Teja", "street no.1", "Hyderabad", "Telangana", 509131, "BS1", "teja");
			int rows=service.createAccount(account);
			assertEquals(rows,1);
		}*/
		@Test
		public void testCreateAccountNegative() {
			AccountService service=new AccountServiceImpl();
			Account account=new Account("Kavya", "Gandhi Nagar", "Wanaparthy", "Telangana", 509131, "BS2", "abhay");
			int rows=service.createAccount(account);
			assertNotEquals(rows,1);
	}

}
