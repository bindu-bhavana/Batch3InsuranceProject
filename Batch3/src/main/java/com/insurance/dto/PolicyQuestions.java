package com.insurance.dto;

public class PolicyQuestions {
    private String policyQuestionId;
    private String businessSegmentId;
    private String policyQuestionDescription;
    private String policyQuestionAnswer1;
    private int policyQuestionWeightage1;
    private String policyQuestionAnswer2;
    private int policyQuestionWeightage2;
    private String policyQuestionAnswer3;
    private int policyQuestionWeightage3;
    public PolicyQuestions() {
    }
	public PolicyQuestions(String policyQuestionId, String businessSegmentId, String policyQuestionDescription,
			String policyQuestionAnswer1, int policyQuestionWeightage1, String policyQuestionAnswer2,
			int policyQuestionWeightage2, String policyQuestionAnswer3, int policyQuestionWeightage3) {
		this.policyQuestionId = policyQuestionId;
		this.businessSegmentId = businessSegmentId;
		this.policyQuestionDescription = policyQuestionDescription;
		this.policyQuestionAnswer1 = policyQuestionAnswer1;
		this.policyQuestionWeightage1 = policyQuestionWeightage1;
		this.policyQuestionAnswer2 = policyQuestionAnswer2;
		this.policyQuestionWeightage2 = policyQuestionWeightage2;
		this.policyQuestionAnswer3 = policyQuestionAnswer3;
		this.policyQuestionWeightage3 = policyQuestionWeightage3;
	}
	public String getPolicyQuestionId() {
		return policyQuestionId;
	}
	public void setPolicyQuestionId(String policyQuestionId) {
		this.policyQuestionId = policyQuestionId;
	}
	public String getBusinessSegmentId() {
		return businessSegmentId;
	}
	public void setBusinessSegmentId(String businessSegmentId) {
		this.businessSegmentId = businessSegmentId;
	}
	public String getPolicyQuestionDescription() {
		return policyQuestionDescription;
	}
	public void setPolicyQuestionDescription(String policyQuestionDescription) {
		this.policyQuestionDescription = policyQuestionDescription;
	}
	public String getPolicyQuestionAnswer1() {
		return policyQuestionAnswer1;
	}
	public void setPolicyQuestionAnswer1(String policyQuestionAnswer1) {
		this.policyQuestionAnswer1 = policyQuestionAnswer1;
	}
	public int getPolicyQuestionWeightage1() {
		return policyQuestionWeightage1;
	}
	public void setPolicyQuestionWeightage1(int policyQuestionWeightage1) {
		this.policyQuestionWeightage1 = policyQuestionWeightage1;
	}
	public String getPolicyQuestionAnswer2() {
		return policyQuestionAnswer2;
	}
	public void setPolicyQuestionAnswer2(String policyQuestionAnswer2) {
		this.policyQuestionAnswer2 = policyQuestionAnswer2;
	}
	public int getPolicyQuestionWeightage2() {
		return policyQuestionWeightage2;
	}
	public void setPolicyQuestionWeightage2(int policyQuestionWeightage2) {
		this.policyQuestionWeightage2 = policyQuestionWeightage2;
	}
	public String getPolicyQuestionAnswer3() {
		return policyQuestionAnswer3;
	}
	public void setPolicyQuestionAnswer3(String policyQuestionAnswer3) {
		this.policyQuestionAnswer3 = policyQuestionAnswer3;
	}
	public int getPolicyQuestionWeightage3() {
		return policyQuestionWeightage3;
	}
	public void setPolicyQuestionWeightage3(int policyQuestionWeightage3) {
		this.policyQuestionWeightage3 = policyQuestionWeightage3;
	}
    
    
}
