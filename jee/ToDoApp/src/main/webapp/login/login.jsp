<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/23/24
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%@ include file="../common/header.jsp" %>

<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
  <h1>Login Form</h1>
  <form action="<%=request.getContextPath()%>/login" method="post">

    <div class="form-group">
      <label for="username">User Name:</label> <input type="text"
                                                   class="form-control" id="username" placeholder="User Name"
                                                   name="username" required>
    </div>

    <div class="form-group">
      <label for="password">Password:</label> <input type="password"
                                                  class="form-control" id="password" placeholder="Password"
                                                  name="password" required>
    </div>


    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<%@ include file="../common/footer.jsp" %>
</body>
</html>
