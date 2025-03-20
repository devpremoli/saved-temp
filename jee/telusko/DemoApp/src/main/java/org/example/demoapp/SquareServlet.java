package org.example.demoapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int i = Integer.parseInt(req.getParameter("numA"));
        int j = Integer.parseInt(req.getParameter("numB"));

        int k = (int) req.getAttribute("added");
        int squared = k * k;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Square Using RequestDispatcher</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Square Using RequestDispatcher</h1>");
        out.println("<p>The square of " + i + " and " + j + " is <strong>" + squared + "</strong>.</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
