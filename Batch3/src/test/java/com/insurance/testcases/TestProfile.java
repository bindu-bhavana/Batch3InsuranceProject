package com.insurance.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.insurance.dto.UserRole;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;

public class TestProfile {
	@Test
	public void testCreateProfilePositive() {
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=new UserRole("phoebe","phoebe123","333");
		int rows=service.createUser(user);
		assertEquals(rows,1);
	}
	@Test
	public void testCreateProfileNegative() {
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=new UserRole("kavya","kavya123","333");
		int rows=service.createUser(user);
		assertNotEquals(rows,1);
	}
}
