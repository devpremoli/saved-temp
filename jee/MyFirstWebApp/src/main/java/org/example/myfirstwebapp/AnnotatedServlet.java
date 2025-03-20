package org.example.myfirstwebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AnnotatedServlet", urlPatterns = {"/annotated-servlet", "/as", "/as/any/*"}, initParams = {@WebInitParam(name="annotatedToken", value = "annotated123")})
public class AnnotatedServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("get request made");

        String token = getServletConfig().getInitParameter("annotatedToken");
        out.println(token);
    }

}
