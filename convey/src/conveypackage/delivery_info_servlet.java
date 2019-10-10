package conveypackage;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delivery_info_servlet
 */
@WebServlet("/delivery_info_servlet")
public class delivery_info_servlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response){
		int pid=Integer.parseInt(request.getParameter("delivery_info"));
		Sql ob= new Sql();
		int oid=ob.getoidfrompid(pid);
		Sql oj= new Sql();
		int did=oj.getdeliveryidfromoid(oid);
		Sql obj= new Sql();
		ResultSet rs =obj.showdeliveryinfo(did,pid);
		try {
			request.setAttribute("rs", rs);
			RequestDispatcher rd = request.getRequestDispatcher("deliveryinfo.jsp"); 
			System.out.println("forward to deliveryinfo.jsp");
	        rd.forward(request, response); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erroe in delivery info jsp sending rs");
		}
		
	}
}
