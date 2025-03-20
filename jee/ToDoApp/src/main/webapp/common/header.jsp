<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/23/24
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<header>
  <nav class="navbar navbar-expand-md navbar-dark"
       style="background-color: tomato">
    <div>
      <a href="<%= request.getContextPath() %>/login" class="navbar-brand"> Todo App</a>
    </div>

    <ul class="navbar-nav navbar-collapse justify-content-end">
      <li><a href="<%= request.getContextPath() %>/login" class="nav-link">Login</a></li>
      <li><a href="<%= request.getContextPath() %>/register" class="nav-link">Signup</a></li>
    </ul>
  </nav>
</header>
