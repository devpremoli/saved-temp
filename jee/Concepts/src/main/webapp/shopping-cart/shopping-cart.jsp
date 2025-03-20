<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/28/24
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>

<form action="shopping-cart" method="post">
  <div>
    <label for="item">Item:</label>
    <input type="text" id="item" name="item" required>
  </div>
  <div>
    <button type="submit" name="action" value="add">Add Item</button>
    <button type="submit" name="action" value="remove">Remove Item</button>
    <button type="submit" name="action" value="clear" formnovalidate>Clear Cart</button>
  </div>
</form>

<h2>Current Cart:</h2>
<ul>
  <c:forEach var="item" items="${sessionScope.shoppingCart.items}">
    <li>${item}</li>
  </c:forEach>
</ul>
</body>
</html>
