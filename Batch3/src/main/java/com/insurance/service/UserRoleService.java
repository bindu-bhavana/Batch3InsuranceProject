package com.insurance.service;

import java.util.List;

import com.insurance.dto.UserRole;

public interface UserRoleService {
    public int createUser(UserRole user);
    public List<UserRole> viewUsers();
    public UserRole getUserByName(String username);
}
