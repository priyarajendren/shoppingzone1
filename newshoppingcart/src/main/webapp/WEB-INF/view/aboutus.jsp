<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<spring:url value="resources/css/bootstrap.min.css"/>">
  <script src="<spring:url value="resources/js/jquery.min.js"/>"></script>
  <script src="<spring:url value="resources/js/bootstrap.min.js"/>"></script>


</head>

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
   <li><a  href= "<spring:url value="/home"/>">HOME</a></li>
   <li><a href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a class="active" href="<spring:url value="/allProducts"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
</ul>

<center>
<div>
<img src="<spring:url value="resources/images/watch17.jpg"/>" alt="watches" width="900" height="350"/>
</div>
<div class="container">
  <div class="jumbotron">
    
    
         
    <p>We extend our friendly hands to you to make our bonding stronger and enjoying. Your satisfaction is our foremost priority and we are eagerly waiting to assist you always. For any queries regarding servicing and repairing, we are always connected with you over phone calls and live chats, 24 hours a day and 365 days a year. We give our best to bring smiles on your face by providing quality services that you are looking for. Our service staffs are horology experts with vast experience and precision.

Our aim is to turn even your small request into a memorable experience and this keeps us ahead from others. Our highly trained concierge staffs deliver professional and personal assistance that meet your demands, the way you want.

Our dedicated customer service team is working to know your wishes and desires that bring us closer to your needs. This allows us to make noteworthy changes to provide satisfied solutions to your every inquiry regarding luxury watches. Your queries make us experienced in terms of delivering the best watch-care services </p>
               
    </div>
   </div>
  
    </center>


</body>
</html>