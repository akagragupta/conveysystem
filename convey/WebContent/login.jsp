<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="" href="css/login.css">
	<title>LOGIN</title>
<meta charset="ISO-8859-1">
</head>


<body class="body">
<div class="container-fluid hor-align ver-align login-div">
<form action="loginservlet1">
		
		<h1 style="text-align:center;" >Login</h1>
		<p><input id="input" type="text" placeholder="enter username" name="username" style="text-align:center;"><br></p>
		<p><input id="input" type="password" placeholder="enter password" name="password" style="text-align:center;"><br></p>
		<div>
		<div class="row">
			<div class="col-sm">
			<button class="butt-css" type="submit" style="text-align:center;">Login</button>
			</div>
			<div class="col-sm">
			<div><button class="butt-css" formaction="signup.jsp"style="text-align:center;" >Sign Up</button></div>
			</div>
		</div>
		<br>
		</div>
		
			

</from>
<!-- </div>
<div><button formaction="signup.jsp" >Sign Up</button></div> -->
</body>
</html>