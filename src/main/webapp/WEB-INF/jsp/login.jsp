<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Responsive Login Form HTML CSS | CodingNepal</title>
    <link rel="stylesheet" href="../css/style.css" />
    <!-- Font Awesome CDN link for icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" />
</head>
<body>
<div class="wrapper">

    <h5 style="color: red">${msg}</h5>

    <div class="title"><span>Login Form</span></div>
    <%--@elvariable id="login" type=""--%>
    <form:form action="loginProcess" method="post" modelAttribute="login">
        <div class="row">
            <i class="fas fa-user"></i>
            <form:input path="login" name="login" type="text" placeholder="Email or Phone" />
        </div>
        <div class="row">
            <i class="fas fa-lock"></i>
            <form:input path="password" name="password" type="password" placeholder="Password" />
        </div>
        <div class="pass"><a href="#">Forgot password?</a></div>
        <div class="row button">
            <input type="submit" value="Login" />
        </div>
        <div class="signup-link">Not a member? <a href="#">Signup now</a></div>
    </form:form>
</div>
</body>
</html>
