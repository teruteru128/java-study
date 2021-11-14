package com.twitter.teruteru128.study.collatz;

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
        FileOutputStream fos = null;
        BufferedWriter outfile = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String n = null;
        String count = null;
        String next = null;
        int linecounter = 0;
        long maxn = 99999999L;
        long middlen = (long) Math.pow(10, Math.log10(maxn) - (long)(Math.log10(maxn)/2));
        long minn = 1;
        long newfilelinecount = 200000;
        long filecount = 2;
        try {
            
            File f = new File("../../collatz/out.001.csv");
            f.createNewFile();
            fos = new FileOutputStream(f);
            try {
                outfile = new BufferedWriter(new OutputStreamWriter(fos));
                try {

                    con = getConnection();
                    try {
                        ps = con.prepareStatement("select n,count,next from COLLATZ limit ? offset ?");
                        try {
                            ps.setLong(1, maxn);
                            ps.setLong(2, minn - 1);
                            rs = ps.executeQuery();
                            try {
                                while (rs.next()) {
                                    n = Long.toString(rs.getLong("n"));
                                    count = Long.toString(rs.getLong("count"));
                                    next = Long.toString(rs.getLong("next"));

                                    outfile.write(n);
                                    outfile.write(",");
                                    outfile.write(count);
                                    outfile.write(",");
                                    outfile.write(next);
                                    outfile.write("\r\n");
                                    linecounter = linecounter + 1;
                                    if ((linecounter % middlen) == (middlen - 1)) {
                                        outfile.flush();
                                    }
                                    if ((linecounter % newfilelinecount) == 0 && linecounter > 0) {
                                        outfile.close();
                                        f = new File(String.format(
                                                "../../collatz/out.%03d.csv",
                                                filecount));
                                        filecount = filecount + 1;
                                        f.createNewFile();
                                        fos = new FileOutputStream(f);
                                        outfile = new BufferedWriter(new OutputStreamWriter(fos));
                                    }
                                }
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } finally {
                                if (rs != null) {
                                    rs.close();
                                }
                            }
                        } catch (SQLException e) {
                            if (ps != null) {
                                ps.close();
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (con != null) {
                            con.close();
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (outfile != null) {
                    outfile.close();
                }
            }
        } catch (IOException e) {
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
