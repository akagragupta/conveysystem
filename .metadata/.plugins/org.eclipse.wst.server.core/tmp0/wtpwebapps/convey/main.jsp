<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="conveypackage.Sql"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="" href="css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Convey System</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<%

if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}

%>

<nav class="navbar navbar-expand-lg navbar-light  nav-css">
  <a class="navbar-brand" href="convey.jsp">Convey</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item ">
        <a class="nav-link" href="profileservlet">Profile <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link"  data-toggle="modal" data-target="#myModal" href="#">Add Product</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="offerservlet">Offers</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="about-us.jsp" >About Us</a>
      </li>
      <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Activity</a>
    <div class="dropdown-menu">
      <a class="dropdown-item nav-drop" href="yourorder">Your Orders</a>
      <a class="dropdown-item nav-drop" href="yourdelivery">Your Delivery</a>
    </div>
    </li>
    </ul>
  </div>
</nav>
<section id="popup_window_add_product">
	<div>
		<div class="container">
 			 <!-- The Modal -->
			  <div class="modal" id="myModal">
			    <div class="modal-dialog">
			      <div class="modal-content">
			      
			        <!-- Modal Header -->
			        <div class="modal-header  " style="background-color:orange !important;">
			          <h4 class="modal-title" style="color:white !important;">Add Product Card Here</h4>
			          <button type="button" class="close" data-dismiss="modal">&times;</button>
			        </div>
			        
			        <!-- Modal body -->
			       
			        <div class="modal-body">
			        <form action="addproductservlet">
			        	<label class="lable_width">Name</label>
			         	<input name="name" type="text" placeholder="enter product name" ><br>
			         	
			            <label class="lable_width">Price</label>
			            <input name="price" type="number" placeholder="enter product price" ><br>
			            
			            <label class="lable_width">Quantity</label>
			         	<input name="quantity" type="text" placeholder="enter product quantity" ><br>
			         	
			         	<label class="lable_width">Image</label>
			         	<input name="image" type="file"  ><br>
			         	
			         	<label class="lable_width">Extra Payment</label>
			         	<input name="tip" type="number" placeholder="enter tip here" ><br>
			         	
			         	<label class="lable_width">Time</label>
			         	<input name="time" type="text" placeholder="enter by time you want" ><br>
			         	
			         	<label class="lable_width">Category</label>
			         	<select name="category">
						  <option value="Fruits">Fruits</option>
						  <option value="Food">Food</option>
						  <option value="Medicine">Medicine</option>
						  <option value="General store things">General store things</option>
						  <option value="Other">Other</option>
						</select>
			         	<%
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
			         	%>
			         	<input type="hidden" value=<%=id %> name="id">
			         	<textarea name="desc" rows="4" cols="50">Enter Description</textarea>
			         	<button class="popup-btn" type="submit ">Submit</button>
			         	</form>
			        </div>
			        
			        <!-- Modal footer 
			        <div class="modal-footer">
			          <button type="submit" class="btn btn-danger" formaction="addproductservlet" data-dismiss="modal">Submit</button>
			        </div>-->
			        
			      </div>
			    </div>
			  </div>
  		</div>
	</div>
</section>
</body>
</html>