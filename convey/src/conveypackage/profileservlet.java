
package conveypackage;
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;;

/**
 * Servlet implementation class profileservlet
 */
@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
		HttpSession session=request.getSession(true);;
		String username=(String)session.getAttribute("username");
		System.out.println("after Sessions");
		Sql ob= new Sql();
		System.out.println("after new Sql");
		ResultSet rs=ob.pickprofile(username);
		request.setAttribute("rs", rs);
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp"); 
        rd.forward(request, response);  
		}
		catch(Exception e) {
			System.out.println("error in profileservlet ");
			e.printStackTrace();
		}
	}
}
