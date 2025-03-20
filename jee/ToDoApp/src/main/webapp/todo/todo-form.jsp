<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/23/24
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title>User Management Application</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<header>
  <nav class="navbar navbar-expand-md navbar-dark"
       style="background-color: tomato">
    <div>
      <a href="https://www.javaguides.net" class="navbar-brand"> Todo
        App</a>
    </div>

    <ul class="navbar-nav">
      <li><a href="<%=request.getContextPath()%>/list"
             class="nav-link">Todos</a></li>
    </ul>

    <ul class="navbar-nav navbar-collapse justify-content-end">
      <li><a href="<%=request.getContextPath()%>/logout"
             class="nav-link">Logout</a></li>
    </ul>
  </nav>
</header>
<div class="container col-md-5">
  <div class="card">
    <div class="card-body">
      <c:if test="${todo != null}">
      <form action="update" method="post">
        </c:if>
        <c:if test="${todo == null}">
        <form action="insert" method="post">
          </c:if>

          <caption>
            <h2>
              <c:if test="${todo != null}">
                Edit Todo
              </c:if>
              <c:if test="${todo == null}">
                Add New Todo
              </c:if>
            </h2>
          </caption>

          <c:if test="${todo != null}">
            <input type="hidden" name="id" value="<c:out value='${todo.id}' />" />
          </c:if>

          <fieldset class="form-group">
            <label>Todo Title</label> <input type="text"
                                             value="<c:out value='${todo.title}' />" class="form-control"
                                             name="title" required="required" minlength="5">
          </fieldset>

          <fieldset class="form-group">
            <label>Todo Decription</label> <input type="text"
                                                  value="<c:out value='${todo.description}' />" class="form-control"
                                                  name="description" minlength="5">
          </fieldset>

          <fieldset class="form-group">
            <label>Todo Status</label> <select class="form-control"
                                               name="isDone">
            <option value="false">In Progress</option>
            <option value="true">Complete</option>
          </select>
          </fieldset>

          <fieldset class="form-group">
            <label>Todo Target Date</label> <input type="date"
                                                   value="<c:out value='${todo.targetDate}' />" class="form-control"
                                                   name="targetDate" required="required">
          </fieldset>

          <button type="submit" class="btn btn-success">Save</button>
        </form>
    </div>
  </div>
</div>

<%@ include file="../common/footer.jsp" %>
</body>
</html>
