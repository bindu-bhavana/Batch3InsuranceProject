package com.insurance.utils;

public class InsuranceDBQueries {
	public static final String GETUSERBYNAME=
			"select user_name,password,role_code from User_Role where user_name=?";
	public static final String CREATEUSER=
			"insert into User_Role values(?,?,?)";
	public static final String CREATEACCOUNT=
			"insert into Accounts values(account_seq.nextval,?,?,?,?,?,?,?)";
	public static final String GETPOLICYQUESTIONS=
			"select pol_ques_id, pol_ques_desc, pol_ques_ans1, pol_ques_ans1_weightage, "
			+ "pol_ques_ans2, pol_ques_ans2_weightage, pol_ques_ans3, "
			+ "pol_ques_ans3_weightage from Policy_Questions where bus_seg_id=?";
	public static final String GETACCOUNTBYUSER=
			"select account_number,business_segment from Accounts where user_name=?";
	public static final String ADDPOLICY=
			"insert into Policy values(policy_seq.nextval,?,?)";
	public static final String GETPOLICY=
			"select policy_number from Policy where account_number=?";
	public static final String ADDPOLICYDETAILS=
			"insert into Policy_Details values(?,?,?)";
	public static final String GETPOLICYDETAILS=
			"select question_id,answer from Policy_Details where policy_number=?";
	public static final String VIEWPOLICY=
			"select policy_number,policy_premium from Policy where account_number=?";
	
	
}
