

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.test.web.dao.ConsumerFetchDao;
import com.test.web.dao.ConsumerFetchDaoImpl;
import com.test.web.model.ElectricityUser;
import com.test.web.service.Meter;
import com.test.web.service.MeterImpl;


/**
 * Servlet Filter implementation class BillServFilter
 */
@WebFilter("/BillServlet")
public class BillServFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public BillServFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		int meterId = Integer.parseInt(request.getParameter("meterId"));
		Meter service =new MeterImpl();



		if(service.isValidMeter_det(meterId)) {
			ConsumerFetchDao dao =new ConsumerFetchDaoImpl();
			List<ElectricityUser> uList =dao.getUsers();
			for(ElectricityUser user:uList) {
				if(user.getMeterId()==meterId){
					request.setAttribute("meterId", meterId);
					request.setAttribute("UserName", user.getConsName());
					request.setAttribute("currRead", user.getCurrReading());
					request.setAttribute("prevRead", user.getPrevReading());
					request.setAttribute("zone", user.getZone());
					chain.doFilter(request, response);
//					RequestDispatcher rd = request.getRequestDispatcher("welcome2.jsp");
//					rd.include(request, response);
//					chain.doFilter(request, response);
				}
			}

			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
