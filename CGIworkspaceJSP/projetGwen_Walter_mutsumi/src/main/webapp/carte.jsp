<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
<head>
<%@ include file="bootstrap.jsp" %>
    <title>Commande</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="jumbotron text-center">
    <h1 class="display-4">LA CARTE</h1>
</div>
<div class="container">

    <div class="row row-cols-1 row-cols-md-3">
        <c:forEach var="article" items="${articles}">
            <div class="col mb-4">
            <div class="card h-100">
                <img src="${article.image}" class="card-img-top" alt="image of food">
                <div class="card-body">
                    <h5 class="card-title">
                        <c:out value="${article.nom}"/>
                    </h5>
                    <p class="card-text">
                        <c:out value="${article.description}"/>
                    </p>
                    <p class="card-text"><small class="text-muted">
                        Prix: <c:out value="${article.prix}€"/>
                    </small></p>
                </div>
            </div>
            </div>
        </c:forEach>
    </div>


</div>

</body>
</html>
