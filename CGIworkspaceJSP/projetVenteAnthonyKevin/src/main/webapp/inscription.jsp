<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Inscription</title>
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
			<a class="navbar-brand" href="index.jsp">Accueil</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			
			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-user"></span> Compte</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<p style="font-size:18px; color:red">
	<%
	String mes2 = (String) request.getAttribute("echec");
	if (mes2 != null)
		out.print(mes2);
	%>
	</p>
	<div class="container-fluid text-center" style="background-color: whitesmoke;">
		<h1 style="color: #5648AE; font-family: cursive;">Inscription</h1>
		<div class="row justify-content-md-center">
			<br> <br>
			
				<form action="ServletInscription" method="post">
					<div class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-user"></i></span> <input id="id"
							type="number" class="form-control" name="id"
							placeholder="Identifiant" min="1" required>
					</div>
			<br>
			
				<div class="input-group">
					<span class="input-group-addon"><i
						class="glyphicon glyphicon-user"></i></span> <input id="prenom"
						type="text" class="form-control" name="prenom"
						placeholder="Prénom" required>
				</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-user"></i></span> <input id="nom" type="text"
					class="form-control" name="nom" placeholder="Nom" required>
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-user"></i></span> <input id="adresse"
					type="text" class="form-control" name="adresse"
					placeholder="Adresse" required>
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-lock"></i></span> <input id="password"
					type="password" class="form-control" name="password"
					placeholder="Password" required>
			</div>
			<br>
			<div class="input-group">

				<span>
					<button type="submit">Valider</button>
				</span>
			</div>

			</form>
		</div>
	</div>

</body>
</html>