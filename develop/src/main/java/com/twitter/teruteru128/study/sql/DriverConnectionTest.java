package com.twitter.teruteru128.study.sql;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Enumeration;

import org.h2.jdbcx.JdbcDataSource;

public class DriverConnectionTest {

    public static void main(String[] args) {

        try {
            // Class.forName("oracle.jdbc.OracleDriver");
            //Connection db = DriverManager.getConnection(
            //        "jdbc:h2:tcp://localhost/bbs", "sa", "");
            JdbcDataSource source = new JdbcDataSource();
            source.setURL("jdbc:h2:tcp://localhost/bbs");
            source.setUser("sa");
            source.setPassword("");
            try (var db = source.getConnection();PreparedStatement ps = db
                    .prepareStatement("insert into thread(id,name,board_id) values(?,?,?)")) {
                // create table thread (id long not null,name nvarchar(32) not
                // null default '',board_id int not null );
                ps.setLong(1, LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond());
                ps.setString(2, "おっぱい！");
                ps.setInt(3, 0);
                ps.executeUpdate();
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
