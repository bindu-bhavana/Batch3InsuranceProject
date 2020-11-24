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

import com.insurance.dto.Account;
import com.insurance.dto.PolicyQuestions;
import com.insurance.dto.ViewPolicy;
import com.insurance.service.AccountService;
import com.insurance.service.AccountServiceImpl;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class GetPolicyQuestions
 */
@WebServlet("/PolicyCreation")
public class GetPolicyQuestions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext sc=request.getServletContext();
		HttpSession session=request.getSession(true);
		String businessSegmentId=request.getParameter("businessSegment");
		AccountService aservice=new AccountServiceImpl();
		String username=request.getParameter("username");
		Account account1=aservice.getAccountByUser(username);
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<PolicyQuestions> pqlist=service.getPolicyQuestions(businessSegmentId);
		request.setAttribute("PolicyQuestionsList",pqlist);
		request.getRequestDispatcher("PolicyCreation.jsp").include(request, response);
		List<String> wlist=new ArrayList<String>();
		int sum=0;
		try {
		account1.setBusinessSegment(businessSegmentId);
		if(account1.getAccountNumber()==0 && account1.getBusinessSegment()==null) {
			throw new NullPointerException();
		}
		else {
		   request.setAttribute("AccountNumber",account1.getAccountNumber());
		   session.setAttribute("AccountNumber",account1.getAccountNumber());
		   //sc.setAttribute("AccountNumber", account1.getAccountNumber());
		   session.setAttribute("businessSegmentId", account1.getBusinessSegment());
		   //sc.setAttribute("businessSegmentId", account1.getBusinessSegment());
		   System.out.println("Session Created");
		}
		}
		catch(NullPointerException e) {
			out.println("Exception");
		}
		for(int i=0;i<=10;i++) {
			   if(request.getParameter("Q"+i)!=null) {
				   wlist.add(request.getParameter("Q"+i));
				   sum+=Integer.parseInt(request.getParameter("Q"+i));
			   }
		}
		//out.println(wlist);
		request.setAttribute("Total", sum);
		request.getRequestDispatcher("PolicyCreation.jsp").forward(request, response);
		//session.setAttribute("pqlist", pqlist);
		session.setAttribute("listOfWeightages",wlist);
		session.setAttribute("Total",sum);
		sc.setAttribute("listOfWeightages",wlist);
		sc.setAttribute("Total",sum);
		System.out.println("Session1 Created");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
