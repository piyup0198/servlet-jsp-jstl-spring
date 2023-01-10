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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String password1 = request.getParameter("pswd1");
		String password2 = request.getParameter("pswd2");
		String email = request.getParameter("email");
		String hoby = request.getParameter("hoby");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(userName.length()<6) {
			
            out.println("<h2>Username atlest contain 6 characters</h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/registration.html");
			
			rd.include(request, response);
			
		}else if(password1.length()<8){
			
			out.println("<h2>Password must be of 8 character</h2>");
            
			RequestDispatcher rd = request.getRequestDispatcher("/registration.html");
			
			rd.include(request, response);
		
		}else if(!password1.equals(password2)) {
			
			out.println("<h2>Both passwords must be same</h2>");
			
            RequestDispatcher rd = request.getRequestDispatcher("/registration.html");
			
			//RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			
			rd.include(request, response);
			
		}else if(userName.equals("") || password1.equals("") || email.equals("") || hoby.equals("")) {
            
			out.println("<h2>All fields are necessary</h2>");
			
            RequestDispatcher rd = request.getRequestDispatcher("/registration.html");
			
			rd.include(request, response);
		}
		else {
            //request.setAttribute("user" ,userName);
            request.setAttribute("usr" ,userName);
            request.setAttribute("email" ,email);
            request.setAttribute("hoby" ,hoby);
			
			//RequestDispatcher rd = request.getRequestDispatcher("RegSuccessfulServlet");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		   
			
			rd.forward(request, response);
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
