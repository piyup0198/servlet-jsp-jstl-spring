<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>        
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>        
    
<%@ page import="java.util.List" %>    
<%@ page import="com.training.web.model.User" %>  
<%@ page session = "true" %>
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
table{
    margin-left:550px;
}   
   
</style>
</head>
<body>
<%@ include file ="header.jsp" %>
<c:out value="Welcome ${user} You are sucessfully logged in!!"></c:out>
<%-- 
<%@ include file ="header.jsp" %>
<%
String user = (String)request.getAttribute("user");
out.print("Welcome "+user+" You are successfully logged in" );
//out.print(session.getId());
List<User> usrList = (List<User>)request.getAttribute("usrList");
//out.println("<table border='1'> ");
//out.println("<tr> <th>");
//out.println("Name </th>");
//out.println("<th> Password </th>");
%>
--%>

<table border = "1">
  <tr>
     <th>Name</th>
		<th>Number</th>
		<th>Joining Date</th>
		
		<c:forEach items="${usrList }" var="user">  
		     <tr>
			<td>${user.getUserName()}</td>
			<td>${user.getPassword()}</td>
			<td><fmt:formatDate value="${user.getJoining()}" pattern="dd-MM-yyyy" /></td>
		</tr>
		
		</c:forEach>
		
		<c:url value="/header.jsp" var="headUrl">
			<c:param name="userName" value="${user}"></c:param>
		</c:url>
		<a href="${headUrl}">Click here</a>
</table>



<c:set var ="num" value="54321.56435" />
Number after setting type attibute:
<br>
<fmt:formatNumber value="${num}" type="currency"  /><br>
Number after setting maxIntegerDigit and MaxFractionDigit type attribute:
<br>
<fmt:formatNumber value="${num}" type="number" maxIntegerDigits="4" maxFractionDigits="3" /><br>
Number after setting pattern attibute:
<br>
<fmt:formatNumber value="${num}" type="number" pattern="##,###.###"  /><br>
Number after setting Integrals:
<br>
<fmt:parseNumber value="${num}" type="number" integerOnly= "true"  /><br>
<c:set var = "currentDate" value="<%=new java.util.Date() %>" />
Today's Date:
<br>
<c:out value="${currentDate}" /><br>
Todya's Date:
<fmt:formatDate value="${currentDate}" pattern="dd-mm-yyyy" type="both" />

<c:set var = "testString" value="Hi this is a JSTL function example" />
<c:if test = "${fn:contains(testString, 'JSTL') }">
   <h3>String JSTL is found..</h3>
</c:if>

<c:if test = "${fn:startsWith(testString, 'H') }">
   <h3>StartsWith is found..</h3>
</c:if>

<p>Index is:  ${fn:indexOf(testString, 'a') }</p>

<p>Length of testString string is : ${fn:length(testString)}</p>

<c:set var = "testString1" value="   Hi this is    a JSTL function example      " />

<p>Length without trim is: ${fn:length(testString1)}</p>
<c:set var ="str" value="${fn:trim(testString1)}"/>
<p>Length after trim is: ${fn:length(str)}</p>

<p>To upper case: ${fn.toUpperCase(testString)}</p>
  



   
<!--  
<%-- 
<table border="1">
	<tr>
		<th>Name</th>
		<th>Number</th>
		<%
		for(User usr:usrList) { %>
		<tr>
			<td><%=usr.getUserName() %> </td>
			<td><%=usr.getPassword() %> </td>
		</tr>	
		
		<% } %>
	
</table>
--%>

-->


</body>
</html>
 <%-- 
//JSP Directives: Instruction to the web container(tomcat) on how to control and process JSP
//Types : 1.page directive   2.include directive   3.taglib directive
//Page directive attributes: 
//import, session, buffer, autoflush, contentType, isErrorPage, errorPage, isThreadSafe, language, info
--%>


<!--  
//JSP implicit objects:
//out (JspWriter)
//request (HttpServletRequest)
//response (HttpServletResponse)
//config (servletConfig);
//application (ServletContext)
//session (HttpSession)
//page (Object)
//exception (Throwable)

//fn:startsWith
//fn:indexOf
//fn:length
//fn:subString
//fn:trim
//fn:toLowerCase
//fn:toUpperCase
-->

