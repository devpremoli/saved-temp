package org.example.myfirstwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PresidentServlet", urlPatterns = "/presidents")
public class PresidentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        forward
        same request
         */
        //getServletContext().getRequestDispatcher("/presidents.jsp").forward(request, response);
        //getServletContext().getRequestDispatcher("/banana.html").forward(request, response);
        //getServletContext().getRequestDispatcher("/hello").forward(request, response);

        /*
        redirect
        new request
         */
        response.sendRedirect("/hello");
    }
}
