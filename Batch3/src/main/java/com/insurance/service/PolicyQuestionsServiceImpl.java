package com.insurance.service;

import java.util.ArrayList;
import java.util.List;

import com.insurance.dao.PolicyQuestionsDAO;
import com.insurance.dao.PolicyQuestionsDAOImpl;
import com.insurance.dto.Generation;
import com.insurance.dto.PolicyDetails;
import com.insurance.dto.PolicyQuestions;
import com.insurance.dto.ViewPolicy;

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
	public int addPolicyDetails(List<String> questionIdList, List<String> answerList,int accountNumber) {
		int rows=dao.addPolicyDetails(questionIdList,answerList, accountNumber);			
		return rows;
	}
	@Override
	public List<PolicyDetails> getPolicyDetails(int policyNumber) {
		List<PolicyDetails> pdlist=dao.getPolicyDetails(policyNumber);
		return pdlist;
	}
	@Override
	public PolicyDetails getPolicy(int accountNumber) {
		PolicyDetails pd=new PolicyDetails();
		pd=dao.getPolicy(accountNumber);
		return pd;
	}
	@Override
	public ViewPolicy viewPolicy(int accountNumber) {
		ViewPolicy vp=dao.viewPolicy(accountNumber);
		return vp;
	}
	@Override
	public List<Generation> generateReport(int accountNumber) {
		List<Generation> rglist=new ArrayList<Generation>();
		rglist=dao.generateReport(accountNumber);
		return rglist;

	}
	

}
