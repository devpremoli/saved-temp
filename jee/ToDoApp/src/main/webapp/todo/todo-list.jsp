<%--
  Created by IntelliJ IDEA.
  User: devpremoli
  Date: 12/23/24
  Time: 11:06 PM
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

<div class="row">
  <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

  <div class="container">
    <h3 class="text-center">List of Todos</h3>
    <hr>
    <div class="container text-left">

      <a href="<%=request.getContextPath()%>/new"
         class="btn btn-success">Add Todo</a>
    </div>
    <br>
    <table class="table table-bordered">
      <thead>
      <tr>
        <th>Title</th>
        <th>Target Date</th>
        <th>Todo Status</th>
        <th>Actions</th>
      </tr>
      </thead>
      <tbody>
      <!--   for (Todo todo: todos) {  -->
      <c:forEach var="todo" items="${listTodo}">

        <tr>
          <td><c:out value="${todo.title}" /></td>
          <td><c:out value="${todo.targetDate}" /></td>
          <td><c:out value="${todo.status}" /></td>

          <td><a href="edit?id=<c:out value='${todo.id}' />">Edit</a>
            &nbsp;&nbsp;&nbsp;&nbsp; <a
                    href="delete?id=<c:out value='${todo.id}' />">Delete</a></td>

          <!--  <td><button (click)="updateTodo(todo.id)" class="btn btn-success">Update</button>
                    <button (click)="deleteTodo(todo.id)" class="btn btn-warning">Delete</button></td> -->
        </tr>
      </c:forEach>
      <!-- } -->
      </tbody>

    </table>
  </div>
</div>

<%@ include file="../common/footer.jsp" %>
</body>
</html>
