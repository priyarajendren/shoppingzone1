
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<spring:url value="resources/css/bootstrap.min.css"/>">
  <script src="<spring:url value="resources/js/jquery.min.js"/>"></script>
  <script src="<spring:url value="resources/js/bootstrap.min.js"/>"></script>

 
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 40%;
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

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>

 
 <body>
 
 
<div>
  <ul>
   <li><a class="active" href= "<spring:url value="/"/>">HOME</a></li>
   <li><a href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a href="<spring:url value="/allProducts"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
   </ul>
               
   
  <br>
  </div>
 
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



<body background="<spring:url value="/resources/images/watch12.jpg"/> ">
<div class="container"><div class="row">
<div class="col-md-4 col-md-offset-7">
<div class="panel panel-default">
<div class="panel-heading">

<div class="page-header">
    <h1>Login form </h1>
</div>
</div>
<div class="panel-body">
<form class="form-horizontal" role="form" id="780274440">
<div class="form-group">
<label for="inputEmail3" class="col-sm-3 control-label">Email</label>
<div class="col-sm-9">
<input type="email" class="form-control" id="inputEmail3" placeholder="Email" required="">
</div></div>
<div class="form-group">
<label for="inputPassword3" class="col-sm-3 control-label">Password</label>
<div class="col-sm-9">
<input type="password" class="form-control" id="inputPassword3" placeholder="Password" required="">
</div></div>
<div class="form-group">
<div class="col-sm-offset-3 col-sm-9">
<div class="checkbox"><label class="">
<input type="checkbox" class="">Remember me</label>
</div></div></div>
<div class="form-group last">
<div class="col-sm-offset-3 col-sm-9">
<button type="submit" class="btn btn-success btn-sm">Sign in</button> 
<button type="reset" class="btn btn-default btn-sm">Reset</button>
</div></div></form></div>
<div class="panel-footer">Not Registered? <a href="signUp" class="">Register here</a>
</div></div></div></div></div>
</body>
</html>