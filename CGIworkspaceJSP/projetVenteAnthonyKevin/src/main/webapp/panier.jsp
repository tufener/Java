<%@page import="model.Article"%>
<%@page import="model.Client"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style1.css">
<title>Panier</title>
</head>
<body onload="set()">

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
				<li><a href="index2.jsp#articles">Cartes Mère</a></li>
				<li><a href="index2.jsp#about">Proceseurs</a></li>
				<li><a href="index2.jsp#services">Cartes graphique</a></li>
				<li><a href="index2.jsp#pricing">Ram</a></li>
				<li><a href="index2.jsp#contact">Alimentation</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="ServletDeconnexion"><span
						class="glyphicon glyphicon-user"></span> Se déconnecter</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<br>
	<br>
	<div class="container-fluid">
		<h1>Panier</h1>

		<br>
		<table class="table">
			<tr>
				<th>Quantité</th>
				<th>Image</th>
				<th>Nom</th>
				<th>Type</th>
				<th>Prix</th>
			</tr>
			<c:forEach var="unArticle" items="${sessionScope['panier']}">
				<tr>
					<td><c:out value="${unArticle.quantite}"></c:out></td>
					<td><img src="<c:out value="${unArticle.article.img}"></c:out>" style="width: 100px"></td>
					<td><c:out value="${unArticle.article.nom}"></c:out></td>
					<td><c:if test="${unArticle.article.type == 1}">
					Carte mère
					</c:if>
					<c:if test="${unArticle.article.type == 2}">
					Processeur
					</c:if>
					<c:if test="${unArticle.article.type == 3}">
					Carte graphique
					</c:if></td>
					<td><c:out value="${unArticle.article.prix}"></c:out>€</td>
				</tr>
			</c:forEach>
			<tr>
			<td style="border:2px groove #1c87c9;"> <input type"text" id='td' value="<c:out value="${sessionScope['total']}"></c:out>" hidden>Total : <c:out value="${sessionScope['total']}"></c:out>€<td>
			</tr>
		</table>
		<br> <br>
		<div class="container-fluid text-right">
			<form action="ServletCommande" method="post">
				<button id="boutton" type="submit" class="btn btn-outline-primary">Commander</button>
			</form>
		</div>
	</div>
	<script>
	function set() {
		if(document.getElementById('td').value == undefined || document.getElementById('td').value == 0 || document.getElementById('td').value == null) {
			document.getElementById('boutton').disabled = true;	
		}
	}
	
	</script>
</body>
</html>