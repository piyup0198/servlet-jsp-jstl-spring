package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.web.model.User;
import com.training.web.service.LoginService;
import com.training.web.service.LoginServiceImpl;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/welcomeServlet")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		//String id = request.getParameter("id");
		String joining = request.getParameter("joining");
		
		LoginService service = new LoginServiceImpl();
				
		if(userName.equals("") || password.equals("")) {
			out.print("<h2>**Please enter username and password**<h2>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		 
		else if(service.isValidUser(userName, password)) {
			
			
			List<User> userList = service.getUsers();
			request.setAttribute("user", userName);
			request.setAttribute("pwd", password);
			request.setAttribute("joining", joining);
			//request.setAttribute("id", id);
			request.setAttribute("userList", userList);
			chain.doFilter(request, response);
		}
	
		else {
			out.print("<h2>Incorrect login credential!!<h2>");
			RequestDispatcher rd = request.getRequestDispatcher("/signin.html");
			rd.include(request, response);
			
			
		}
	
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
