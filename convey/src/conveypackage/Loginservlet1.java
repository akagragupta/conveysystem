

package conveypackage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginservlet1
 */
@WebServlet("/loginservlet1")
public class Loginservlet1 extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response ) throws IOException
	{
		String username;
		String password;
		username=request.getParameter("username");
		password = request.getParameter("password");
		
		Sql obj = new Sql();
		if(obj.login(username, password)) {
			HttpSession session= request.getSession(true);
			session.setAttribute("username",username);
			System.out.println("login sucessfull");
			response.sendRedirect("convey.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

}
