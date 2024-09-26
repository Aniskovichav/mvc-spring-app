<
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
<c:if test="${not empty cars}">
<table border="1">
    <tr>
        <th>ID</th>
        <th>MODEL</th>
        <th>PRICE</th>
        <th>UPDATE</th>
        <th>DELETE</th>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id}</td>
            <td>${car.model}</td>
            <td>${car.price}</td>
            <td><a href='update_car?id=${car.id}'>UPDATE</a></td>
            <td><a href='delete_car?id=${car.id}'>DELETE</a></td>
        </tr>
    </c:forEach>
</table>
</c:if>
<a href='create_car'>CREATE</a>
</body>
</html>