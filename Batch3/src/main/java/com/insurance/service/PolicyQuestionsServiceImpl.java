package com.insurance.service;

import java.util.List;

import com.insurance.dao.PolicyQuestionsDAO;
import com.insurance.dao.PolicyQuestionsDAOImpl;
import com.insurance.dto.PolicyQuestions;

public class PolicyQuestionsServiceImpl implements PolicyQuestionsService{
    private PolicyQuestionsDAO dao=new PolicyQuestionsDAOImpl();
	@Override
	public List<PolicyQuestions> getPolicyQuestions(String businessSegmentId) {
		List<PolicyQuestions> pqlist=dao.getPolicyQuestions(businessSegmentId);
		return pqlist;
	}
	@Override
	public int addPolicy(int totalPremium, int accountNumber) {
		int rows=dao.addPolicy(totalPremium, accountNumber);
		return rows;
	}
	@Override
	public int addPolicyDetails(List<Integer> wlist, String businessSegmentId) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
