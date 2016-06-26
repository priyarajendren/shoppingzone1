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
body {
	background-color: #C39BD3;
}
</style>

<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
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

li

 

a


:hover


:not

 

(
.active

 

)
{
background-color


:

 

#111


;
}
.active {
	background-color: #4CAF50;
}
</style>






</head>


<body>
<body>
	<ul>
		 <li><a  href= "<spring:url value="/index"/>">HOME</a></li>
   <li><a class="active" href="<spring:url value="/login"/>">LOGIN</a></li>
  <li><a href="<spring:url value="/brands"/>">BRANDS</a></li>   
   <li><a href="<spring:url value="/ourstores"/>">OURSTORES</a></li>
  <li><a href="<spring:url value="/aboutus"/>">ABOUTUS</a></li>
	</ul>



	<tr valign="top">
   <td width="84%">
    <P align=center>
				<FONT color=#056796><STRONG><U>Registration Page</U></STRONG></FONT>
			</P>
    <form action=Registration.jsp method=POST>
    <TABLE borderColor=#056796 cellSpacing=5 cellPadding=5 align=center
					border=0>
     <TBODY>
      <TR>
       <TD borderColor=#056796>
       <P align=right>
									<FONT color=#056796>UserName</FONT>
								</P>
							</TD>
       <TD borderColor=#056796><INPUT id=text1 name=userName
								SIZE="16">
       </TD>
      </TR>
      <TR>
       <TD borderColor=#056796>
        <P align=right>
									<FONT color=#056796>Password</FONT>
								</P>
							</TD>
       <TD borderColor=#056796><INPUT id=text1 name=password SIZE="16">
       </TD>
      </TR>
      <TR>
       <TD borderColor=#056796>
        <P align=right>
									<FONT color=#056796>FullName</FONT>
								</P>
							</TD>
       <TD borderColor=#056796><INPUT id=text1 name=fullName SIZE="16">
       </TD>
      </TR>
      <TR>
       <TD borderColor=#056796>
        <P align=right>
									<FONT color=#056796>Email Id</FONT>
								</P>
							</TD>
       <TD borderColor=#056796><TEXTAREA NAME="emailId" COLS="16"
									ROWS="3 "></TEXTAREA></td>
						</tr>
      
      <TR>
       
       <TD borderColor=#056796>
         <P align=center>
									<INPUT id=button1 type=submit value=Register name=button1>
								</P> 
          
        </TD>
						</TR>
     </TBODY>
   </TABLE>
   </form>
</U></STRONG></FONT>

</td>
</tr>

<center>

<div class="container">
  <div class="jumbotron">
  
  <b>already having an account !</b>
  <a href= "login"> LOGIN </a>
  </div>


	</center>






</body>



</html>



