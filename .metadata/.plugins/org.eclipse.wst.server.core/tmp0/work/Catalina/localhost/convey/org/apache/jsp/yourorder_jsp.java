/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.94
 * Generated at: 2019-07-09 16:07:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conveypackage.Sql;

public final class yourorder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/main.jsp", Long.valueOf(1562582641462L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"\" href=\"css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Convey System</title>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");


if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light  nav-css\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"convey.jsp\">Convey</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item \">\r\n");
      out.write("        <a class=\"nav-link\" href=\"profileservlet\">Profile <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\"  data-toggle=\"modal\" data-target=\"#myModal\" href=\"#\">Add Product</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"offerservlet\">Offers</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link \" href=\"about-us.jsp\" >About Us</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Activity</a>\r\n");
      out.write("    <div class=\"dropdown-menu\">\r\n");
      out.write("      <a class=\"dropdown-item nav-drop\" href=\"yourorder\">Your Orders</a>\r\n");
      out.write("      <a class=\"dropdown-item nav-drop\" href=\"yourdelivery\">Your Delivery</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<section id=\"popup_window_add_product\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write(" \t\t\t <!-- The Modal -->\r\n");
      out.write("\t\t\t  <div class=\"modal\" id=\"myModal\">\r\n");
      out.write("\t\t\t    <div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t      <div class=\"modal-content\">\r\n");
      out.write("\t\t\t      \r\n");
      out.write("\t\t\t        <!-- Modal Header -->\r\n");
      out.write("\t\t\t        <div class=\"modal-header  \" style=\"background-color:orange !important;\">\r\n");
      out.write("\t\t\t          <h4 class=\"modal-title\" style=\"color:white !important;\">Add Product Card Here</h4>\r\n");
      out.write("\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <!-- Modal body -->\r\n");
      out.write("\t\t\t       \r\n");
      out.write("\t\t\t        <div class=\"modal-body\">\r\n");
      out.write("\t\t\t        <form action=\"addproductservlet\">\r\n");
      out.write("\t\t\t        \t<label class=\"lable_width\">Name</label>\r\n");
      out.write("\t\t\t         \t<input name=\"name\" type=\"text\" placeholder=\"enter product name\" ><br>\r\n");
      out.write("\t\t\t         \t\r\n");
      out.write("\t\t\t            <label class=\"lable_width\">Price</label>\r\n");
      out.write("\t\t\t            <input name=\"price\" type=\"number\" placeholder=\"enter product price\" ><br>\r\n");
      out.write("\t\t\t            \r\n");
      out.write("\t\t\t            <label class=\"lable_width\">Quantity</label>\r\n");
      out.write("\t\t\t         \t<input name=\"quantity\" type=\"text\" placeholder=\"enter product quantity\" ><br>\r\n");
      out.write("\t\t\t         \t\r\n");
      out.write("\t\t\t         \t<label class=\"lable_width\">Image</label>\r\n");
      out.write("\t\t\t         \t<input name=\"image\" type=\"file\"  ><br>\r\n");
      out.write("\t\t\t         \t\r\n");
      out.write("\t\t\t         \t<label class=\"lable_width\">Extra Payment</label>\r\n");
      out.write("\t\t\t         \t<input name=\"tip\" type=\"number\" placeholder=\"enter tip here\" ><br>\r\n");
      out.write("\t\t\t         \t\r\n");
      out.write("\t\t\t         \t<label class=\"lable_width\">Time</label>\r\n");
      out.write("\t\t\t         \t<input name=\"time\" type=\"text\" placeholder=\"enter by time you want\" ><br>\r\n");
      out.write("\t\t\t         \t\r\n");
      out.write("\t\t\t         \t<label class=\"lable_width\">Category</label>\r\n");
      out.write("\t\t\t         \t<select name=\"category\">\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"Fruits\">Fruits</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"Food\">Food</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"Medicine\">Medicine</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"General store things\">General store things</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"Other\">Other</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t         \t");

			         	int id=0;
			         	try{
						String username=session.getAttribute("username").toString();
						Sql obj = new Sql();
			         	id=obj.getid(username);
			         	session.setAttribute("id",id);
			         	}
			         	catch(Exception e){
			         		e.printStackTrace();
			         	}
			         	
      out.write("\r\n");
      out.write("\t\t\t         \t<input type=\"hidden\" value=");
      out.print(id );
      out.write(" name=\"id\">\r\n");
      out.write("\t\t\t         \t<textarea name=\"desc\" rows=\"4\" cols=\"50\">Enter Description</textarea>\r\n");
      out.write("\t\t\t         \t<button class=\"popup-btn\" type=\"submit \">Submit</button>\r\n");
      out.write("\t\t\t         \t</form>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <!-- Modal footer \r\n");
      out.write("\t\t\t        <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t          <button type=\"submit\" class=\"btn btn-danger\" formaction=\"addproductservlet\" data-dismiss=\"modal\">Submit</button>\r\n");
      out.write("\t\t\t        </div>-->\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t      </div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"\" href=\"css/yourorder.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("<div class=\"row\">\r\n");
 try{
	ResultSet rs=(ResultSet)request.getAttribute("rs");
	while(rs.next()){
		
      out.write("\r\n");
      out.write("\t\t<div class=\"card mb-3 col-sm-6\" style=\"max-width: 840px;\">\r\n");
      out.write("\t\t  <div class=\"row no-gutters\">\r\n");
      out.write("\t\t    <div class=\"col-md-4\">\r\n");
      out.write("\t\t      <img src=\"...\" class=\"card-img\" alt=\"...\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"col-md-8\">\r\n");
      out.write("\t\t      <div class=\"card-body\">\r\n");
      out.write("\t\t        <h5 class=\"card-title\">");
      out.print(rs.getString("name"));
      out.write("</h5>\r\n");
      out.write("\t\t        <div class=\"card-text\">\r\n");
      out.write("\t\t        \t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      Quantity:");
      out.print(rs.getString("quantity") );
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      Price:");
      out.print(rs.getInt("price"));
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      Extra_Payment:");
      out.print(rs.getInt("extra_payment"));
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      Time:");
      out.print(rs.getString("time") );
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      In Delivery:");
      out.print(rs.getString("in_delivery") );
      out.write("\r\n");
      out.write("\t\t\t\t\t      ");
String x=rs.getString("in_delivery"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"col-sm\">\r\n");
      out.write("\t\t\t\t\t      Category:");
      out.print(rs.getString("category") );
      out.write("\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <p>Description:");
      out.print(rs.getString("description"));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  ");
 try{
						  if(x.equals("Yes"))
					  
					  { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t  <form class=\"col-sm\" action=\"cancelyourorderservlet\" >\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn dis-butt\" type=\"submit\" value=");
      out.print(rs.getInt("pid"));
      out.write(" name=\"cancelbutton\"disabled>Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t\t  <form class=\"col-sm\" action=\"delivery_info_servlet\">\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn abl-butt\" style=\"float:right;\"  type=\"submit\" value=");
      out.print(rs.getInt("pid"));
      out.write(" name=\"delivery_info\">Delivery info</button>\r\n");
      out.write("\t\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  ");
}
					  else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t  <form class=\"col-sm\" action=\"cancelyourorderservlet\" >\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn\"  type=\"submit\" value=");
      out.print(rs.getInt("pid"));
      out.write(" name=\"cancelbutton\">Cancel</button>\r\n");
      out.write("\t\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t\t  <form class=\"col-sm\" action=\"delivery_info_servlet\">\r\n");
      out.write("\t\t\t\t\t\t  <button class=\"btn dis-butt\" style=\"float:right;\" type=\"submit\"  name=\"delivery_info\" disabled>Delivery info</button>\r\n");
      out.write("\t\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  ");
}
					  }
					  catch(Exception e){
						  e.printStackTrace();
						 System.out.println("error in if else in yourordrr.jsp");
					  }
					  
      out.write("\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <p class=\"card-text\"><small class=\"text-muted\">status of your order=</small></p>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t ");

	}
}
catch(Exception e){
	e.printStackTrace();
}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
