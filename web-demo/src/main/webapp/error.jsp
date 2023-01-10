<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isErrorPage ="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%@ include file ="header.jsp" %>
    <h3 style="color:red;">This is an error page!</h3>
    <h2>Some exception occurred</h2>
    Exception: <%=exception%>
</body>
</html>