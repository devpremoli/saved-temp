<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index JSP</title>
</head>
<body>

<h1>Add</h1>
<h2>Things involved</h2>
<p> index.jsp, AddServlet.java</p>

<%--<form action="${pageContext.request.contextPath}/my-add" method="get">--%>
<%--<form action="my-add" method="get">--%>
<form action="add" method="post">
    <div>
        <label for="num1">Enter 1st Number:</label>
        <input type="number" name="num1" id="num1">
    </div>
    <div>
        <label for="num2">Enter 2nd Number: </label>
        <input type="number" name="num2" id="num2">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

<h1>Square Using Request Dispatcher</h1>
<h2>Things involved</h2>
<p>index.jsp, AddServletHelper.java, SquareServlet.java</p>
<form action="add-helper" method="post">
    <div>
        <label for="numA">Enter 1st Number:</label>
        <input type="number" name="numA" id="numA">
    </div>
    <div>
        <label for="numB">Enter 2nd Number: </label>
        <input type="number" name="numB" id="numB">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

<h1>Square Using Send Redirect; URL Rewriting</h1>
<h2>Things involved</h2>
<p>index.jsp, HelperAddServlet.java, SqServlet.java</p>
<form action="helper-add" method="post">
    <div>
        <label for="numC">Enter 1st Number:</label>
        <input type="number" name="numC" id="numC">
    </div>
    <div>
        <label for="numD">Enter 2nd Number: </label>
        <input type="number" name="numD" id="numD">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

<h1>Square Using Send Redirect; URL Rewriting</h1>
<h2>Things involved</h2>
<p>HelpAddServlet.java, SqServlet.java</p>
<form action="help-add" method="post">
    <div>
        <label for="numE">Enter 1st Number:</label>
        <input type="number" name="numE" id="numE">
    </div>
    <div>
        <label for="numF">Enter 2nd Number: </label>
        <input type="number" name="numF" id="numF">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>