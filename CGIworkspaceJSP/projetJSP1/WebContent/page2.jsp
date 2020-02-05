<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Je suis page2 JSP</h1>
<%
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
String reponse = nom + " " + prenom;
out.print(reponse.toUpperCase());
%>
</body>
</html>