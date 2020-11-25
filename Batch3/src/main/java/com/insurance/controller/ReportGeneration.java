
package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.Generation;
import com.insurance.dto.PolicyDetails;
import com.insurance.dto.ViewPolicy;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class ReportGeneration
 */
@WebServlet("/ViewReport")
public class ReportGeneration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accountNumber=Integer.parseInt(request.getParameter("accountNumber"));
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<Generation> rglist=service.generateReport(accountNumber);
		PrintWriter out=response.getWriter();	
		ViewPolicy vp=new ViewPolicy();
		try {
			request.setAttribute("Report",rglist);	
		    request.getRequestDispatcher("ViewReport.jsp").forward(request, response);
		}
		catch(NullPointerException e) {
			request.setAttribute("message","This account does not have any record");
			request.getRequestDispatcher("ReportGenerate.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
