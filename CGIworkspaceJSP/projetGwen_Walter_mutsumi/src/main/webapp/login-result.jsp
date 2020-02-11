<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Login result</title>
</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="jumbotron text-center">
        <h1 class="display-4">
            <c:if test="${empty client}">
                ERREUR
            </c:if>
            <c:if test="${not empty client}">
                SUCCES
            </c:if>
        </h1>
    </div>
    <div class="container">

        <div class="card align-items-center">
            <div class="card-body text-center">
                <c:if test="${empty client}">
                    Identifiant ou mot de passe incorrect.
                </c:if>

                <c:if test="${not empty client}">
                    <h2>Bienvenue
                        <c:out value="${client.prenom}" />
                        <c:out value="${client.nom}" /> <br>
                        Vous êtes désormais authentifié !</h2>
                    <i class="fas fa-check-circle fa-4x"></i>
                    <meta http-equiv="refresh" content="2; URL=ServletCarte">
                </c:if>
            </div>
        </div>


    </div>
</body>

</html>