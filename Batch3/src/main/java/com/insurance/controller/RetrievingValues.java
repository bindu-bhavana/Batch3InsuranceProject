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
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

/**
 * Servlet implementation class RetrievingValues
 */
@WebServlet("/BusinessSegmentSelection")
public class RetrievingValues extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletContext sc = getServletContext();
		//String businessSegmentId = (String)sc.getAttribute("businessId");
		HttpSession session=request.getSession(true);
		String businessSegment=(String) session.getAttribute("businessSegmentId");
	    int totalPremium=(int) session.getAttribute("Total");
	    int accountNumber=(int) session.getAttribute("AccountNumber");
	    ArrayList<String> list=(ArrayList<String>) session.getAttribute("listOfWeightages");  
	    PrintWriter out=response.getWriter();
	    PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
	    int rows=service.addPolicy(totalPremium, accountNumber);
	    try {
	    if(rows>0) {
	    	out.println("Policy added");
	    }
	    else {
	    	out.println("Policy not added");
	    	throw new NullPointerException();
	    }
	    }
	    catch(NullPointerException e) {
	    }
	    out.println(businessSegment);
	    out.println(totalPremium);
	    out.println(accountNumber);
	    out.println(list);
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
