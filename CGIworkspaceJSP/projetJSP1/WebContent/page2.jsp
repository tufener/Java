<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Je suis page2 JSP</title>
</head>
<body>
<h1>Je suis page2 JSP</h1>
<%
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
String ageinput = (request.getParameter("age"));
int age = Integer.parseInt(ageinput);

String status;
if(age>=0 && age<=18)
	status = "mineur";
else if(age>18 && age<=120)
	status = "majeur";
else
	status = "erreur de saisie";


String reponse = "NOM: " + nom.toUpperCase() + " <br>" + "PRENOM: " + prenom.toLowerCase() + " <br>"  + "AGE: " + age + " <br>"  + "STATUS: " + status;
out.print(reponse);
%>
</body>
</html>