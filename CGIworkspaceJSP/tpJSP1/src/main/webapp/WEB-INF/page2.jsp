<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page 2 WEB-INF TP</title>
</head>
<body>
Personne p = (Personne)request.getAttribute("p");
out.print(p.toString());


</body>
</html>