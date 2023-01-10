<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   body{
   background-image: linear-gradient(to right, red , yellow);
   }
   
   form{
   width:400px;
   height: 300px;
   text-align:center;
   font-family:"Times New Roman",Ties, Serif;
    margin-left:450px;
    border: 2px solid;
    
   }
   
   caption{
   font-family:"Times New Roman",Ties, Serif;
   }
   
   .center{
   width:350px;
   height:200px;
  
   }
</style>
</head>
<body style="text-align:center;">
<%@ include file ="header.jsp" %>
 <form action="<%=request.getContextPath() %>/Add" method="post" style="background-color:white;">
 <div class="center">
 <caption><h3>**Register Below**<h3></h3></caption>
        <p>NAME:</p> 
        <input type="text" name="id"/>
   
        <p>NUMBER:</p> 
        <input type="text" name="name"/><br> <br>
        
        <p>Joining Date:</p> 
        <input type="text" name="joining"/><br> <br>

        <input type="submit" value="Register">
    </form>
    </div>

</body>
</html>