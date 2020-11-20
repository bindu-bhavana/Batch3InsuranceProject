package com.insurance.dto;

public class PolicyDetails {
     private int policyNumber;
     private String questionId;
     private String answer;
     public PolicyDetails() {
     }
	public PolicyDetails(int policyNumber, String questionId, String answer) {
		super();
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
