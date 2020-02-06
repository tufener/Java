<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
PAGE 1 SESSIon
<% String valeur = session.getAttribute("nom").toString();
out.print("je suis paage 2 : " + valeur) ;

%>
</body>
</html>