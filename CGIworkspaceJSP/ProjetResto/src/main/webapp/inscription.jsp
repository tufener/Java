<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<nav class="navbar navbar-expand-lg navbar-dark ftco-navbar-light"
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
					class="nav-link"><span class="icon-shopping_cart"></span>[<% int num = (int) application.getAttribute("numberArticle"); 
					out.print(num); %>]</a></li>

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
					<h1 class="mb-0 bread green">Inscription</h1>
				</div>
			</div>
		</div>

		<section class="ftco-section contact-section">
		<div class="container">


			<div class="row block-9">
				<div class="col-md-3 order-md-last d-flex empty"></div>
				<div class="col-md-6 order-md-last d-flex">
					<form action="ServletRegister" method="post"
						class="bg-white p-5 contact-form">
						<div class="form-group">
							<input type="text" class="form-control" name="nom"
								placeholder="Your Name" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Your Surname" name="prenom" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control"
								placeholder="Password" name="password" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="addresse"
								placeholder="Address" required>
						</div>
						<div class="form-group">
							<input type="submit" value="Inscription"
								class="btn btn-primary py-3 px-5"><a href="login.jsp"
								class="link-inscription"> Déjà inscrit ?</a>
						</div>
						<p class="error"><%
							String error = (String) request.getAttribute("error");
							if (error != null && !error.isEmpty())
								out.print(error);
						%></p>
					</form>
				</div>
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