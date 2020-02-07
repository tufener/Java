<%@page import="model.Personne"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Je suis page 2 JSP</h1>


	<table>
		<thead>
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="unePersonne" items="$(liste)">
    <tr>
					<td><c:out value="$(unePersonne.nom)" /></td>
					<td><c:out value="$(unePersonne.prenom)" /></td>


	</tr>
			</c:forEach>


		</tbody>
	</table>



</body>
</html>