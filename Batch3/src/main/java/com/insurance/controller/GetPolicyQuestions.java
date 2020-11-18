package com.insurance.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.PolicyQuestions;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class GetPolicyQuestions
 */
public class GetPolicyQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String businessSegmentId=request.getParameter("businessSegment");
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<PolicyQuestions> pqlist=service.getPolicyQuestions(businessSegmentId);
		request.setAttribute("PolicyQuestionsList",pqlist);
		RequestDispatcher rd=request.getRequestDispatcher("/GetEmployees.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
