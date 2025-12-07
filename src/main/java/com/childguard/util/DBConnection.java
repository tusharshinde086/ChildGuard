package com.childguard.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {

        if (connection != null) {
            return connection;
        }

        try {
            Properties props = new Properties();
            InputStream in = DBConnection.class.getClassLoader()
                    .getResourceAsStream("database.properties");

            if (in == null) {
                throw new RuntimeException("database.properties not found in resources folder");
            }

            props.load(in);

            String url = props.getProperty("db.url");
            String username = props.getProperty("db.username");
            String password = props.getProperty("db.password");
            String driver = props.getProperty("db.driver");

            Class.forName(driver);  
            connection = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DB Connection Failed: " + e.getMessage());
        }

        return connection;
    }
}
