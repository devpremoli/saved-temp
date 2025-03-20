<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/23/24
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<%@ include file="../common/header.jsp" %>

<div class="container">

    <h2>User Register Form</h2>
    <div class="col-md-6 col-md-offset-3">
        <div class="alert alert-success center" role="alert">
            <p>${NOTIFICATION}</p>
        </div>

        <form action="<%=request.getContextPath()%>/register" method="post">

            <div class="form-group">
                <label for="fname">First Name:</label> <input type="text"
                                                              class="form-control" id="fname" placeholder="First Name"
                                                              name="firstName" required>
            </div>

            <div class="form-group">
                <label for="lname">Last Name:</label> <input type="text"
                                                             class="form-control" id="lname" placeholder="last Name"
                                                             name="lastName" required>
            </div>

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
</div>

<%@ include file="../common/footer.jsp" %>

</body>
</html>
