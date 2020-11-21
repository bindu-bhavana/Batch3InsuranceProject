package com.insurance.dto;

public class ViewPolicy {
   private int policyNumber;
   private int policyPremium;
   private int accountNumber;
   public ViewPolicy(){   
   }
public ViewPolicy(int policyNumber, int policyPremium, int accountNumber) {
	super();
	this.policyNumber = policyNumber;
	this.policyPremium = policyPremium;
	this.accountNumber = accountNumber;
}
public int getPolicyNumber() {
	return policyNumber;
}
public void setPolicyNumber(int policyNumber) {
	this.policyNumber = policyNumber;
}
public int getPolicyPremium() {
	return policyPremium;
}
public void setPolicyPremium(int policyPremium) {
	this.policyPremium = policyPremium;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
}
