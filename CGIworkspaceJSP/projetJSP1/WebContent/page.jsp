<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Je suis page JSP</h1>

	<form action="page2.jsp?x=y" method="post" target="_blank">
		<input type="text" name="nom"><br> 
		<input type="text" name="prenom"><br>
	
	<input type="submit" value="Connect page 2 jsp">
	
	</form>
</body>
</html>