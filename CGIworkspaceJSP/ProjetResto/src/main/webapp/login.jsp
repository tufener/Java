<%@page import="model.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>FDP - Food De Paris</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/aos.css">
<link rel="stylesheet" href="css/ionicons.min.css">
<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">
<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/icomoon.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body class="goto-here">

	<nav
		class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
		id="ftco-navbar">
	<div class="container">
		<a class="navbar-brand" href="index.jsp">FDP - Food De Paris</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#ftco-nav" aria-controls="ftco-nav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="oi oi-menu"></span> Menu
		</button>

		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a href="index.jsp"
					class="nav-link">Home</a></li>
				<li class="nav-item active"><a href="login.jsp"
					class="nav-link">Login</a></li>

				<li class="nav-item cta cta-colored"><a href="cart.jsp"
					class="nav-link"><span class="icon-shopping_cart"></span>[<%
					int num = (int) application.getAttribute("numberArticle");
					out.print(num);
				%>]</a></li>

			</ul>
		</div>
	</div>
	</nav>
	<!-- END nav -->


	<c:if test="${Auth == null}">
		<div class="hero-wrap hero-bread"
			style="background-image: url('images/bg_1.jpg');">
			<div class="container">
				<div
					class="row no-gutters slider-text align-items-center justify-content-center">
					<div class="col-md-9 ftco-animate text-center">
						<h1 class="mb-0 bread green">Login</h1>
					</div>
				</div>
			</div>

			<section class="ftco-section contact-section">
			<div class="container">


				<div class="row block-9">
					<div class="col-md-3 order-md-last d-flex empty"></div>
					<div class="col-md-6 order-md-last d-flex">

						<form action="ServletAuthentification" method="post"
							class="bg-white p-5 contact-form">
							<div class="form-group">
								<input type="number" class="form-control" placeholder="Your ID"
									name="id" required>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Your Name"
									name="nom" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control"
									placeholder="Password" name="password" required>
							</div>
							<div class="form-group">
								<input type="submit" value="Se Connecter"
									class="btn btn-primary py-3 px-5"> <a
									href="inscription.jsp" class="link-inscription"> Pas de
									compte ?</a>
							</div>
							<p class="error">
								<%
									String error = (String) request.getAttribute("error");
										if (error != null && !error.isEmpty())
											out.print(error);
								%>
							</p>
						</form>

					</div>
				</div>
			</div>
			</section>
		</div>
	</c:if>

	<c:if test="${Auth != null}">

		<div class="hero-wrap hero-bread"
			style="background-image: url('images/bg_1.jpg');">

			<section class="ftco-section contact-section">
			<div class="container">


				<div class="row block-9">
					<div class="col-md-2 order-md-last d-flex empty"></div>
					<div class="col-md-8 order-md-last d-flex bg-white">
						<img alt="user" src="images/user.png" width="180" height="180">
						<form action="ServletLogout" method="post"
							class="bg-white p-4 contact-form">

							<h3>Connect� en tant que :</h3>
							<p>
								Pr�nom:
								<c:out value="${ Auth.prenom }" />
							</p>
							<p>
								Nom:
								<c:out value="${ Auth.nom }" />
							</p>
							<p>
								ID:
								<c:out value="${ Auth.id }" />
							</p>
							<p>
								Adresse:
								<c:out value="${ Auth.addresse }" />
							</p>
							<input type="submit" value="Se D�connecter"
								class="btn btn-primary float-right">
						</form>
					</div>
				</div>
			</div>
			</section>
		</div>
	</c:if>

	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px"> <circle
			class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4"
			stroke="#eeeeee" /> <circle class="path" cx="24" cy="24" r="22"
			fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg>
	</div>


	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/aos.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/scrollax.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>