<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<%@ page import="java.util.List" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill</title>
<style>
  *{
     text-align : center;
  }
  .header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color:#f5f5f5;
}

.header .logo {
  font-size: 25px;
  font-family: 'Sriracha', cursive;
  color: #000;
  text-decoration: none;
  margin-left: 30px;
}

.nav-items {
  display: flex;
  justify-content: space-around;
  align-items: center;
  background-color: #f5f5f5;
  margin-right: 20px;
}

.nav-items a {
  text-decoration: none;
  color: #000;
  padding: 35px 20px;
}

h3{
   backgroud-color:#f5f5f5;
}

#tables{
    border:2px solid;
    background-color:#f5f5f5;
   margin-left:350px;
}

th{
   text-decoration:underline;
   color:darkblue;
}
</style>
</head>
<body>
<header class="header">
  <a href="#" class="logo">Power Provider</a>
  <nav class="nav-items">
    <a href="#">Home</a>
    <a href="#">About</a>
    <a href="#">Contact</a>
  </nav>
</header>
<%int prevRead=(int)request.getAttribute("prevRead");
int currRead=(int)request.getAttribute("currRead");
int unit= currRead-prevRead;
String zone=(String)request.getAttribute("zone"); 
if(unit<100){
	if(zone.equals("Urban")){
		int price=unit*6-100;
		request.setAttribute("price", price);
	}
	else{
		int price=unit*4-100;
		request.setAttribute("price", price);
	}
}
else{
	if(zone.equals("Urban")){
		int price=unit*6;
		request.setAttribute("price", price);
	}
	else{
		int price=unit*4;
		request.setAttribute("price", price);
	}
}



%>
<h1>Bill</h1>
<c:set var="currdate" value="<%=new java.util.Date() %>"></c:set>

<table>
<h2>Electricity Bill</h2>


</table>
<table id="tables">
<tr>
<th><h3> Meter Id </h3></th>
<th><h3> Current Reading </h3></th>
<th><h3> Previous Reading</h3></th>
<th><h3>  Zone</h3></th>
</tr>

<tr>
<td>${meterId}</td>
<td>${currRead}</td>
<td>${prevRead}</td>
<td>${zone}</td>
</tr>
<tr>
<th><h3> Total Unit Consumption:- </h3></th></tr>

<tr>
<td>${currRead-prevRead}</td>
</tr>
<tr>
<th>Total Bill :-</th></tr>
<tr>
<td>${price}</td>
</tr>




</table>

<div class="container my-5">
  <!-- Footer -->
  <footer
          class="text-center text-lg-start text-white"
          style="background-color: #f5f5f5"
          >
    <!-- Grid container -->
    <div class="container p-4 pb-0">
      <!-- Section: Links -->
      <section class="">
        <!--Grid row-->
        <div class="row">
          <!-- Grid column -->
          <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
            <h6 class="text-uppercase mb-4 font-weight-bold">
              Company name
            </h6>
            <p style="text-align:center;">
              This is my Footer!!
            </p>
          </div>
          
</div></section>
</div>
</footer>
</div>
</body>
</html>