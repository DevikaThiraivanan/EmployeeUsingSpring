<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
  
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body bgcolor="pink">
<table  >
<tr>

<th>ID</th>
<th>NAME</th>
<th>SALARY</th>



</tr>
<a:forEach items="${ emps}" var="emp">
<tr>
<td>${ emp.id}</td>
<td>${ emp.name}</td>
<td>${ emp.salary}</td>

</tr>

</a:forEach>
</table>

</body>
</html>