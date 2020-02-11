<%@page import="model.Panier"%>
<%@page import="model.Article"%>
<%@page import="java.util.ArrayList"%>
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
					<p class="breadcrumbs">
						<span class="mr-2"><a href="index.jsp">Home</a></span> <span>Cart</span>
					</p>
					<h1 class="mb-0 bread">My Cart</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section ftco-cart">
	<div class="container">
		<div class="row">
			<div class="col-md-12 ftco-animate">
				<div class="cart-list">
					<table class="table">
						<thead class="thead-primary">
							<tr class="text-center">
								<th>&nbsp;</th>
								<th>&nbsp;</th>
								<th>Product name</th>
								<th>Price</th>
								<th>Quantity</th>
								<th>Total</th>
								<th>&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						
						<%! Panier panier = null; %>
							<%
								ArrayList<Article> articles = new ArrayList<Article>();
								articles = (ArrayList<Article>) session.getAttribute("panier");
								if (articles != null) {
									panier = new Panier(articles);
									for (Article article : articles) {
							%>

							<tr class="text-center">
								<form method="post" action="ServletRemovePanier" id="product<%=article.getId()%>">
									<input name="idProduit" value="<%=article.getId()%>" hidden>

									<td class="product-remove"><a onclick="RemoveFruit()"
										style="cursor: pointer;"><span class="ion-ios-close"></span></a></td>
								</form>
								<script type="text/javascript">
									function RemoveFruit() {
										document.getElementById("product<%=article.getId()%>").submit();
									}
								</script>
								<td class="image-prod"><div class="img"
										style="background-image: url(images/<%=article.getDesc()%>.jpg);"></div></td>

								<td class="product-name">
									<h3>
										<%=article.getName()%>
									</h3>
									<p>
										<%=article.getDesc()%>
									</p>
								</td>

								<td class="price"><%=article.getPrice()%></td>

								<form method="post" action="ServletAddQuantity" id="quantity<%=article.getId()%>">
								<td class="quantity">
									<div class="input-group mb-3">
										<input name="quantity" type="number" class="quantity form-control input-number" placeholder="<%=article.getQuantity()%>">
										<input name="idQuantity" value="<%=article.getId()%>" hidden>

									</div>
								</td>

								<td class="total"><%=article.getTotalPrice()%></td>

								<td class="product-remove"><a onclick="SubmitQuantity()"
									style="cursor: pointer;"><span class="ion-ios-open"></span></a></td>
								</form>
								<script type="text/javascript">
									function SubmitQuantity() {
										document.getElementById("quantity<%=article.getId()%>").submit();
									}
								</script>

							</tr>
							<%
								}
								}
							%>

							<!-- END TR-->
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row justify-content-end">
			<div class="col-lg-4 mt-5 cart-wrap ftco-animate">
				<div class="cart-total mb-3">
					<h3>Coupon Code</h3>
					<p>Enter your coupon code if you have one</p>
					<form action="#" class="info">
						<div class="form-group">
							<label for="">Coupon code</label> <input type="text"
								class="form-control text-left px-3" placeholder="">
						</div>
					</form>
				</div>
				<p>
					<a href="checkout.jsp" class="btn btn-primary py-3 px-4">Apply
						Coupon</a>
				</p>
			</div>


			<div class="col-lg-4 mt-5 cart-wrap ftco-animate">
				<div class="cart-total mb-3">
					<h3>Cart Totals</h3>
					<p class="d-flex">
						<span>Discount</span> <span>$0.00</span>
					</p>
					<hr>
					<p class="d-flex total-price">
					<% if (panier != null) { %>
						<span>Total</span> $<%= panier.getPriceTotal() %>
						<% } %>
					</p>
				</div>
				<p>
					<a href="checkout.jsp" class="btn btn-primary py-3 px-4">Proceed
						to Checkout</a>
				</p>
			</div>
		</div>
	</div>
	</section>

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

	<script>
		$(document).ready(function() {

			var quantitiy = 0;
			$('.quantity-right-plus').click(function(e) {

				// Stop acting like a button
				e.preventDefault();
				// Get the field name
				var quantity = parseInt($('#quantity').val());

				// If is not undefined

				$('#quantity').val(quantity + 1);

				// Increment

			});

			$('.quantity-left-minus').click(function(e) {
				// Stop acting like a button
				e.preventDefault();
				// Get the field name
				var quantity = parseInt($('#quantity').val());

				// If is not undefined

				// Increment
				if (quantity > 0) {
					$('#quantity').val(quantity - 1);
				}
			});

		});
	</script>

</body>
</html>