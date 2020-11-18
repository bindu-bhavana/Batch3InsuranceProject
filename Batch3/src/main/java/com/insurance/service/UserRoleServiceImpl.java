package com.insurance.service;

import java.util.List;

import com.insurance.dao.UserRoleDAO;
import com.insurance.dao.UserRoleDAOImpl;
import com.insurance.dto.UserRole;

public class UserRoleServiceImpl implements UserRoleService{
    private UserRoleDAO dao=new UserRoleDAOImpl();
	@Override
	public int createUser(UserRole user) {
		int rows=dao.createUser(user);
		return rows;
	}

	@Override
	public List<UserRole> viewUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole getUserByName(String username) {
		UserRole user=new UserRole();
		user=dao.getUserByName(username);
		return user;
	}

}
