package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(userName.equals("") || password.equals("")) {
			out.println("<h2>Please enter username and password</h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			
			rd.include(request, response);
		}else if(userName.equals("test") && password.equals("1234")) {
			
			request.setAttribute("user" ,userName);
			request.setAttribute("pwd" ,password);
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			
			rd.forward(request, response);
			
			//response.sendRedirect("WelcomeServlet");
			
		}else {
            out.println("<h2>Please enter correct username and password</h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			
			rd.include(request, response);
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
