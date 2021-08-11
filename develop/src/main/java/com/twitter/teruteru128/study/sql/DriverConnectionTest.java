package com.twitter.teruteru128.study.sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;

public class DriverConnectionTest {

    public static void main(String[] args) {

        try {
            // Class.forName("oracle.jdbc.OracleDriver");
            Connection db = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/bbs", "sa", "");
            try {
                // create table thread (id long not null,name nvarchar(32) not
                // null default '',board_id int not null );
                PreparedStatement ps = db
                        .prepareStatement("insert into thread(id,name,board_id) values(?,?,?)");
                ps.setLong(1, new Date().getTime() / 1000);
                ps.setString(2, "おっぱい！");
                ps.setInt(3, 0);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                db.close();
            }
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver driver = drivers.nextElement();
                System.out.println(driver);
                DriverManager.deregisterDriver(driver);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
