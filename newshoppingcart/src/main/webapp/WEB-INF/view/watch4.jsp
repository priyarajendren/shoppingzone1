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
<title>watch4</title>
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
   <li><a href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a href="<spring:url value="/allProducts"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
</ul>
  
</ul>

</body>

</head>
<body>
<center>
<div>
<img src="<spring:url value="resources/images/watch16.jpg"/>" alt="watches" width="900" height="350"/>">

</div>
<div class="container">
  <div class="jumbotron">
    <h3><b> EMPORIUM ARMANI </b></h3> 
    <img src="<spring:url value="resources/images/watch11.jpg"/>" alt="watches" width="500" height="500"/>">
    
         
    <p>Model No.B13452.39.86 - Rs. 16,800-EMI available</p>
               
     <button type="button" class="btn btn-success">BUY</button>     
               
          
    </div>
    
       

</center>
</body>
</html>



