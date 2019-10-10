<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
    <%@  include file="main.jsp" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="" href="css/yourorder.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<section>
<div class="row">
<% try{
	ResultSet rs=(ResultSet)request.getAttribute("rs");
	while(rs.next()){
		%>
		<div class="card mb-3 col-sm-6" style="max-width: 840px;">
		  <div class="row no-gutters">
		    <div class="col-md-4">
		      <img src="..." class="card-img" alt="...">
		    </div>
		    <div class="col-md-8">
		      <div class="card-body">
		        <h5 class="card-title"><%=rs.getString("name")%></h5>
		        <div class="card-text">
		        	<div class="row">
					    <div class="col-sm">
					      Quantity:<%=rs.getString("quantity") %>
					    </div>
					    <div class="col-sm">
					      Price:<%=rs.getInt("price")%>
					    </div>
					    <div class="col-sm">
					      Extra_Payment:<%=rs.getInt("extra_payment")%>
					    </div>
					  </div>
					  
					  <div class="row">
					    <div class="col-sm">
					      Time:<%=rs.getString("time") %>
					    </div>
					    <div class="col-sm">
					      In Delivery:<%=rs.getString("in_delivery") %>
					      <%String x=rs.getString("in_delivery"); %>
					    </div>
					    <div class="col-sm">
					      Category:<%=rs.getString("category") %>
					    </div>
					  </div>
					  <p>Description:<%=rs.getString("description")%></p>
					  
					  <% try{
						  if(x.equals("Yes"))
					  
					  { %>
						  <div class="row">
						  <form class="col-sm" action="cancelyourorderservlet" >
						  <button class="btn dis-butt" type="submit" value=<%=rs.getInt("pid")%> name="cancelbutton"disabled>Cancel</button>
						  </form>
						  <form class="col-sm" action="delivery_info_servlet">
						  <button class="btn abl-butt" style="float:right;"  type="submit" value=<%=rs.getInt("pid")%> name="delivery_info">Delivery info</button>
						  </form>
						  </div>
					  <%}
					  else{ %>
						  <div class="row">
						  <form class="col-sm" action="cancelyourorderservlet" >
						  <button class="btn"  type="submit" value=<%=rs.getInt("pid")%> name="cancelbutton">Cancel</button>
						  </form>
						  <form class="col-sm" action="delivery_info_servlet">
						  <button class="btn dis-butt" style="float:right;" type="submit"  name="delivery_info" disabled>Delivery info</button>
						  </form>
						  </div>
					  <%}
					  }
					  catch(Exception e){
						  e.printStackTrace();
						 System.out.println("error in if else in yourordrr.jsp");
					  }
					  %>
					  
		        </div>
		        <p class="card-text"><small class="text-muted">status of your order=</small></p>
		      </div>
		    </div>
		  </div>
		</div>
		 <%
	}
}
catch(Exception e){
	e.printStackTrace();
}
%>
</div>
</section>
</body>
</html>