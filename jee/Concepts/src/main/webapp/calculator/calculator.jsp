<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/28/24
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Welcome to Calculator jsp</h1>

<form action="calculator" method="post">
  <div>
    <label for="num1">Enter First Number: </label>
    <input type="number" id="num1" name="num1">
  </div>
  <div>
    <label for="num2">Enter First Number: </label>
    <input type="number" id="num2" name="num2">
  </div>
  <div>
    <button type="submit">Submit</button>
  </div>
</form>
</body>
</html>
