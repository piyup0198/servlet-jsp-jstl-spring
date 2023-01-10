

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.web.dao.ConsumerFetchDao;
import com.test.web.dao.ConsumerFetchDaoImpl;
import com.test.web.model.ElectricityUser;

/**
 * Servlet implementation class ConsumerServ
 */
@WebServlet("/ConsumerServlet")
public class ConsumerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsumerServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		int meterId = Integer.parseInt(request.getParameter("meterId"));
//		String consName = request.getParameter("consName");
//		int currRead = Integer.parseInt(request.getParameter("currRead"));
//		int prevRead = Integer.parseInt(request.getParameter("prevRead"));
//		String zone = request.getParameter("zone");
		
		Connection con = null;
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "priyanka@1";
	        con = DriverManager.getConnection(url,user,pass);
	        PreparedStatement ps=con.prepareStatement(

	        		"insert into electricity_user(meter_id,cons_name,curr_read,prev_read,zone) values (?,?,?,?,?)"); 
       ps.setLong(1,Integer.valueOf(request.getParameter("meterId")));  
       ps.setString(2,request.getParameter("consName"));
       ps.setInt(3,(int) Integer.valueOf(request.getParameter("currRead")));
       ps.setInt(4,(int) Integer.valueOf(request.getParameter("prevRead")));
       ps.setString(5,request.getParameter("zone"));
       ps.executeUpdate();  
       
       RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
	   rd.include(request, response);
 
              

              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
