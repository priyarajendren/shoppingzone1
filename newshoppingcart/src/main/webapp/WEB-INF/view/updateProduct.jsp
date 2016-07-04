<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<% 
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		response.setHeader("noStore","true");
		response.setHeader("mustRevalidate","true");
	%>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modify Product Details</title>
		<link rel="stylesheet" href="<spring:url value="/resources/styles/bootstrap.min.css" />" />
		<script type="text/javascript" src="<spring:url value="/resources/js/jquery.min.js" />" ></script>
    	<script type="text/javascript" src="<spring:url value="/resources/js/bootstrap.min.js" />" ></script>		
	</head>

	<body>
		<nav class="navbar navbar-default">
  			<div class="container-fluid">
	    		<ul class="nav navbar-nav">
      				<li><a href="<spring:url value="/"/>">Home</a></li>
    	  			<li><a href="<spring:url value="/aboutus"/>">About Us</a></li>  
    	  			
    			</ul>
  			</div>
		</nav>
		<form:form action="/newshoppingcart/upd" method="post">
			<table>
				<!-- <tr>
					<td>Product Id</td>
					<!--<td>${di.pid}</td>
					<td><form:input path="pid" disabled="true"/> </td>
				</tr>-->
				<tr>
					<td>Product Name</td>
					<!--<td>${di.pname}</td>-->
					<td><form:input path="pname"/></td>
				</tr>
				<tr>
					<td>Price Tag</td>
					<!--<td>${di.pricetag}</td>-->
					<td><form:input path="pricetag"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update"></td>
					<td><input type="reset" value="Clear Data"></td>
				</tr>
			</table>
		</form:form>
	</body>

</html>