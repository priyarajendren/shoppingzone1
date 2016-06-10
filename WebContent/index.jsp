<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Shopping Cart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/css/bootstrap.min.css">
  <script src="resources/js/jquery.min.js"></script>
  <script src="resources/js/bootstrap.min.js"></script>
  
  
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
<ul>
  <li><a class="active" href="#HOME">HOME</a></li>
  <li><a href="login.jsp">LOGIN</a></li>
  <li><a href="brands.jsp">BRANDS</a></li>  
  <li><a href="ourstores.jsp">OURSTORES</a></li>
  <li><a href="aboutus.jsp">ABOUTUS</a></li>
</ul>





<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1" ></li>
      <li data-target="#myCarousel" data-slide-to="2" ></li>
      <li data-target="#myCarousel" data-slide-to="3" ></li>
          </ol>

    
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="resources/images/watch1.jpg" alt="Chania" width="300" height="250">
      </div>

      <div class="item">
        <img src="resources/images/watch2.jpg" alt="Chania" width="300" height="250">
         </div>
    
      <div class="item">
        <img src="resources/images/watch3.jpg" alt="Chania" width="300" height="250">
         </div>

      <div class="item">
        <img src="resources/images/watch4.jpg" alt="Chania" width="300" height="250">
        </div>
  
  <div class="item">
        <img src="resources/images/watch5.jpg" alt="Chania" width="300" height="250">
        </div>
  <div class="item">
        <img src="resources/images/watch6.jpg" alt="Chania" width="300" height="250">
        </div>
  
    </div>

    
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>

<br>
<div>


<a href="watch1.jsp"> <img src="resources/images/watch2.jpg" alt="watches" width="200" height="100"/></a>
<a href="watch2.jsp"> <img src="resources/images/watch1.jpg" alt="watches" width="200" height="200"/></a>
<a href="watch3.jsp"> <img src="resources/images/watch13.jpg" alt="watches" width="200" height="200"/></a>
<a href="watch4.jsp"> <img src="resources/images/watch11.jpg" alt="watches" width="200" height="200"/></a>
</div>

</br>



</body>
</html>