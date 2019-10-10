<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="" href="css/signup.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Sign Up</title>
</head>
<body>
<div class="signup-div hero-image">
<div style="text-align: center;" ><h1>please sign up here!</h1></div>
<section>
	<div class="container bg-color">
	<% try{ %>
		<form action="Signupservlet" enctype="multipart/form-data" method="POST" name="regF">
		
	  	<div class="row ">
		    <div class="col mid">
		      <label style="width:140px" >name</label>
		      <input type="text" placeholder="enter unique username"  name="name" onblur="checkExist()"required><span id="isE"></span><br><br>
		      <!-- <button class="btn btn-primary" formaction="checkuniqservlet" >Check</button><br> -->
		      <label class="but" style="width:140px">image</label>
		      <input type="file" name="file" ><br>
		      <label style="width:140px">address</label>
		      <input type="text" name="address" required><br>
		      <label style="width:140px">college</label>
		      <input type="text" name="college"required><br>
		      <label style="width:140px">hostel</label>
		      <input type="text" name="hostel"required><br>
		      <label style="width:140px">room</label>
		      <input type="text" name="room"required><br>
		      <label style="width:140px">postal</label>
		      <input type="number" name="postal"required><br>
		      <label style="width:140px">phone</label>
		      <input type="number" name="phone"required><br>
		      <label style="width:140px">payment-methods</label>
		      <input type="text" name="payment-methods"required><br>
		      <label style="width:140px">passwords</label>
		      <input type="text" name="password"required><br>
		      <button class="but" type="submit" >Sign Up!</button>
		    </div>
		    <div class="col mid">
		      <button href="#" class="fa fa-google" style="width: 200px">Sign up with <b>Google</b></button>
		      <p>or</p>
		      <button href="#" class="fa fa-facebook" style="width: 200px">Sign up with <b>Facebook</b></button>
		    </div>
		</div>
		
		</form>
		<%}
		catch(Exception e){
			System.out.println("lol sighup.jsp not giving error in unique cases");
			response.sendRedirect("error.jsp");
		}
		%>
	</div>
</section>
</div>
</body>
</html>