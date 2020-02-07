<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Personne"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>je suis la page 1 jsp de maven web</title>
</head>
<body>
<h1>je suis la page 1 jsp de maven web</h1>


<%= application.getAttribute("liste")%>

</body>
</html>