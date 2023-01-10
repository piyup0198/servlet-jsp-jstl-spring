

import java.io.IOException;
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
 * Servlet implementation class BillServlet
 */
@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<ElectricityUser> userList = (List<ElectricityUser>)request.getAttribute("userList");
//		request.setAttribute("userList", userList);
//		int meterId=(int) request.getAttribute("meterId");
//		String uName=(String) request.getAttribute("UserName");
//		int currRead=(int)request.getAttribute("currRead");
//		int prevRead=(int) request.getAttribute("prevRead");
//		String zone=(String) request.getAttribute("zone");
//		
//		
//		request.setAttribute("meterId", meterId);
//		request.setAttribute("uName", uName);
//		request.setAttribute("currRead", currRead);
//		request.setAttribute("prevRead", prevRead);
//		request.setAttribute("zone", zone);
		RequestDispatcher rd = request.getRequestDispatcher("welcome2.jsp");
		rd.include(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
