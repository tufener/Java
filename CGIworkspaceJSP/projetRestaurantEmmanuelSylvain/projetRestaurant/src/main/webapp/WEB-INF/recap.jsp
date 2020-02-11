<%@page import="model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Recapitulatif</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<link rel="stylesheet" href="style.css">
<style>
footer {
	background-color: black;
	color: white;
	position: absolute;
	bottom: 0;
	left: 0;
	right: 0;
	width: 100%;
	padding-top: 15px;
	height: 90px;
}
</style>
</head>
<body class="drapeau">
	<div id="photo" class="row">

		<div id="bretagne" class="col-sm-2"></div>

		<div class="container text-center">

			<div class="col-lg-8"></div>
			<h1 style="font-family: luminari, fantasy">
				<b>Breizh coop</b>
			</h1>

		</div>
		<div class="col-sm-2"></div>
	</div>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header"></div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Accueil</a></li>
			<li><a href="carte.jsp">Nos produits</a></li>

		</ul>
		<ul class="nav navbar-nav navbar-right">

			<li><a href="inscription"><span class="glyphicon glyphicon-user"></span>
					Inscription</a></li>
			<%
				Client c2 = (Client) session.getAttribute("client");
				String rep2="<li><a href='login.jsp'><span class='glyphicon glyphicon-log-in'></span>Login</a></li>";
				if(c2 != null)
					rep2 = "<li><a href='logout'><span class='glyphicon glyphicon-log-out'></span>Logout</a></li>";
				out.print(rep2);	
				%>
				<%Client c = (Client) session.getAttribute("client");
					String rep="";
						if(c != null)
							rep = "<li><a href='panierS'><span class='glyphicon glyphicon-shopping-cart'></span> Panier</a></li>";
							out.print(rep);
				%>
		</ul>
	</div>
	</nav>
	

<div class="container text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
    <br><br><br><br>
     <form action="retourPanier">
		<input type="submit" class="btn btn-success" value="Retour au panier">
		</form>
    </div>
    <div class="col-sm-8 text-left"> 
      <h2 style="color:green" class="text-center"><b>Recapitulatif de votre commande</b></h2>
      
      <%
				ArrayList<LignePanier> panier = (ArrayList<LignePanier>) session.getAttribute("panier");
				String text = "";
				int total=0;
				if (panier.size() > 0){
					text += "<table class='table table-hover'><tr class='success'><th>Quantite</th><th>Article</th><th>Prix Total</th></tr>";
				for (int i = 0; i < panier.size(); i++) {
					text += "<tr class='success'><td>" + panier.get(i).getQuantite() + "</td>";
					text += "<td>" + panier.get(i).getArticle() + "</td>";
					text += "<td>" + panier.get(i).getPrixT() + "</td></tr>";
					total += panier.get(i).getPrixT();
				}
				text += "<tr class='success'><td></td><td><b>Totale Commande</b></td><td><b>" + total + "</b></td></tr>";
				text += "</table>";
				}
				out.print(text);
				%>
				<br><br>
      
      
    </div>
    <div class="col-sm-2 sidenav">
 <br><br><br><br>
      <form action="validationS">
		<input type="submit" class="btn btn-success" value="Valiation de la commande">
		
		</form>
    </div>
  </div>
</div>

	<footer class="container-fluid text-center">
	<p>Adresse : 85 rue de la Bretagne 35000 Rennes, France. Téléphone
		: 02-23-23-26-14</p>

	<img src="images/linkedin.svg" style="width: 2%; heigth: 2%; fill: white"> <img src="images/facebook.svg"
		style="width: 2%; heigth: 2%;"> <img src="images/twitter.svg"
		style="width: 2%; heigth: 2%;"> </footer>
</body>
</html>