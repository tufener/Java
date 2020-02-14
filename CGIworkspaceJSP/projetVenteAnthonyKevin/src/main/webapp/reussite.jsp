<%@page import="dao.DAOClient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="model.Client"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style1.css">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">Logo</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="#about">Cartes Mère</a></li>
				<li><a href="#services">Processeurs</a></li>
				<li><a href="#portfolio">Cartes graphique</a></li>
				<li><a href="#pricing">Ram</a></li>
				<li><a href="#contact">Alimentation</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-user"></span> Compte</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<br>
	<br><br>
	
	<%request.getAttribute("nw_client"); %>
	<p style="text-align: center"> Inscription réussite !</p>
	<%-- <p style="text-align: center">Bienvenue <%Client p= (Client)request.getAttribute("nw_client"); out.print(p.getPrenom() + " " + p.getNom());  %></p> --%>
	
	
</body>
</html>