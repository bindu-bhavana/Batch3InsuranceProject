package com.insurance.dao;

import java.util.List;

import com.insurance.dto.UserRole;

public interface UserRoleDAO {
    public int createUser(UserRole user);
    public List<UserRole> viewUsers();
    public UserRole getUserByName(String username);
}
