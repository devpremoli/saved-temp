package org.example.demoapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet {

    // Although works, not recommended
//    @Override
//    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int firstNum = Integer.parseInt(req.getParameter("num1"));
//        int secondNum = Integer.parseInt(req.getParameter("num2"));
//        int result = firstNum + secondNum;
//        PrintWriter out = resp.getWriter();
//        out.println(result);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int firstNum = Integer.parseInt(req.getParameter("num1"));
        int secondNum = Integer.parseInt(req.getParameter("num2"));
        int result = firstNum + secondNum;

        //resp.setContentType("text/plain");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        //out.println(result);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Add</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Add</h1>");
        out.println("<p>The sum of " + firstNum + " and " + secondNum + " is <strong>" + result + "</strong>.</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
