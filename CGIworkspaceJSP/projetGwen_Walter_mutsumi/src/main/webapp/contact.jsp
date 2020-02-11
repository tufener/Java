<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
<head>
<%@ include file="bootstrap.jsp" %>
    <title>Contact</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<body>
<div class="jumbotron text-center">
    <h1 class="display-4">CONTACT</h1>
</div>
<div class="container">

    <form>
        <div class="form-group">
            <input type="text" class="form-control" name="name" required="" placeholder="Nom" >
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" required="" placeholder="Email" >
        </div>
        <div class="form-group">
            <input type="tel" class="form-control" name="phone" placeholder="Telephone" >
        </div>
        <div class="form-group">
            <textarea class="form-control" name="message" placeholder="Message" rows="7" ></textarea>
        </div>
        <div>
            <button type="submit" class="btn btn-lg btn-dark">CONTACT US</button>
        </div>
    </form>

</div>


</body>
</html>
