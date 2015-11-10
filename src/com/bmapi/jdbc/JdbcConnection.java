package com.bmapi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JdbcConnection {

    private static Connection connection;
    private ResourceBundle properties = ResourceBundle.getBundle("com.bmapi.jdbc.jdbc");

    public JdbcConnection() {
        try {
            Class.forName(properties.getString("jdbc.driver"));
        } catch (Exception e) {
            System.out.println("Cannot load jdbc driver: " + e);
        }
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(properties.getString("jdbc.url"),
                                                     properties.getString("jdbc.username"),
                                                     properties.getString("jdbc.password"));
        } catch (Exception e) {
            System.out.println("Cannot connect to datasource.");
        }
        return connection;
    }
}
