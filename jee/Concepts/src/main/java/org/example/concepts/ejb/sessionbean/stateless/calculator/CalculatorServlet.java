package org.example.concepts.ejb.sessionbean.stateless.calculator;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @EJB
    private CalculatorBean calculator;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int firstNum = Integer.parseInt(request.getParameter("num1"));
            int secondNum = Integer.parseInt(request.getParameter("num2"));

            int sum = calculator.add(firstNum, secondNum);
            int subtract = calculator.subtract(firstNum, secondNum);

            request.setAttribute("firstNum", firstNum);
            request.setAttribute("secondNum", secondNum);
            request.setAttribute("sum", sum);
            request.setAttribute("subtract", subtract);

            request.getRequestDispatcher("calculator-result.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("errorMessage", "Please enter valid numbers.");
            request.getRequestDispatcher("calculator.jsp").forward(request, response);
        }
    }
}
