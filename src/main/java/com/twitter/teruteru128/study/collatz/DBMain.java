package com.twitter.teruteru128.study.collatz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * <table>
 * <tr>
 * <th>create文</th>
 * <td>create table collatz(n bigint not null, count int not null, primary
 * key(n))
 * <td>
 * </tr>
 * <tr>
 * <th>max</th>
 * <td>select * from collatz where count=(SELECT max(count) FROM COLLATZ )</td>
 * </tr>
 * <tr>
 * <th>index</th>
 * <td>create index collatz_index_count on collatz(count)</td>
 * </tr>
 * </table>
 * select * from collatz order by count desc limit 200;
 * call csvwrite ('count30000000.csv','SELECT count,count(count) as cc FROM (select n,count from collatz limit 30000000) group by count order by count','utf-8');
 * 0から40000000->実行時間:3405402ミリ秒
 * 
 * @author Teruteru create table collatz(n bigint not null, count int not null,
 *         primary key(n))
 */
public class DBMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //50000000L
        long tmp1 = 0;
        long tmp2 = 0;
        Thread t1=new Thread(new CollatzRunner(60000000L, 68000000L));
        Thread t2=new Thread(new CollatzRunner(68000000L, 76000000L));
        Thread t3=new Thread(new CollatzRunner(76000000L, 84000000L));
        Thread t4=new Thread(new CollatzRunner(84000000L, 92000000L));
        Thread t5=new Thread(new CollatzRunner(92000000L, 100000000L));
        tmp1 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tmp2 = System.currentTimeMillis();
        System.out.printf("全体実行時間:%dミリ秒%n", tmp2 - tmp1);
        unregisterAllDriver();
    }

    public static Connection getConnection() throws SQLException {
        Connection db = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/collatz", "sa", "");
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

    static boolean isPow(long a, long b) {
        int i;
        for (i = 1; a > (long)Math.pow(b, i); i++) {
        }
        return a == Math.pow(b, i);
    }
}
