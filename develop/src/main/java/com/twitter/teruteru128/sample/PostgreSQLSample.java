package com.twitter.teruteru128.sample;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgreSQLSample {
    public void sample() throws SQLException {
        var url = "jdbc:postgresql://localhost/";
        String user = "postgres";
        String password = "postgres";
        var props = new Properties();
        props.setProperty("user", user);
        props.setProperty("password", password);
        try (var con = DriverManager.getConnection(url, props)) {
            System.out.println("Connected!");
        }
    }
}
