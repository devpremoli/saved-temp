package org.example.demoapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/helper-add")
public class HelperAddServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int firstNum = Integer.parseInt(request.getParameter("numC"));
        int secondNum = Integer.parseInt(request.getParameter("numD"));
        int addResult = firstNum + secondNum;

        HttpSession session = request.getSession();
        session.setAttribute("i", firstNum);
        session.setAttribute("j", secondNum);

        response.sendRedirect("/sq?k=" + addResult);
    }
}
