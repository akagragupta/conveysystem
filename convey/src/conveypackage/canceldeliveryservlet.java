package conveypackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class canceldeliveryservlet
 */			  
@WebServlet("/canceldeliveryservlet")
public class canceldeliveryservlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		try {
				Sql ob= new Sql();
				int oid = Integer.parseInt(request.getParameter("cancelbutton"));
				int pid=ob.getpidfromoid(oid);
				if(ob.canceldelvieryaddproduct(pid))
					{
						System.out.println("delivery cancel and product add succesfully");
						
						if(ob.canceldelivery(oid)) {
							System.out.println("delivery cancel succesfully");
						}
						else {
							System.out.println("delivery cancel unsuccesfully");
						}
						response.sendRedirect("yourdelivery");
					}else {
						System.out.println("delivery cancel and product add unsuccesfully");
					}
				
				
//				if(ob.canceldelivery(oid))
//				{
//					System.out.println("delivery cancel succesfully");
//					int pid=ob.getpidfromoid(oid);
//					if(ob.canceldelvieryaddproduct(pid)) {
//						System.out.println("delivery cancel and product add succesfully");
//					}
//					else {
//						System.out.println("delivery cancel and product add unsuccesfully");
//					}
//					response.sendRedirect("yourdelivery");
//				}else {
//					System.out.println("delivery cancel unsuccesfully");
//				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
