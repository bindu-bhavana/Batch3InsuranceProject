package com.insurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.dto.PolicyQuestions;
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
		//HttpSession session=request.getSession(true);
		String businessSegmentId=request.getParameter("businessSegment");
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<PolicyQuestions> pqlist=service.getPolicyQuestions(businessSegmentId);
		PrintWriter out=response.getWriter();
		request.setAttribute("PolicyQuestionsList",pqlist);
		request.getRequestDispatcher("PolicyCreation.jsp").include(request, response);
		int totalPremium=0;
		List<Integer> wlist=new ArrayList();
		for(int i=1;i<=10;i++) {
			wlist.add(Integer.parseInt(request.getParameter("Q"+i)));
			if((request.getParameter("Q"+i))!=null) {
			  totalPremium+=Integer.parseInt(request.getParameter("Q"+i));
			}
			else {
				break;
			}
		}
		int i=1;
		for(PolicyQuestions pq:pqlist){
			if((request.getParameter("Q"+i)!=null)) {
				if((Integer.parseInt(request.getParameter("Q"+i))==200)) {
				      List<String> answerList1=new ArrayList();
				      answerList1.add(pq.getPolicyQuestionAnswer1());
				}
				else if((Integer.parseInt(request.getParameter("Q"+i))==400)){
					  
				}
			}
			else {
				break;
			}
			i++;
		}
		//out.println(totalPremium);
		request.setAttribute("premiumValue", totalPremium);
		request.getRequestDispatcher("PolicyCreation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
