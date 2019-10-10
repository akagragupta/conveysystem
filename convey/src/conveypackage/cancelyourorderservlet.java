package conveypackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cancelyourorderservlet
 */
@WebServlet("/cancelyourorderservlet")
public class cancelyourorderservlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		try {
			Sql ob= new Sql();
			int pid = Integer.parseInt(request.getParameter("cancelbutton"));
			int oid=ob.getoidfrompid(pid);
			if(ob.canceldelivery(oid)) {
				System.out.println("success fully removed your order delete product");
				if( ob.deleteproduct(pid) )
				{
					System.out.println("success fully removed your order cancel delivery");
					response.sendRedirect("yourorder");
				}
				else {
					System.out.println("unsuccess in removing your order cancel delivery");
				}
			}
			else {
				System.out.println("unsuccess in removing your order delete product");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error/exception in cancelyourorder");
		}
	}
	
}
