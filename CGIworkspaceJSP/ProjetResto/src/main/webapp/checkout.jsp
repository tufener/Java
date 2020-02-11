<%@page import="java.util.ArrayList"%>
<%@page import="model.Panier"%>
<%@page import="model.Client"%>
<%@page import="model.Article"%>
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
					class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li>

			</ul>
		</div>
	</div>
	</nav>
	<!-- END nav -->



	<div class="hero-wrap hero-bread"
		style="background-image: url('images/bg_1.jpg');">
		<div class="container">
			<div
				class="row no-gutters slider-text align-items-center justify-content-center">
				<div class="col-md-9 ftco-animate text-center">
					<h1 class="mb-0 bread green">Merci pour votre achat !</h1>
				</div>
			</div>
			<section class="ftco-section contact-section">
			<div class="container" style="background: white;">

				<div class="cart-list" style="overflow: hidden;">
					<table class="table">
						<thead class="thead-primary">
							<tr class="text-center">
								<th>Product name</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
							</tr>
						</thead>
						<tbody>

							<%!Panier panier = null;%>
							<%
								ArrayList<Article> articles = new ArrayList<Article>();
								articles = null;
								articles = (ArrayList<Article>) session.getAttribute("panier");
								if (articles != null) {
									panier = new Panier(articles);
									for (Article article : articles) {
							%>

							<tr class="text-center">
								<td class="product-name">
									<h3>
										<%=article.getName()%>
									</h3>
								</td>

								<td class="price"><%=article.getPrice()%></td>

								<td class="price"><%=article.getQuantity()%></td>

								<td class="total"><%=article.getTotalPrice()%></td>

							</tr>
							<%
								}
								}
							%>

							<!-- END TR-->
						</tbody>
					</table>

				</div>
				<div class="row">
					<div class="col-6">
						<img alt="user" src="images/achat.png" width="180" height="180">
					</div>

					<div class="col-6">
						<%
							if (panier != null) {
						%>
						<h3 style="float: right; margin-right: 30px;">
							$<%=panier.getPriceTotal()%>
						</h3>
						<h3 style="float: right; margin-right: 10px;">Total :</h3>
					
						<%
							}
						%>
						</div>
						<form action="ServletPaid" method="post">
						<div class="col-12" ><input value="<%=panier.getPriceTotal()%>" name="total" hidden>
						<button type="submit" class="btn btn-primary py-3 px-4" style="float:right;margin:10px;" >Valider Commande</button>
					</div>
					</form>
				</div>

			</div>
			</section>
		</div>

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