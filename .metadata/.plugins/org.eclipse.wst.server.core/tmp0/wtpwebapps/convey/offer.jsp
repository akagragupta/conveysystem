<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="main.jsp" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="" href="css/offer.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Offer Page</title>
</head>
<body>

<section>
<div class="row">
<% try{
	ResultSet rs=(ResultSet)request.getAttribute("rs");
	while(rs.next()){
		if("No".equalsIgnoreCase(rs.getString(10)))
		{
		%>
		
		<div class="card  col-sm-4 inline" style="width: 18rem;">
		  <img src="..." class="card-img-top" alt="...">
		  <div class="card-body">
		    <h5 class="card-title"><%=rs.getString(2)%></h5>
		    <div class="row">
		    <h7 class="cardinputwidth col">Price:<%=rs.getInt(4)%></h7>
		    <h7 class="cardinputwidth col">Quantity:<%=rs.getString(5)%></h7>
		    </div>
		    <div class="row">
		    <h7 class="cardinputwidth col">Tip:<%=rs.getInt(7)%></h7>
		    <h7 class="cardinputwidth col">Time:<%=rs.getString(8)%></h7>
		    </div>
		    <p class="card-text">Description:<%=rs.getString(3)%></p>
		    <form action="deliverproductservlet">
		    <button class="btn butt-color" type="submit" value=<%=rs.getInt(1)%> name="pid">Deliver</button>
		    </form>
		   <!--  <a href="deliverproductservlet" class="btn btn-primary" type="submit" value="" name="id">Deliver</a>
		  -->
		 </div>
		 </div>
		 
		 <%
		}
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