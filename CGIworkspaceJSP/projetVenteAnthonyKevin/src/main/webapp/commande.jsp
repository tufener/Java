<%@page import="model.Article"%>
<%@page import="model.Ligne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
				<a class="navbar-brand" href="index2.jsp">Accueil<!-- <img alt="logo" src="images/InfoMat.png"> --></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-left">

					<li><a href="#articles">Cartes M&egrave;re</a></li>
					<li><a href="#about">Processeurs</a></li>
					<li><a href="#services">Cartes graphique</a></li>
					<li><a href="#portfolio">Ram</a></li>
					<li><a href="#pricing">Alimentation</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="ServletDeconnexion"><span
							class="glyphicon glyphicon-user"></span> Compte</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid text-center">
		<h1 style="color: blue">Votre commande est validée !</h1>

		<h2> Merci !
		</h2>
	</div>
</body>
</html>