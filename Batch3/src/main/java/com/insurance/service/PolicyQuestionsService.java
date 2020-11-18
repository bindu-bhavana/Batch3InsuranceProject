package com.insurance.service;

import java.util.List;

import com.insurance.dto.PolicyQuestions;

public interface PolicyQuestionsService {
	public List<PolicyQuestions> getPolicyQuestions(String businessSegmentId);
}
