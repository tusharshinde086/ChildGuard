package com.childguard.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        if ("admin".equals(user) && "admin".equals(pass)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            resp.sendRedirect("DashboardServlet");
        } else {
            resp.sendRedirect("login.jsp?error=1");
        }
    }
}
