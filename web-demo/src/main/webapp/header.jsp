<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  body{
    background-image: linear-gradient(to right, red , yellow);
   font-family:"Times New Roman",Ties, Serif;
  }
</style>
</head>
<body style="text-align:center;">
<div style="background-color:LightGray;">
    <h1>This is header</h1>
    <h2>welcome!!!!!</h2>
    Username: <%=request.getParameter("userName") %>
    </div>
</body>
</html>