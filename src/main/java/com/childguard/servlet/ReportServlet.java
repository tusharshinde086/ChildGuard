package com.childguard.servlet;

import com.childguard.dao.ReportDAO;
import com.childguard.model.Report;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ReportServlet extends HttpServlet {

    private ReportDAO dao = new ReportDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String title = req.getParameter("title");
        String location = req.getParameter("location");
        String description = req.getParameter("description");

        Report report = new Report();
        report.setTitle(title);
        report.setLocation(location);
        report.setDescription(description);
        report.setStatus("Submitted");

        dao.save(report);

        resp.sendRedirect("index.jsp?success=1");
    }
}
