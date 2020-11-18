package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.insurance.dto.PolicyQuestions;
import com.insurance.utils.DatabaseConnection;
import com.insurance.utils.InsuranceDBQueries;

public class PolicyQuestionsDAOImpl implements PolicyQuestionsDAO{
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<PolicyQuestions> getPolicyQuestions(String businessSegmentId) {
		con=DatabaseConnection.getConnection();
		List<PolicyQuestions> pqlist=new ArrayList<PolicyQuestions>();
		try {
			pst=con.prepareStatement(InsuranceDBQueries.GETPOLICYQUESTIONS);
			pst.setString(1,businessSegmentId);
			rs=pst.executeQuery();
			while(rs.next()) {
				PolicyQuestions pq=new PolicyQuestions();
				pq.setPolicyQuestionId(rs.getString(1));
				pq.setPolicyQuestionDescription(rs.getString(2));
				pq.setPolicyQuestionAnswer1(rs.getString(3));
				pq.setPolicyQuestionWeightage1(rs.getInt(4));
				pq.setPolicyQuestionAnswer2(rs.getString(5));
				pq.setPolicyQuestionWeightage2(rs.getInt(6));
				pq.setPolicyQuestionAnswer3(rs.getString(7));
				pq.setPolicyQuestionWeightage3(rs.getInt(8));
				pqlist.add(pq);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}		
		return pqlist;
	}

}
