<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page JSP</title>
</head>
<body>
	<h1>Je suis page JSP</h1>

	<form action="page2.jsp?x=y&a=b&c=d" method="post" target="_blank">
		Entrez le nom: <input type="text" name="nom"><br> 
		Entrez le prenom: <input type="text" name="prenom"><br>
		Entrez l'age: <input type="text" name="age"><br>
		
	
	<input type="submit" value="VALIDER">
	
	</form>
</body>
</html>