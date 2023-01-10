package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String msg;
	
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	msg = "Hello from servlet!";
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usrname = request.getParameter("uname");
		
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.println("<h4> "+usrname+"</h4>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

//Servlet config : Initial parameters can be configured using
//RequestDispatcher Interface : it forwards a request to another resource or include the content of another resource 
//using RequestDispatcher we can call another resource from servlet


//methods of RequestDispatcher
  //forward(ServletRequesr req, ServletResponse res): forwards the request from servlet to another resource
  //include(ServletRequesr req, ServletResponse res): it will include contents of a resource in the response

//servlet filter - used to do pre processing of request or post processing of response