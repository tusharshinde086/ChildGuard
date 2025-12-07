package com.childguard.dao;

import com.childguard.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    private static final String LOGIN_SQL =
            "SELECT * FROM users WHERE username=? AND password=?";

    // ✔ VALIDATE LOGIN
    public boolean validate(String username, String password) {

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(LOGIN_SQL)) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();  // Found = true
            }

        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
        }

        return false;
    }
}
