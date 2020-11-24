package com.insurance.testcases;
import static org.junit.Assert.*;
import org.junit.Test;

import com.insurance.dto.UserRole;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;
public class TestLogin {
	@Test
	public void testLoginPositive() {
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=service.getUserByName("admin");
		assertEquals(user.getRoleCode(),"111");
	}
	@Test
	public void testLoginNegative() {
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=service.getUserByName("admin");
		assertNotEquals(user.getPassword(),"ADMIN123");
	}
}
