<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste de départ</title>
</head>
<body>
<form:form action="" method="post" modelAttribute="u">
	<table>
		<tr> 
			<td><label> saisir nom: </label></td>
			<td><input name="nom" /></td>
		</tr>
		
		<tr> 
			<td><label> saisir prenom: </label></td>
			<td><input name="prenom" /></td>
		</tr>
		
		<tr> 
			<td> <button type="submit">envoyer</button> </td>
		</tr>
		
	</table>
</form:form>
	
	


</body>
</html>