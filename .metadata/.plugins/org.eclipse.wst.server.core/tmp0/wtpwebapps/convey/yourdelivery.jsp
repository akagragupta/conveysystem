<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
    <%@  include file="main.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delivery page</title>
<link rel="stylesheet" type="" href="css/yourdelivery.css">
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
					      Quantity:<%=rs.getString(2) %>
					    </div>
					    <div class="col-sm">
					      Price:<%=rs.getInt(3)%>
					    </div>
					    <div class="col-sm">
					      Extra_Payment:<%=rs.getInt(4)%>
					    </div>
					  </div>
					  
					  <div class="row">
					    <div class="col-sm">
					      Time:<%=rs.getString(5) %>
					    </div>
					    <div class="col-sm">
					      Customer:<%=rs.getString(9)%>
					    </div>
					    <div class="col-sm">
					      Address:<%=rs.getString(10)%>
					    </div>
					  </div>
					  <p>Description:<%=rs.getString(6)%></p>
					  <form action="canceldeliveryservlet">
					  <button class="btn butt-color" type="submit" value=<%=rs.getInt(11)%>  name="cancelbutton">Cancel</button>
					  </form>
		        </div>
		        <p class="card-text"><small class="text-muted"><%=rs.getString(7) %> update the status=<%=rs.getString(8) %></small></p>
		      </div>
		    </div>
		  </div>
		</div>
		 <%
	}
}
catch(Exception e){
	System.out.println("error in yourdelivery.jsp");
	e.printStackTrace();
}
%>
</div>
</section>
</body>
</html>