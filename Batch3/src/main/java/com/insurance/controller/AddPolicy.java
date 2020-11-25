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
 * Servlet implementation class AddPolicy
 */
@WebServlet("/AddPolicyAndDetails")
public class AddPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String businessSegment=(String) session.getAttribute("businessSegmentId");
	    int totalPremium=(int) session.getAttribute("Total");
	    int accountNumber=(int) session.getAttribute("AccountNumber");
	    PrintWriter out=response.getWriter();
	    PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<PolicyQuestions> pqlist=service.getPolicyQuestions(businessSegment);
		//ViewPolicy vp=service.viewPolicy(accountNumber);
		//int policyNumber=vp.getPolicyNumber();
		int rows=service.addPolicy(totalPremium, accountNumber);
	    try {
	    if(rows>0) {
	    	request.setAttribute("message", "Policy added successfully");
	    }
	    else {
	    	request.setAttribute("message", "Policy already exists");
	    	throw new NullPointerException();
	    }
	    }
	    catch(NullPointerException e) {
	    }
	    request.getRequestDispatcher("AddPolicyAndDetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
