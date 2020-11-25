package com.insurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.insurance.dto.Account;
import com.insurance.dto.Generation;
import com.insurance.dto.PolicyDetails;
import com.insurance.dto.PolicyQuestions;
import com.insurance.dto.UserRole;
import com.insurance.dto.ViewPolicy;
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
	@Override
	public int addPolicy(int totalPremium, int accountNumber) {
			con=DatabaseConnection.getConnection();
			int rows=0;
			try {
				pst=con.prepareStatement(InsuranceDBQueries.ADDPOLICY);
				pst.setInt(1,totalPremium);
				pst.setInt(2,accountNumber);
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
	public List<PolicyDetails> getPolicyDetails(int policyNumber) {
		con=DatabaseConnection.getConnection();
		List<PolicyDetails> pdlist=new ArrayList<PolicyDetails>();
		try {
			pst=con.prepareStatement(InsuranceDBQueries.GETPOLICY);
			pst.setInt(1,policyNumber);
			rs=pst.executeQuery();
			while(rs.next()) {
				PolicyDetails pd=new PolicyDetails();
				pd.setQuestionId(rs.getString(1));
				pd.setAnswer(rs.getString(2));
				pdlist.add(pd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}		
		return pdlist;
	}
	@Override
	public PolicyDetails getPolicy(int accountNumber) {
		con=DatabaseConnection.getConnection();
		PolicyDetails pd=null;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.GETPOLICY);
			pst.setInt(1,accountNumber);
			rs=pst.executeQuery();
			if(rs.next()) {
				pd=new PolicyDetails();
				pd.setPolicyNumber(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return pd;
	}
	@Override
	public ViewPolicy viewPolicy(int accountNumber) {
		con=DatabaseConnection.getConnection();
		ViewPolicy vp=null;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.VIEWPOLICY);
			pst.setInt(1,accountNumber);
			rs=pst.executeQuery();
			while(rs.next()) {
				vp=new ViewPolicy();
				vp.setPolicyNumber(rs.getInt(1));
				vp.setPolicyPremium(rs.getInt(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return vp;
	}
	@Override
	public List<Generation> generateReport(int accountNumber) {
		con=DatabaseConnection.getConnection();
		List<Generation> rglist=new ArrayList<Generation>();
		try {
			pst=con.prepareStatement(InsuranceDBQueries.GENERATEREPORT);
			pst.setInt(1,accountNumber);
			rs=pst.executeQuery();
			while(rs.next()) {
				Generation rg=new Generation();
				rg.setInsuredName(rs.getString(1));
				rg.setInsuredStreet(rs.getString(2));
				rg.setInsuredCity(rs.getString(3));
				rg.setInsuredState(rs.getString(4));
				rg.setInsuredZip(rs.getInt(5));
				rg.setBusinessSegment(rs.getString(6));
				rg.setQuestionDescription(rs.getString(7));
				rg.setTotalPremium(rs.getInt(8));
				rg.setAnswer(rs.getString(9));
				rglist.add(rg);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return rglist;
	}
	@Override
	public int addPolicyDetails(int policyNumber, List<String> questionIdList, List<String> answerList) {
		con=DatabaseConnection.getConnection();
		int rows=0;
		try {
			pst=con.prepareStatement(InsuranceDBQueries.ADDPOLICYDETAILS);
			for(int i=0;i<questionIdList.size();i++) {
			    pst.setInt(1,policyNumber);
			    pst.setString(2,questionIdList.get(i));
			    pst.setString(3, answerList.get(i));
			    rows=pst.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
	return rows;
	}
}
