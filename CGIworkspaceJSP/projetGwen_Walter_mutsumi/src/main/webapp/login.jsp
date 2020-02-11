<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>

<head>
    <%@ include file="bootstrap.jsp" %>
    <title>Login page</title>

</head>

<body>
    <%@ include file="nav.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col">
            </div>
            <div class="col">
                
                    <h1 style="margin-top: 30px;">Login</h1>
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <form action="ServletLogin" method="POST">
                            <div class="form-group">
                                <label for="id">Identifiant</label>
                                <input type="number" class="form-control" name="id" id="id">
                            </div>
                            <div class="form-group">
                                <label for="mdp">Mot de passe</label>
                                <input type="password" class="form-control" name="password" id="mdp">
                            </div>
                            <button type="submit" class="btn btn-dark btn-block">Login</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col">

            </div>
        </div>

    </div>
</body>

</html>
