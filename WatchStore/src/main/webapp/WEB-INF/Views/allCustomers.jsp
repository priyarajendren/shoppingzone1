<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
       <link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap.min.css"/>">
  <script src="<spring:url value="/resources/js/jquery.min.js"/>"></script>
  <script src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>
  <script src = "<spring:url value="/resources/js/angular.min.js"/>"></script>
   <style>
 input[type=text] {
    width: 130px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 100%;
}
</style>
 
 
 
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>


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

li a:hover:not(.active) 
{
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}

</style>


</head>

<body >
<div class="container" id="main">


<p> <h2 style="color:#3CGH42;"> Welcome to the shopping world of your Time!!!!!</h2> </p>
<div>
 <ul>
   <li><a  href= "<spring:url value="/"/>">HOME</a></li>
   <li><a href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a class="active" href="<spring:url value="/allProducts"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
</ul>
               
   
  <br>
  </div>

</div>
<form:form action="/WatchStore/addProd" method="post">
			<form:errors path="*" cssClass="formErrorBlock"/>
			<table>
				
				<tr>
					<td> <form:label path="name">Enter the your Name</form:label> </td>
					<td> <form:input path="name"/> </td>
					<td> <form:errors path="name" cssClass="formFeildError"/></td>
				</tr>
				
				<tr>
					<td> <form:label path="email">Enter valid email ID</form:label> </td>
					<td> <form:input path="email"/> </td>
					<td> <form:errors path="email"></form:errors></td>
				</tr>
				
				<tr>
					<td> <form:label path="pwd">Enter your password</form:label> </td>
					<td> <form:input path="pwd"/> </td>
					<td> <form:errors path="pwd"></form:errors></td>
				</tr>
				
				<tr>
					<td> <form:label path="addr">Enter your address</form:label> </td>
					<td> <form:input path="addr"/> </td>
					<td> <form:errors path="addr"></form:errors></td>
				</tr>
				
				<tr>
					<td> <form:label path="phno">Enter phone no</form:label> </td>
					<td> <form:input path="phno"/> </td>
					<td> <form:errors path="phno"></form:errors></td>
				</tr>
				
				<tr>
					<td> <input type="submit" value="Add Product"/> </td>
					<td> <input type="reset" value="Clear Data"/> </td>
				</tr>
				
			</table>
		
		</form:form>
		
		</body>
</html>