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
<title>PRODUCT DETAILS</title>
<head>
<style >
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

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>





</head>
<body>
<ul>
<li><a class="active" href= "<spring:url value="/"/>">HOME</a></li>
   <li><a href="<spring:url value="/logout"/>">LOGOUT</a></li>
  
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
</ul>

  			</div>
		</nav>
		<table class="table">
			<thead>
				<tr>
					<td>Product Id</td>
					<td>Product Name</td>
					<td>Price Tag</td>
				</tr>
			</thead>
			<tbody class="table-hover">
			<c:forEach items="${ls}" var="p">
				<tr>
					<td>${p.pid}</td>
					<td>${p.pname}</td>
					<td>${p.pricetag}</td>
					<td><a name="_eventId_addtocart" href="<spring:url value="/addcart/${p.pid}"/>">Add to Cart</a></td>
					
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</body>
</html>