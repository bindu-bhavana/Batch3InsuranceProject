package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insurance.dto.PolicyQuestions;
import com.insurance.dto.ViewPolicy;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class AddPolicyDetails
 */
public class AddPolicyDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ServletContext sc=request.getServletContext();
		String businessSegment=(String) session.getAttribute("businessSegmentId");
	    int totalPremium=(int) session.getAttribute("Total");
	    int accountNumber=(int) session.getAttribute("AccountNumber");
	    ArrayList<String> wlist=(ArrayList<String>) session.getAttribute("listOfWeightages");  
	    //String businessSegment1=(String) sc.getAttribute("businessSegmentId");
	    //int totalPremium1=(int) sc.getAttribute("Total");
	    //int accountNumber1=(int) sc.getAttribute("AccountNumber");
	    //ArrayList<String> wlist1=(ArrayList<String>) sc.getAttribute("listOfWeightages");  
	    PrintWriter out=response.getWriter();
	    PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<PolicyQuestions> pqlist=service.getPolicyQuestions(businessSegment);
		ViewPolicy vp=service.viewPolicy(accountNumber);
		int policyNumber=vp.getPolicyNumber();
		List<String> questionIdList=new ArrayList<String>();
		List<String> answerList=new ArrayList<String>();	
		int i=0;
		for(PolicyQuestions pq:pqlist) {
			questionIdList.add(pq.getPolicyQuestionId());
			if(wlist.get(i).equals("200")) {
				answerList.add(pq.getPolicyQuestionAnswer1());
			}
			else if(wlist.get(i).equals("400")) {
				answerList.add(pq.getPolicyQuestionAnswer2());
			}
			else if(wlist.get(i).equals("600")) {
				answerList.add(pq.getPolicyQuestionAnswer3());
			}
			i++;
		}
		int rows1=0;
		rows1=service.addPolicyDetails(policyNumber, questionIdList, answerList);
		try {
		if(rows1>0) {
			request.setAttribute("message1", "Policy details added successfully");
			out.println("policy details added");
		}
		else {
			request.setAttribute("message1", "Policy details already exists");
			out.println("Policy details not  added");
			throw new NullPointerException();
		}
		}
		catch(NullPointerException e) {
		}
		 request.getRequestDispatcher("AddPolicyAndDetails.jsp").forward(request, response);
	}

	private int list(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
