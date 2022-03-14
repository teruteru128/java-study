package com.twitter.teruteru128.collatz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * @author Teruteru
 *
 */
public class DB2CSV {

    /**
     * @param args
     */
    public static void main(String[] args) {
        long n = 0;
        long count = 0;
        long next = 0;
        int linecounter = 0;
        long maxn = 99999999L;
        long middlen = (long) Math.pow(10, Math.log10(maxn) - (long) (Math.log10(maxn) / 2));
        long newfilelinecount = 200000;
        try {
            try (Connection con = getConnection()) {
                try (PreparedStatement ps = con.prepareStatement("select n, count, next from COLLATZ")) {
                    try (ResultSet rs = ps.executeQuery()) {
                        for (long filecount = 1; !rs.isAfterLast(); filecount++) {
                            try (BufferedWriter outfile = new BufferedWriter(
                                    new OutputStreamWriter(new FileOutputStream(new File(String.format(
                                            "../../collatz/out.%03d.csv",
                                            filecount)))))) {
                                while (rs.next()) {
                                    n = rs.getLong("n");
                                    count = rs.getLong("count");
                                    next = rs.getLong("next");

                                    outfile.write(String.format("%d,%d,%d\r\n", n, count, next));
                                    linecounter = linecounter + 1;
                                    if ((linecounter % middlen) == (middlen - 1)) {
                                        outfile.flush();
                                    }
                                    if ((linecounter % newfilelinecount) == 199999) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection db = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/../../eclipse/collatz", "sa", "");
        return db;
    }

    public static void unregisterAllDriver() {
        Enumeration<Driver> ed = DriverManager.getDrivers();
        while (ed.hasMoreElements()) {
            Driver driver = ed.nextElement();
            try {
                System.out.println(driver);
                DriverManager.deregisterDriver(driver);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
