<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>User List</h1>
<ul>
    <c:forEach var="user" items="${userList}">
        <li>${user}</li>
    </c:forEach>
</ul>
</body>
</html>