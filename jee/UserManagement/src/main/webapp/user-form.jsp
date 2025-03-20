<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>User Management Application</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
      crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: blue">
        <div>
            <a href="https://www.xadmin.net" class="navbar-brand">User Management Application</a>
        </div>
        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <form action="<c:choose>
                            <c:when test='${user != null}'>update</c:when>
                            <c:otherwise>insert</c:otherwise>
                          </c:choose>" method="post">
                <h2>
                    <c:if test="${user != null}">Edit User</c:if>
                    <c:if test="${user == null}">Add New User</c:if>
                </h2>

                <c:if test="${user != null}">
                    <input type="hidden" name="id" value="${user.id}" />
                </c:if>

                <fieldset class="form-group">
                    <label>User Name</label>
                    <input type="text" 
                           value="${user != null ? user.name : ''}" 
                           class="form-control" 
                           name="name" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Email</label>
                    <input type="email" 
                           value="${user != null ? user.email : ''}" 
                           class="form-control" 
                           name="email">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Country</label>
                    <input type="text" 
                           value="${user != null ? user.country : ''}" 
                           class="form-control" 
                           name="country">
                </fieldset>

                <button type="submit" class="btn btn-success">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>