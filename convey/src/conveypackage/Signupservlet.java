package conveypackage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


/**
 * Servlet implementation class Signupservlet
 */
@WebServlet("/Signupservlet")
@MultipartConfig
/*public class Signupservlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multifiles= sf.parseRequest((RequestContext) request);
			for (org.apache.tomcat.util.http.fileupload.FileItem item:multifiles) {
				item.write(new File("C:\\My Place\\Convey Storage Photos"+ item.getName()));
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			System.out.println("image exception 1");
			System.out.println(e);
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("image exception 2");
			System.out.println(e);
		}
		*/
	public class Signupservlet extends HttpServlet {
		private final String SAVE_DIR = "C:\\My Place\\Convey Storage Photos";
	    
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	    {
//			 String appPath = request.getServletContext().getRealPath("");
//		        // constructs path of the directory to save uploaded file
//		        String savePath = appPath + File.separator + SAVE_DIR;
//		         
//		        // creates the save directory if it does not exists
//		        File fileSaveDir = new File(savePath);
//		        if (!fileSaveDir.exists()) {
//		            fileSaveDir.mkdir();
//		        }
//		         
//		        for (Part part : request.getParts()) {
//		            String fileName = extractFileName(part);
//		            // refines the fileName in case it is an absolute path
//		            fileName = new File(fileName).getName();
//		            part.write(savePath + File.separator + fileName);
//		        }
//		        request.setAttribute("message", "Upload has been done successfully!");
//		        getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	    	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
			String name,address,college,hostel,room,payment_methods,passwords;
			int postal,phone;
			name=request.getParameter("name");
			
			address=request.getParameter("address");
			college=request.getParameter("college");
			hostel=request.getParameter("hostel");
			room=request.getParameter("room");
			postal=Integer.parseInt(request.getParameter("postal"));
			phone=Integer.parseInt(request.getParameter("phone"));
			payment_methods=request.getParameter("payment-methods");
			passwords=request.getParameter("password");
			Sql ob=new Sql();
			if(ob.adduser(name,address,college,hostel,room,postal,phone,payment_methods,passwords))
			{
				System.out.println("user is succesfully added");
				response.sendRedirect("login.jsp");
			}
			else {
				System.out.println("user is failed to signup");
				response.sendRedirect("signup.jsp");
			}
	    }
		private String extractFileName(Part part) {
	        String contentDisp = part.getHeader("content-disposition");
	        String[] items = contentDisp.split(";");
	        for (String s : items) {
	            if (s.trim().startsWith("filename")) {
	                return s.substring(s.indexOf("=") + 2, s.length()-1);
	            }
	        }
	        return "";
	    }

	}
	
