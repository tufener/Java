

<%@page import="java.util.ArrayList"%>
<%@page import="model.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page 1 JSP</title>
</head>
<body>
<h1>Je suis page 1 JSP</h1>
<%=
session.getAttribute("liste")
%>

<% ArrayList<Personne> maliste = (ArrayList<Personne>) session.getAttribute("liste"); 

%>

</body>
</html>