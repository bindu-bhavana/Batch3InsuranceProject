package com.insurance.service;

import java.util.List;

import com.insurance.dto.PolicyDetails;
import com.insurance.dto.PolicyQuestions;
import com.insurance.dto.ViewPolicy;

public interface PolicyQuestionsService {
	public List<PolicyQuestions> getPolicyQuestions(String businessSegmentId);
	public int addPolicy(int totalPremium,int accountNumber);
	public int addPolicyDetails(List<String> questionIdList, List<String> answerList,int accountNumber);
	public List<PolicyDetails> getPolicyDetails(int policyNumber);
	public PolicyDetails getPolicy(int accountNumber);
	public ViewPolicy viewPolicy(int accountNumber);
}
