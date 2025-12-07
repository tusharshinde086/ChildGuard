package com.childguard.dao;

import com.childguard.model.Report;
import com.childguard.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReportDAO {

    private static final String INSERT_SQL =
            "INSERT INTO reports(title, location, description, status, date) VALUES (?, ?, ?, ?, NOW())";

    private static final String SELECT_ALL_SQL =
            "SELECT * FROM reports ORDER BY date DESC";

    private static final String UPDATE_SQL =
            "UPDATE reports SET status=? WHERE id=?";

    private static final String DELETE_SQL =
            "DELETE FROM reports WHERE id=?";

    // ✔ SAVE REPORT
    public void save(Report report) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(INSERT_SQL)) {

            ps.setString(1, report.getTitle());
            ps.setString(2, report.getLocation());
            ps.setString(3, report.getDescription());
            ps.setString(4, report.getStatus());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error saving report: " + e.getMessage());
        }
    }

    // ✔ LIST ALL REPORTS
    public List<Report> getAll() {
        List<Report> reports = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(SELECT_ALL_SQL);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Report r = new Report();
                r.setId(rs.getInt("id"));
                r.setTitle(rs.getString("title"));
                r.setLocation(rs.getString("location"));
                r.setDescription(rs.getString("description"));
                r.setStatus(rs.getString("status"));
                r.setTitle(rs.getString("title"));

                reports.add(r);
            }

        } catch (Exception e) {
            System.out.println("Error fetching reports: " + e.getMessage());
        }

        return reports;
    }

    // ✔ UPDATE STATUS
    public void updateStatus(int id, String status) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(UPDATE_SQL)) {

            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error updating report: " + e.getMessage());
        }
    }

    // ✔ DELETE REPORT
    public void delete(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(DELETE_SQL)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error deleting report: " + e.getMessage());
        }
    }
}
