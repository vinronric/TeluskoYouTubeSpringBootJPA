<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Alien</title>
</head>
<body>
   <a href="http://localhost:8087/getAliens">View All Aliens List</a>
   <h1><center>Add Alien<center></h1>
  <form action="/addAlien" method="post" >
   <br>
     <input type="hidden" name="aid" ><br>
     Alien Name : <input type="text" name="aname"><br>
     <input type="submit"><br>
       
  </form>

</body>
</html>