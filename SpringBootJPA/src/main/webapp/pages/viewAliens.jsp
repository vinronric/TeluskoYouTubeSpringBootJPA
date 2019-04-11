<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Aliens</title>
</head>
<body>
   <form>
   <a href="http://localhost:8087">Home</a>
   <h1><center>View All Aliens List</center></h1>
	       <table border="1">
			<tr>
			<th>Alien Id</th>
			<th>Alien Name</th>
			</tr>
			<c:forEach items="${allAliens}" var="alien" >
			    <tr>
			        <td>${alien.aid}</td>
			        <td>${alien.aname}</td>
			    </tr>
			</c:forEach>
		</table>
   </form>
</body>
</html>