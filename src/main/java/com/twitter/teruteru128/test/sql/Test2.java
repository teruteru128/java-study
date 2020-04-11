package com.twitter.teruteru128.test.sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import org.h2.jdbcx.JdbcDataSource;

public class Test2 {

    public static void main(String[] args) {
        try {
            JdbcDataSource ds = new JdbcDataSource();
            ds.setURL("jdbc:h2:tcp://localhost/test");
            ds.setUser("sa");
            ds.setPassword("");
            Connection db = ds.getConnection();
            try {
                try (Statement st = db.createStatement()) {
                    st.execute("CREATE TABLE IF NOT EXISTS TEST (id long not null ,salt clob null default null,primary key (id));");
                }
            } finally {
                db.close();
            }
            Enumeration<Driver> enumDrivers = DriverManager.getDrivers();
            while (enumDrivers.hasMoreElements()) {
                Driver driver = enumDrivers.nextElement();
                System.out.println(driver);
                DriverManager.deregisterDriver(driver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
