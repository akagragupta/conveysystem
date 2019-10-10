
package conveypackage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addproductservlet")
public class addproductservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		String quantity=request.getParameter("quantity");
		String time=request.getParameter("time");
		int tip=Integer.parseInt(request.getParameter("tip"));
		String desc=request.getParameter("desc");
		int id=Integer.parseInt(request.getParameter("id"));
		String category=request.getParameter("category");
		Sql ob = new Sql();
		ob.addproduct(name, price, quantity, time, tip, desc,id,category);
		response.sendRedirect("offerservlet");
	}
	catch(Exception e) {
			System.out.println("error in adding product in servlet");
			e.printStackTrace();
	}
	    
	}
	

}
