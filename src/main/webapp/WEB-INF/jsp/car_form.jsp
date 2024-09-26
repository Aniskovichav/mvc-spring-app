<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Form</title>
    <link rel="stylesheet" href="../css/style.css" />
</head>
<body>
<%--@elvariable id="car" type="org.example.model.Car"--%>
<form:form action="create_car" method="post" modelAttribute="car">
  <div class="row">
    <i class="fas fa-user"></i>
    <form:input path="id" name="id" type="number" placeholder="Car ID" />
  </div>
  <div class="row">
    <i class="fas fa-lock"></i>
    <form:input path="model" name="model" type="text" placeholder="Model" />
  </div>
  <div class="row">
    <i class="fas fa-lock"></i>
    <form:input path="price" name="price" type="number" placeholder="Price" />
  </div>
  <div class="row button">
    <input type="submit" value="Submit" />
  </div>
  <div class="signup-link">Not a member? <a href="#">Signup now</a></div>
</form:form>
</body>
</html>
