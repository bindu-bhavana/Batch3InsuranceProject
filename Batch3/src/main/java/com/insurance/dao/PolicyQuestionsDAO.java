package com.insurance.dao;

import java.util.List;

import com.insurance.dto.PolicyQuestions;

public interface PolicyQuestionsDAO {
     public List<PolicyQuestions> getPolicyQuestions(String businessSegmentId);
     public int addPolicy(int totalPremium,int accountNumber);
     public int addPolicyDetails(List<Integer> wlist,String businessSegmentId);
}
