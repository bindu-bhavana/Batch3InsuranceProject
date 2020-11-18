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

}
