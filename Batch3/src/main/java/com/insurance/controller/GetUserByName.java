package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.UserRole;
import com.insurance.exceptions.InvalidUserException;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;

/**
 * Servlet implementation class GetUserByName
 */
@WebServlet("/Login")
public class GetUserByName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserRoleService service=new UserRoleServiceImpl();
		UserRole user=new UserRole();
		 user=service.getUserByName(username);
		try {
		  if(user.getUsername()==null || (!user.getPassword().equals(password))) {
			  throw new InvalidUserException();
		  }
		  else {
			if(user.getRoleCode().equals("111")) {
			  request.getRequestDispatcher("/Underwriter.jsp").forward(request, response);
			}
			else if(user.getRoleCode().equals("222")) {
			   request.getRequestDispatcher("/InsuranceAgent.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message", username);
				request.getRequestDispatcher("/Insured.jsp").forward(request, response);
			}
			
		  }
		}
		catch(NullPointerException | InvalidUserException e) {
			request.setAttribute("message", "Invalid Username or Password");
			request.getRequestDispatcher("Login.jsp").forward(request,response);
        } 
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
