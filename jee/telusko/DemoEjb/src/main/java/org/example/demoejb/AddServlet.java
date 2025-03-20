package org.example.demoejb;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @EJB
    private AddEjb addEjb;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int firstNum = Integer.parseInt(request.getParameter("num1"));
        int secondNum = Integer.parseInt(request.getParameter("num2"));

        addEjb.setI(firstNum);
        addEjb.setJ(secondNum);
        addEjb.add();
        int k = addEjb.getK();

        PrintWriter out = response.getWriter();
        out.println(k);
    }
}
