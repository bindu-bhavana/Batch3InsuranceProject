package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.UserRole;
import com.insurance.service.UserRoleService;
import com.insurance.service.UserRoleServiceImpl;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/ProfileCreation")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		String rolecode=request.getParameter("rolecode");
        if(password.equals(cpassword)) {
        	UserRole user=new UserRole(username,password,rolecode);
    		UserRoleService service=new UserRoleServiceImpl();
    		int rows=service.createUser(user);
    		if(rows>0) {
    			request.setAttribute("message", "Profile Created successfully...");
    		}
    		else {
    			request.setAttribute("message", "Username already exists...");
    		}
        }
        else {
        	request.setAttribute("message", "Passwords not matching...");
        }
        request.getRequestDispatcher("ProfileCreation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
