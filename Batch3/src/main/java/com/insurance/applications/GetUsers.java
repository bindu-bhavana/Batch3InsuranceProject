package com.insurance.applications;

import java.util.Scanner;

import com.insurance.dto.UserRole;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;

public class GetUsers {

	public static void main(String[] args) {
		UserRoleService service=new UserRoleServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username & password");
		String username;
		username=sc.next();
		UserRole user=service.getUserByName(username);
			System.out.println(user.getUsername()+" "+user.getPassword()+" "+user.getRoleCode());
		sc.close();	
	}

}
