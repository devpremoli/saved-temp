package org.example.demoapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sqr")
public class SqrServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int k = (int) session.getAttribute("added");
        int squared = k * k;


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Square Using sendRedirect</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Square Using sendRedirect</h1>");
//        out.println("<p>The square of " + i + " and " + j + " is <strong>" + k + "</strong>.</p>");
        out.println("<p>" + squared + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
