<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des personnes</title>
</head>
<body>
<h1>Liste des personnes ${liste} </h1>


<table>
    <thead>
        <tr>
            <th>id</th>
           <th>Nom</th>
           <th>Prenom</th>
           <th>Age</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${liste.id} </td>
            <td>${liste.nom}</td>
           <td>${liste.prenom}</td>
           <td>${liste.age}</td>
        </tr>
    </tbody>
</table>

</body>
</html>