package org.example.demoapp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add-helper")
public class AddServletHelper extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int firstNum = Integer.parseInt(request.getParameter("numA"));
        int secondNum = Integer.parseInt(request.getParameter("numB"));
        int addResult = firstNum + secondNum;

        request.setAttribute("added", addResult);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/square");
        dispatcher.forward(request, response);

        //response.sendRedirect("/square");

    }
}
