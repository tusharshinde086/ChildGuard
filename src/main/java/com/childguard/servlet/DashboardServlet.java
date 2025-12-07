package com.childguard.servlet;

import com.childguard.dao.ReportDAO;
import com.childguard.model.Report;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class DashboardServlet extends HttpServlet {

    private ReportDAO dao = new ReportDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Report> reports = dao.getAll();
        req.setAttribute("reports", reports);
        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        if ("update".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            String status = req.getParameter("status");
            dao.updateStatus(id, status);

        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            dao.delete(id);
        }

        resp.sendRedirect("DashboardServlet");
    }
}
