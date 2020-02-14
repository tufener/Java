<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%
	ArrayList<Article> liste = new ArrayList<Article>();
	ServletContext context = getServletContext();
	liste = (ArrayList<Article>) context.getAttribute("listeArticle");
%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Theme Company Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">

	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
	
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
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-user"></span> Compte</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- <div class="jumbotron text-center">
		<h1>CybINF</h1>
		<p>Matériel informatique</p>
		<form>
			<div class="input-group">
				<input type="email" class="form-control" size="50"
					placeholder="Adresse Email" required>
				<div class="input-group-btn">
					<button type="button" class="btn btn-danger">Subscribe</button>
				</div>
			</div>
		</form>
	</div> -->

	<div id="articles" class="container-fluid text-center">
		<h3>Cartes M&egrave;re</h3>
		<br>
		<div class="container-fluid bg-light">
			<div class="row">
				<c:forEach var="article" items="${applicationScope['listeArticle']}">
					<c:if test="${article.type == 1}">
						<div class="col-sm-4">
							<div class="card" style="width: 45rem; height: 50rem">
								<img src="<c:url value="${article.img}"/>" class="card-img-top"
									style="width: 300px; height: 300px;">
								<div class="card-body">
									<input type="text" name="id"
										value="<c:out value="${article.id}" />" hidden>
									<h5 class="card-title" style="color: black; font-size: 18px">
										<c:out value="${article.nom}" />
									</h5>
									<p class="card-text" style="font-size: 13px">
										<c:out value="${article.description}" />
									</p>
									<p style="color: green; font-size: 23px">
										<c:out value="${article.prix}" />
										&euro;
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>
	
	<div id="about" class="container-fluid text-center">
		<h3>Processeurs</h3>
		<br>
		<div class="container-fluid bg-light">
			<div class="row">
				<c:forEach var="article" items="${applicationScope['listeArticle']}">
					<c:if test="${article.type == 2}">
						<div class="col-sm-4">
							<div class="card" style="width: 45rem; height: 50rem">
								<img src="<c:url value="${article.img}"/>" class="card-img-top"
									style="width: 300px; height: 300px;">
								<div class="card-body">
									<input type="text" name="id"
										value="<c:out value="${article.id}" />" hidden>
									<h5 class="card-title" style="color: black; font-size: 18px">
										<c:out value="${article.nom}" />
									</h5>
									<p class="card-text" style="font-size: 13px">
										<c:out value="${article.description}" />
									</p>
									<p style="color: green; font-size: 23px"">
										<c:out value="${article.prix}" />
										&euro;
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>
	
	<div id="services" class="container-fluid text-center">
		<h3>Cartes graphique</h3>
		<br>
		<div class="container-fluid bg-light">
			<div class="row">
				<c:forEach var="article" items="${applicationScope['listeArticle']}">
					<c:if test="${article.type == 3}">
						<div class="col-sm-4">
							<div class="card" style="width: 45rem; height: 50rem">
								<img src="<c:url value="${article.img}"/>" class="card-img-top"
									style="width: 300px; height: 300px;">
								<div class="card-body">
									<input type="text" name="id"
										value="<c:out value="${article.id}" />" hidden>
									<h5 class="card-title" style="color: black; font-size: 18px">
										<c:out value="${article.nom}" />
									</h5>
									<p class="card-text" style="font-size: 13px">
										<c:out value="${article.description}" />
									</p>
									<p style="color: green; font-size: 23px"">
										<c:out value="${article.prix}" />
										&euro;
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>

	<div id="portfolio" class="container-fluid text-center">
		<h3>Ram</h3>
		<br>
		<div class="container-fluid bg-light">
			<div class="row">
				<c:forEach var="article" items="${applicationScope['listeArticle']}">
					<c:if test="${article.type == 4}">
						<div class="col-sm-4">
							<div class="card" style="width: 45rem; height: 50rem">
								<img src="<c:url value="${article.img}"/>" class="card-img-top"
									style="width: 300px; height: 300px;">
								<div class="card-body">
									<input type="text" name="id"
										value="<c:out value="${article.id}" />" hidden>
									<h5 class="card-title" style="color: black; font-size: 18px">
										<c:out value="${article.nom}" />
									</h5>
									<p class="card-text" style="font-size: 13px">
										<c:out value="${article.description}" />
									</p>
									<p style="color: green; font-size: 23px">
										<c:out value="${article.prix}" />
										&euro;
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>
	
	<div id="pricing" class="container-fluid text-center">
		<h3>Alimentation</h3>
		<br>
		<div class="container-fluid bg-light">
			<div class="row">
				<c:forEach var="article" items="${applicationScope['listeArticle']}">
					<c:if test="${article.type == 5}">
						<div class="col-sm-4">
							<div class="card" style="width: 45rem; height: 50rem">
								<img src="<c:url value="${article.img}"/>" class="card-img-top"
									style="width: 300px; height: 300px;">
								<div class="card-body">
									<input type="text" name="id"
										value="<c:out value="${article.id}" />" hidden>
									<h5 class="card-title" style="color: black; font-size: 18px">
										<c:out value="${article.nom}" />
									</h5>
									<p class="card-text" style="font-size: 13px">
										<c:out value="${article.description}" />
									</p>
									<p style="color: green; font-size: 23px">
										<c:out value="${article.prix}" />
										&euro;
									</p>
								</div>
							</div>
						</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>
	
	<script>
		$(document).ready(
				function() {
					// Add smooth scrolling to all links in navbar + footer link
					$(".navbar a, footer a[href='#myPage']").on('click',
							function(event) {
								// Make sure this.hash has a value before overriding default behavior
								if (this.hash !== "") {
									// Prevent default anchor click behavior
									event.preventDefault();

									// Store hash
									var hash = this.hash;

									// Using jQuery's animate() method to add smooth page scroll
									// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
									$('html, body').animate({
										scrollTop : $(hash).offset().top
									}, 900, function() {

										// Add hash (#) to URL when done scrolling (default click behavior)
										window.location.hash = hash;
									});
								} // End if
							});

					$(window).scroll(function() {
						$(".slideanim").each(function() {
							var pos = $(this).offset().top;

							var winTop = $(window).scrollTop();
							if (pos < winTop + 600) {
								$(this).addClass("slide");
							}
						});
					});
				})
	</script>
</body>
</html>