package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegSuccessfulServlet
 */
@WebServlet("/RegSuccessfulServlet")
public class RegSuccessfulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegSuccessfulServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			String user = (String)request.getAttribute("user");
			String email = (String)request.getAttribute("email");
			String hobby =(String)request.getAttribute("hoby");
			
			out.println("<h1>welcome "+user+"</h1>");
			out.println("<h1>You are logged in Successfully!!</h1>");
			out.println("<h1>Your Email id is: "+email+"</h1>");
			out.println("<h1>Hobby : "+hobby+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
