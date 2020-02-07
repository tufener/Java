<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page1</title>
</head>
<body>
<form action="Servlet1" method="post">
  <div class="form-example">
    <label for="name">Enter your nom: </label>
    <input type="text" name="nom" required>
  </div>
  <div class="form-example">
    <label for="email">Enter your prenom: </label>
    <input type="text" name="prenom" required>
  </div>
    <div class="form-example">
    <label for="age">Enter your id: </label>
    <input type="number" name="id" required style="width: 257px; height: 125px">
  </div>
  <div class="form-example">
    <input type="submit" value="Submit" style="width: 239px; ">
  </div> 
</form>

</body>
</html>