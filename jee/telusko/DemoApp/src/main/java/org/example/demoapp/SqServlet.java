package org.example.demoapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int k = Integer.parseInt(request.getParameter("k"));
        int squared = k * k;

        HttpSession session = request.getSession();
        int i = (int) session.getAttribute("i");
        int j = (int) session.getAttribute("j");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Square Using sendRedirect</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Square Using sendRedirect; url rewriting</h1>");
        out.println("<p>The square of " + i + " and " + j + " is <strong>" + squared + "</strong>.</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
