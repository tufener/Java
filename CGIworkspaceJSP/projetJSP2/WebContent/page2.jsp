<%@page import="model.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page 2 JSP</title>
</head>
<body>
Je suis page 2  JSP <br>

<%
//Object o = request.getAttribute("p");
Personne p = (Personne)request.getAttribute("p");
out.print(p.getPrenom());
//out.print(o.toString());
%>
</body>
</html>