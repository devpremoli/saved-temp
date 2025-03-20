package org.example.myfirstwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String firstname = request.getParameter("firstname");
//        String lastname = request.getParameter("lastname");
//
//        if (firstname == null || lastname == null) {
//            System.out.println("Full name not provided");
//        } else {
//            response.setContentType("text/html");
//            PrintWriter out = response.getWriter();
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet NameServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet NameServlet</h1>");
//            out.println("<h2>" + firstname + "</h2>");
//            out.println("<h2>" + lastname + "</h2>");
//            out.println("</body>");
//            out.println("</html>");
//        }

        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String age = request.getParameter("age");

        StringBuilder errors = new StringBuilder();
        if (firstName == null || firstName.isEmpty()) {
            errors.append("Firstname was not provided\n");
        }
        if (lastName == null || lastName.isEmpty()) {
            errors.append("Lastname was not provided\n");
        }
        if (age == null || age.isEmpty()) {
            errors.append("Age was not provided\n");
        }

        if (errors.length() > 0) {
            request.setAttribute("errors", errors.toString());
        } else {
            request.setAttribute("firstname", firstName);
            request.setAttribute("lastname", lastName);
            request.setAttribute("age", age);
        }

        getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
    }
}
