<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ include file="main.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"><base>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/vue/2.6.10/vue.min.js">
<link rel="stylesheet" type="" href="css/profile.css">
<meta charset="ISO-8859-1">
<title>profile page</title>



</head>
<body>

<%
ResultSet rs=(ResultSet)request.getAttribute("rs"); 
try{
while(rs.next()){
	%>
	
	``<div class="">
		  <img class="dp"src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2I3PugwGnLX62xhM8YojIwsL-fhQkWmuUJHQ2ya4KPtZN6QEIfw">
		</div>

		<div class="container place">
			
		  <div class="row">
		    <div class="col-4"><b>Uid</b></div>
		    <div class="col-4"><%=rs.getInt(1) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Name</b></div>
		    <div class="col-4"><%=rs.getString(2) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Address</b></div>
		    <div class="col-4"><%=rs.getString(3) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>College</b></div>
		    <div class="col-4"><%=rs.getString(4) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Hostel</b></div>
		    <div class="col-4"><%=rs.getString(5) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Room</b></div>
		    <div class="col-4"><%=rs.getString(6) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Postal-Code</b></div>
		    <div class="col-4"><%=rs.getInt(7) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>phone No</b></div>
		    <div class="col-4"><%=rs.getInt(8) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Payment-Methods</b></div>
		    <div class="col-4"><%=rs.getString(9) %></div>
		  </div>
		  <div class="row">
		    <div class="col-4"><b>Password</b></div>
		    <div class="col-4"><%=rs.getString(10) %></div>
		  </div>
		  
		</div>
		<div><form action="login.jsp">
		  <button type="submit" class="fixedbutton btn btn-outline-dark" >Log Out</button>
		  </form>
		  </div>
		
	<%}
}
catch(Exception e){
	System.out.println("failin showing profile");
	e.printStackTrace();
}%>



</div>
</body>
</html>