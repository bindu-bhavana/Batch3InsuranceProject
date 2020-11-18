package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.insurance.utils.DatabaseConnection;
import com.insurance.utils.InsuranceDBQueries;
import com.insurance.dto.UserRole;

public class UserRoleDAOImpl implements UserRoleDAO{
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int createUser(UserRole user) {
		con=DatabaseConnection.getConnection();
		int rows=0;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.CREATEUSER);
			pst.setString(1,user.getUsername());
			pst.setString(2,user.getPassword());
			pst.setString(3,user.getRoleCode());
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return rows;
	}

	@Override
	public List<UserRole> viewUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole getUserByName(String username) {
		con=DatabaseConnection.getConnection();
		UserRole user=null;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.GETUSERBYNAME);
			pst.setString(1,username);
			rs=pst.executeQuery();
			if(rs.next()) {
				user=new UserRole();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setRoleCode(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return user;
	}

}
