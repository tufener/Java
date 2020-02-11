<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>

<head>
	<%@ include file="bootstrap.jsp" %>
	<title>Inscription</title>
</head>

<body>
	<%@ include file="nav.jsp" %>
		<div class="container">
			<div class="row">
				<div class="col">
				</div>
				<div class="col">
					
						<h1 style="margin-top: 30px;">Inscription</h1>
					<div class="card" style="width: 18rem;">
						<div class="card-body">
							<form action="ServletInscription" method="POST">
								<div class="form-group">
									<label for="id">Id</label>
									<input type="number" id="Id" name="Id"class="form-control">
								</div>
								<div class="form-group">
									<label for="id">Password</label>
									<input type="password" id="Password" name="Password" class="form-control">
								</div>
								<div class="form-group">
									<label for="id">Nom</label>
									<input type="text" id="Nom" name="Nom" class="form-control">
								</div>
								<div class="form-group">
									<label for="id">Prenom</label>
									<input type="text" id="Prenom" name="Prenom" class="form-control">
								</div>
								<div class="form-group">
									<label for="mdp">Adresse</label>
									<input type="text" class="form-control" name="password" id="mdp">
								</div>
								<button type="submit" class="btn btn-dark btn-block">Inscription</button>
							</form>
						</div>
					</div>
				</div>
				<div class="col">
	
				</div>
			</div>
	</form>
	<c:if test="${reponse==true}">
		<h2>
			<c:if test="${valide==false }">
				id déjà enregistré !!
			</c:if>
			<c:if test="${valide==true }">
				Profil enregistré.
				<meta http-equiv="refresh" content="2; URL=ServletLogin">
			</c:if>
		</h2>
	</c:if>


</body>

</html>