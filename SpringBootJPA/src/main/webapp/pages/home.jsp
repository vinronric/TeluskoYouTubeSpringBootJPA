<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Alien</title>
</head>
<body>

   Add Alien
  <form action="/addAlien" method="post" >
   <br>
     <input type="hidden" name="aid" ><br>
     Alien Name : <input type="text" name="aname"><br>
     <input type="submit"><br>
       
  </form>

</body>
</html>