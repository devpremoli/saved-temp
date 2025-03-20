package org.example.demoapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/help-add")
public class HelpAddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int firstNum = Integer.parseInt(request.getParameter("numE"));
        int secondNum = Integer.parseInt(request.getParameter("numF"));
        int addResult = firstNum + secondNum;

        HttpSession session = request.getSession();
        session.setAttribute("added", addResult);

        response.sendRedirect("/sqr");
    }

}
