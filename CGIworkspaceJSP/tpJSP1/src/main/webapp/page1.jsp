<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page 1 JSP TP</title>
</head>

<body>
<h1> Je suis page 1 JSP TP   </h1><br>
<h2>Entrez les informations</h2>

	<form action="Servlet1" method="post" target="_blank">
		Entrez l'Id: <input type="text" name="id"><br> 
		Entrez le nom: <input type="text" name="nom"><br>
		Entrez le prenom: <input type="text" name="prenom"><br>
		
	
	<input type="submit" value="VALIDER">
	
	</form>
	
</body>
</html>