package com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.User;
import com.entity.UsersList;

@WebServlet(name = "WelcomeServlet", urlPatterns = {"/WelcomeServlet"})
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        String out = request.getParameter("logout");
        if (out != null && !out.isEmpty()) {
            request.getSession().invalidate();
            rd = getServletContext().getRequestDispatcher("/");
            rd.forward(request, response);
            return;
        }

        String toCab = request.getParameter("toCab");
        if (null != toCab && !toCab.isEmpty()) {
            rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/cabinet.jsp");
            rd.forward(request, response);
            return;
        }

        rd = getServletContext().getRequestDispatcher("/");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        User[] users = UsersList.getUsers();
        RequestDispatcher rd;
        for (User user : users) {
            if (user.getLogin().equals(login)
                    && user.getPassword().equals(pass)) {
                request.getSession().setAttribute("name", user.getName());
                rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/cabinet.jsp");
                rd.forward(request, response);
                return;
            }
        }

        request.setAttribute("error", "Ошибка авторизации");
        rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp");
        rd.forward(request, response);
    }
}
