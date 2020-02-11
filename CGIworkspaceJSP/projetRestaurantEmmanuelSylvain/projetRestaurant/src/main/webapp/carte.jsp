<%@page import="model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Carte</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>


footer {
	background-color: black;
	color: white;
	 position: absolute;
   left: 0; right: 0;
   margin-top: auto;
	padding-top: 15px;
	height: 90px;
}

</style>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style.css">

</head>
<body class="drapeau" >
	<div id="photo" class="row">

		<div id="bretagne" class="col-sm-2"></div>

		<div class="container text-center">

			<div class="col-lg-8"></div>
			<h1 style="font-family:Luminari, fantasy">
				<b>Breizh coop</b>
			</h1>
		</div>
		<div class="bretagne" class="col-sm-2"></div>
	</div>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header"></div>
		<ul class="nav navbar-nav">
			<li><a href="accueil.jsp">Accueil</a></li>
			<li class="active"><a href="#">Nos produits</a></li>

		</ul>
		<ul class="nav navbar-nav navbar-right">

			<li><a href="inscription.jsp"><span class="glyphicon glyphicon-user"></span>
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

	<br>
	<br>


	
		<div class="container text-center">
			<h1 style="color:green"><b>Nos produits</b></h1>
		</div>
	
	
	<div class="container-fluid bg-3 text-center">
	<div class="container">   
	<h2 style="color:brown">La terre</h2>
		<br> 
  <div class="row">
    <div class="col-sm-3">
      <div class="panel panel-success">
        <div class="panel-heading">Galette de sarasin</div>
        <div class="panel-body"><img src="images/galette.jpg" class="img-responsive"
					style="width: 70%; margin: auto" alt="Image"></div>
        <div class="panel-footer">7 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Crêpe de froment</div>
        <div class="panel-body"><img src="images/crepe.jpg" class="img-responsive"
					style="width: 60%; margin: auto" alt="Image"></div>
        <div class="panel-footer">5 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Caramel au beurre salé</div>
        <div class="panel-body"><img src="images/caramel.jpg" class="img-responsive"
					style="width: 50%; margin: auto" alt="Image"></div>
        <div class="panel-footer">3 euros</div>
      </div>
    </div>
   <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Palets bretons</div>
        <div class="panel-body"><img src="images/palets.jpg" class="img-responsive"
					style="width: 45%; margin: auto" alt="Image"></div>
        <div class="panel-footer">2 euros</div>
      </div>
    </div>
  </div>
</div>
</div><br>
	
	<div class="container-fluid bg-3 text-center">
	<div class="container">   
	<h2 style="color:blue">La Mer</h2>
		<br> 
  <div class="row">
    <div class="col-sm-3">
      <div class="panel panel-success">
        <div class="panel-heading">Huitres de Cancale</div>
        <div class="panel-body"><img src="images/huitre.jpg" class="img-responsive"
					style="width: 60%; margin: auto" alt="Image"></div>
        <div class="panel-footer">6 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Homard breton</div>
        <div class="panel-body"><img src="images/homard.jpg" class="img-responsive"
					style="width: 75%; margin: auto" alt="Image"></div>
        <div class="panel-footer">12 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Langoustines du Guilvinec</div>
        <div class="panel-body"><img src="images/langoustine.jpg" class="img-responsive"
					style="width: 75%; margin: auto" alt="Image"></div>
        <div class="panel-footer">10 euros</div>
      </div>
    </div>
   <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Etrilles</div>
        <div class="panel-body"><img src="images/etrille.jpg" class="img-responsive"
					style="width: 55%; margin: auto" alt="Image"></div>
        <div class="panel-footer">7 euros</div>
      </div>
    </div>
  </div>
</div>
</div><br>
	
		<div class="container-fluid bg-3 text-center">
	<div class="container">   
	<h2 style="color:orange">C'est à boire qu'il vous faut</h2>
		<br> 
  <div class="row">
    <div class="col-sm-3">
      <div class="panel panel-success">
        <div class="panel-heading">Jus de pomme bio</div>
        <div class="panel-body"><img src="images/jusdepomme.jpg" class="img-responsive"
					style="width: 50%; margin: auto" alt="Image"></div>
        <div class="panel-footer">2 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Bières artisanales</div>
        <div class="panel-body"><img src="images/bieres.jpg" class="img-responsive"
					style="width: 50%; margin: auto" alt="Image"></div>
        <div class="panel-footer">4 euros</div>
      </div>
    </div>
    <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Cidre artisanale</div>
        <div class="panel-body"><img src="images/cidre.jpg" class="img-responsive"
					style="width: 50%; margin: auto" alt="Image"></div>
        <div class="panel-footer">3 euros</div>
      </div>
    </div>
   <div class="col-sm-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">Lambig</div>
        <div class="panel-body"><img src="images/lambig.jpg" class="img-responsive"
					style="width: 26%; margin: auto" alt="Image"></div>
        <div class="panel-footer">8 euros</div>
      </div>
    </div>
  </div>
</div>
</div><br>
	

	<br>
	<br>

	<footer class="container-fluid text-center">
	<p>Adresse : 85 rue de la Bretagne 35000 Rennes, France. Téléphone
		: 02-23-23-26-14</p>

	<img src="images/linkedin.svg" style="width: 2%; heigth: 2%; fill: white"> <img src="images/facebook.svg"
		style="width: 2%; heigth: 2%;"> <img src="images/twitter.svg"
		style="width: 2%; heigth: 2%;"> 
	</footer>
</body>
</html>