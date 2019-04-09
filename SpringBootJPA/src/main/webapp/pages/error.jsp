<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
  Application has encountered an error which is highlighted in red below<br>
  Please contact support team to resolve this issue. <br>
  <br>
  <center><font color="red"><b>
   ${exception}
   </b></font>
  </center> 
  </form>
</body>
</html>