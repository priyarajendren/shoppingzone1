<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<spring:url value="resources/css/bootstrap.min.css"/>">
  <script src="<spring:url value="resources/js/jquery.min.js"/>"></script>
  <script src="<spring:url value="resources/js/bootstrap.min.js"/>"></script>
 
<title>sucess page</title>
</head>
<body>
	User Details
	<hr>
	FIRSTNAME : ${user.FIRSTNAME}
	<br /> LASTNAME : ${user.LASTNAME}
	<br /> USERNAME : ${user.USERNAME}
	<br /> EMAIL : ${user.EMAIL}
	<br />


</body>
</html>