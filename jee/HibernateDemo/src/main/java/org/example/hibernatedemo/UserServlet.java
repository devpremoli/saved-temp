package org.example.hibernatedemo;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.hibernatedemo.dao.UserDao;
import org.example.hibernatedemo.entity.User;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        userDao.getAllUsers().forEach(user ->
                out.printf("<p>%s (%s)</p>", user.getName(), user.getEmail())
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userDao.save(user);
        resp.sendRedirect("/users");
    }

    @Override
    public void destroy() {
        userDao.close();
    }
}
