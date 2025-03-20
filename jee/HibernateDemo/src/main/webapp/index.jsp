<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Hibernate Demo</h1>

<form action="users" method="post">
    <div>
        <label for="name">Enter name: </label>
        <input type="text" id="name" name="name">
    </div>
    <div>
        <label for="email">Enter Email: </label>
        <input type="email" id="email" name="email">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>