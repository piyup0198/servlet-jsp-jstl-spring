<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
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
<form action="<%=request.getContextPath()%>/BillServlet" method="post" style="backgroud-color:#f5f5f5;">
<h3>Enter Details for Show the Bill</h3>
<label for="meterID">Meter ID:-</label>
<input type="text" name="meterId" placeholder="Meter ID" ><br><br>
<br><br>
<input id="button1" type="submit" value="Show Bill">
</form>

<div class="container my-5">
  <!-- Footer -->
  <footer
          class="text-center text-lg-start text-white"
          style="background-color: #929fba"
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