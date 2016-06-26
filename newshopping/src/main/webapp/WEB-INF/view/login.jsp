<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<spring:url value="resources/css/bootstrap.min.css"/>">
  <script src="<spring:url value="resources/js/jquery.min.js"/>"></script>
  <script src="<spring:url value="resources/js/bootstrap.min.js"/>"></script>
 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
<head>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not (.active ) {
	background-color: #111;
}

.active {
	background-color: #4CAF50;
}
</style>





</head>
<body>
	<ul>
		 <li><a  href= "<spring:url value="/"/>">HOME</a></li>
   <li><a class="active" href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a href="<spring:url value="/ourstores"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
	</ul>

</body>

</head>
<body>
<div class="container">
	<section id="content">
		<form action="">
			<h1>Login Form</h1>
			<div>
				<input type="text" placeholder="userName" required="" id="userName" />
			</div>
			<div>
				<input type="password" placeholder="password" required="" id="password" />
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="#">Lost your password?</a>
				<a href="registration">Register</a>
			</div>
		</form><!-- form -->
		
		</div><!-- button -->
	</section><!-- content -->
</div><!-- container -->
</body>
</html>
	
</body>
</html>