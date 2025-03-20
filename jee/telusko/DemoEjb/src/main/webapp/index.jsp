<%@ page import="org.example.demoejb.ListElementRemote" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%!
    private static ListElementRemote values;

    public  void jspInit() {
        try {
            InitialContext ic = new InitialContext();
            values = (ListElementRemote) ic.lookup("java:global/DemoEjb-1.0-SNAPSHOT/ListElementImpl");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
%>

<%
    if (request.getParameter("addNum") != null) {
        int e = Integer.parseInt(request.getParameter("t1"));
        values.addElement(e);
    }
    if (request.getParameter("remNum") != null) {
        int e = Integer.parseInt(request.getParameter("t1"));
        values.removeElement(e);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Index jsp</title>
</head>
<body>
<form name="abc" method="post">

    <input type="text" name="t1"><br>
    <input type="submit" value="Add" name="addNum"><br>
    <input type="submit" value="Remove" name="remNum"><br>

    <%
        if (values != null) {
            List<Integer> nums = values.getElements();
            for (int value : nums) {
                out.println("<br>" + value);
            }
            out.print("<br> Size= " + nums.size());
        }
    %>

</form>

<%--<form action="add" method="post">--%>
<%--    <div>--%>
<%--        <label for="num1">Enter First Number: </label>--%>
<%--        <input type="number" name="num1" id="num1">--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label for="num2">Enter First Number: </label>--%>
<%--        <input type="number" name="num2" id="num2">--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button type="submit">Submit</button>--%>
<%--    </div>--%>
<%--</form>--%>
</body>
</html>