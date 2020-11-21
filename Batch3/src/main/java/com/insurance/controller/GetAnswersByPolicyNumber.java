package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insurance.dto.PolicyDetails;
import com.insurance.dto.ViewPolicy;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class GetAnswersByPolicyNumber
 */
@WebServlet("/ViewPolicyThroughAccount")
public class GetAnswersByPolicyNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int accountNumber=Integer.parseInt(request.getParameter("accountNumber"));
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		//PolicyDetails pd=service.getPolicy(accountNumber);
		ViewPolicy vp=service.viewPolicy(accountNumber);
		int policyNumber=0;
		int totalPremium=0;
		try {
		if(vp.getPolicyNumber()!=0) {
		    policyNumber=vp.getPolicyNumber();
		    totalPremium=vp.getPolicyPremium();
		}
		else {
			throw new NullPointerException();
		}
		}
		catch(NullPointerException e) {
		}
		request.setAttribute("policyNumber",policyNumber);
		request.setAttribute("totalPremium", totalPremium);
		request.getRequestDispatcher("ViewPolicy.jsp").forward(request, response);
		//out.println(policyNumber);
		//out.println(totalPremium);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
