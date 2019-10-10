package conveypackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/deliverproductservlet")
public class deliverproductservlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) {
		try {
			HttpSession session = request.getSession(); /* Creating a new session*/
			  
            int id=(int)session.getAttribute("id"); 
			int pid=Integer.parseInt(request.getParameter("pid"));
			Sql ob = new Sql();
			if(ob.adddelivery(pid,id)) {
				System.out.println("SUCCES PRODUCT GOES IN your delivery");
				if(ob.removefromofferpage(pid))
				{
					System.out.println("SUCCES removed  from offer page");
					response.sendRedirect("offerservlet");
				}
				else {
					System.out.println("UNSUCCESS...PRODUCT cannot removed from offer page");
				}
			}
		}
		catch(Exception e) {
			System.out.println("UNSUCCES PRODUCT DOES NOT GO IN your delivery");
			e.printStackTrace();
		}
	}
}
