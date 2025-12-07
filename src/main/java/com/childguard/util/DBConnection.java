package com.childguard.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/childguard?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";       // your MySQL username
    private static final String PASS = "root";       // your MySQL password (change if needed)
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // ALWAYS return a new DB connection
    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);  // Load MySQL driver
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (Exception e) {
            System.out.println("❌ Database Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}
