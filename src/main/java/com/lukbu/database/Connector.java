package com.lukbu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

    private Connection c = null;
    private final Statement stmt = null;

    public void createConnectionToDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:file:C:\\Soft\\sqlite-tools-win32-x86-3370200\\universalGameCreator.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully!!!");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void disconnect() throws SQLException {
        try {
            if (c != null) {
                c.close();
                System.out.println("Disconnected from SQLite");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

