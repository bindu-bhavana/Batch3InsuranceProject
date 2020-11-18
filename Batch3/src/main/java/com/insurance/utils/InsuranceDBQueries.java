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
	
}
