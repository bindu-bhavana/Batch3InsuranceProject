package com.insurance.dto;

public class Generation {
      private String insuredName;
      private String insuredStreet;
      private String insuredCity;
      private String insuredState;
      private int insuredZip;
      private String businessSegment;
      private String questionDescription;
      private int totalPremium;
      private String answer;
      public Generation(){
      }
	public Generation(String insuredName, String insuredStreet, String insuredCity, String insuredState,
			int insuredZip, String businessSegment, String questionDescription, int totalPremium, String answer) {
		super();
		this.insuredName = insuredName;
		this.insuredStreet = insuredStreet;
		this.insuredCity = insuredCity;
		this.insuredState = insuredState;
		this.insuredZip = insuredZip;
		this.businessSegment = businessSegment;
		this.questionDescription = questionDescription;
		this.totalPremium = totalPremium;
		this.answer = answer;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuredStreet() {
		return insuredStreet;
	}
	public void setInsuredStreet(String insuredStreet) {
		this.insuredStreet = insuredStreet;
	}
	public String getInsuredCity() {
		return insuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}
	public String getInsuredState() {
		return insuredState;
	}
	public void setInsuredState(String insuredState) {
		this.insuredState = insuredState;
	}
	public int getInsuredZip() {
		return insuredZip;
	}
	public void setInsuredZip(int insuredZip) {
		this.insuredZip = insuredZip;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	public String getQuestionDescription() {
		return questionDescription;
	}
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	public int getTotalPremium() {
		return totalPremium;
	}
	public void setTotalPremium(int totalPremium) {
		this.totalPremium = totalPremium;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	 @Override
	   public String toString() {
	        return ("insuredName:"+this.getInsuredName()+
	                    " insuredStreet: "+ this.getInsuredStreet() +
	                    " insuredCity "+ this.getInsuredCity() +
	                    " insuredState : " + this.getInsuredState() +
	                    " insuredZip : "+this.getInsuredZip()+
	                    " businessSegment : "+this.getBusinessSegment()+
	                    " questionDescription : "+this.getQuestionDescription()+
	                    " totalPremium : " +this.getTotalPremium()+
	                    "answer: "+this.getAnswer());
	 }
}

