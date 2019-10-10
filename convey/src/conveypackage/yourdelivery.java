package conveypackage;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class yourdelivery
 */
@WebServlet("/yourdelivery")
public class yourdelivery extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
		HttpSession session = request.getSession(); /* Creating a new session*/
        String uname=session.getAttribute("username").toString(); 
        Sql ob= new Sql();
        int id=ob.getid(uname);
		ResultSet rs=ob.pickdelivery(id);
		request.setAttribute("rs", rs);
		RequestDispatcher rd = request.getRequestDispatcher("yourdelivery.jsp"); 
        rd.forward(request, response);  
		}
		catch(Exception e) {
			System.out.println("error in yourorderervlet ");
			e.printStackTrace();
		}
	}

}
