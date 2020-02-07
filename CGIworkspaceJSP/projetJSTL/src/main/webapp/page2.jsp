<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Personne"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page 2 JSP</title>
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
			<%
				String res = "";
				ArrayList<Personne> maliste = (ArrayList<Personne>) application.getAttribute("liste");
				for (Personne p : maliste) {
					res += "<tr>";
					res += "<td>" + p.getNom() + "</td>";
					res += "<td>" + p.getPrenom() + "</td></tr>";
				}
				out.print(res);
			%>
		</tbody>
	</table>



</body>
</html>