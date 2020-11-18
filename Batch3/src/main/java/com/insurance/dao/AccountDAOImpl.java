package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.insurance.dto.Account;
import com.insurance.utils.DatabaseConnection;
import com.insurance.utils.InsuranceDBQueries;

public class AccountDAOImpl implements AccountDAO{
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int createAccount(Account account) {
		con=DatabaseConnection.getConnection();
		int rows=0;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.CREATEACCOUNT);
			pst.setString(1,account.getInsuredName());
			pst.setString(2,account.getInsuredStreet());
			pst.setString(3,account.getInsuredCity());
			pst.setString(4,account.getInsuredState());
			pst.setInt(5,account.getInsuredZip());
			pst.setString(6,account.getBusinessSegment());
			pst.setString(7,account.getUserName());
			rows=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return rows;
		
	}

}
