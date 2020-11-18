package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.Account;
import com.insurance.dto.UserRole;
import com.insurance.service.AccountService;
import com.insurance.service.AccountServiceImpl;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/AccountCreation")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String insuredName=request.getParameter("insuredName");
		String insuredStreet=request.getParameter("insuredStreet");
		String insuredCity=request.getParameter("insuredCity");
		String insuredState=request.getParameter("insuredState");
		int insuredZip=Integer.parseInt(request.getParameter("insuredZip"));
		String businessSegment=request.getParameter("businessSegment");
		String username=request.getParameter("username");
		UserRole user=new UserRole();
		UserRoleService uservice=new UserRoleServiceImpl();
		AccountService aservice=new AccountServiceImpl();
		user=uservice.getUserByName(username);
		try {
		  if(user.getUsername().equals(username)) {
			  Account account=new Account(insuredName, insuredStreet, insuredCity, insuredState, insuredZip, businessSegment, username);	
			  int rows=aservice.createAccount(account);
			  if(rows>0) {
				out.println("<h2>Account Created...</h2>");
			  }
			  else {
				out.println("<h2>Failed to Create Account...Please try again</h2>");
			  }
		  }
		}
		catch(NullPointerException e) {
			out.println("<h2>Username does not exists...</h2>");
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
