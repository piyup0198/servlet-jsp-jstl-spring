package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home1Servlet
 */
@WebServlet("/home1")
public class Home1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String t1,t2,t3,t4;
	String[] s;
	
    public Home1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	t1 = "Java";
    	t2 = "SQL";
        t3 = "JDBC";
        t4 = "HTML, CSS ,JS";
        s = new String[] {"Typescript","Servlet","DBMS"};
 
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
        PrintWriter out = response.getWriter();
		
		out.println("<li> "+t1+"</li>");
		out.println("<li> "+t2+"</li>");
		out.println("<li> "+t3+"</li>");
		out.println("<li> "+t4+"</li>");
		for(int i=0;i<s.length;i++) {
			out.println("<li>"+s[i]+"</li>");
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
