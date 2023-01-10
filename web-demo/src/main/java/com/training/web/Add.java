package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		Connection con = DatabaseConnection.initializeDatabase();
		  
        PreparedStatement st = con.prepareStatement("insert into user_in values(?, ?, ?)");
        //PrintWriter out = response.getWriter();	
        //out.println(request.getParameter("joining"));
      
       //st.setInt(1, Integer.valueOf(request.getParameter("id")));
       st.setString(1, request.getParameter("id"));
       st.setString(2, request.getParameter("name"));
       st.setString(3, request.getParameter("joining"));
       
       st.executeUpdate();

      
       st.close();
       con.close();

       RequestDispatcher rd = request.getRequestDispatcher("succReg.jsp");
	   rd.forward(request, response);
      
       PrintWriter out = response.getWriter();
       //out.println("<html><body><b>Registration Successfull"
         //          + "</b></body></html>");
       
       //out.print("<br><a href='signin.jsp'>LogIN</a><br><br>");
   }
     catch (Exception e) {
       e.printStackTrace();
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
