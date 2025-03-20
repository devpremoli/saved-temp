package org.example.concepts.ejb.sessionbean.stateful.shoppingcart;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/shopping-cart")
public class ShoppingCartServlet extends HttpServlet {

    @EJB
    private ShoppingCart shoppingCart;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (session.getAttribute("shoppingCart") == null) {
            session.setAttribute("shoppingCart", shoppingCart);
        }

        String action = request.getParameter("action");
        String item = request.getParameter("item");

        switch (action) {
            case "add":
                shoppingCart.addItem(item);
                break;
            case "remove":
                shoppingCart.removeItem(item);
                break;
            case "clear":
                shoppingCart.clearCart();
                break;
        }

        response.sendRedirect("shopping-cart.jsp");
    }
}
