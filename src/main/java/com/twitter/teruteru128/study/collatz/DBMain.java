package com.twitter.teruteru128.study.collatz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import org.h2.jdbcx.JdbcDataSource;

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
 * select * from collatz order by count desc limit 200; call csvwrite
 * ('count30000000.csv','SELECT count,count(count) as cc FROM (select n,count
 * from collatz limit 30000000) group by count order by count','utf-8');
 * 0から40000000->実行時間:3405402ミリ秒
 * 
 * @author Teruteru create table collatz(n bigint not null, count int not null,
 *         primary key(n))
 */
public class DBMain {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // 50000000L
        long tmp1 = 0;
        long tmp2 = 0;
        var threads = new ArrayList<Thread>(5);
        for (var i = 60000000L; i < 100000000L; i += 8000000L) {
            threads.add(new Thread(new CollatzRunner(i, i + 8000000L)));
        }
        tmp1 = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        tmp2 = System.currentTimeMillis();
        System.out.printf("全体実行時間:%dミリ秒%n", tmp2 - tmp1);
        unregisterAllDriver();
    }

    public static Connection getConnection() throws SQLException {
        var source = new JdbcDataSource();
        source.setUrl("jdbc:h2:tcp://localhost/collatz");
        source.setUser("sa");
        source.setPassword("");
        return source.getConnection();
    }

    public static void unregisterAllDriver() {
        Enumeration<Driver> ed = DriverManager.getDrivers();
        while (ed.hasMoreElements()) {
            var driver = ed.nextElement();
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
        for (i = 1; a > (long) Math.pow(b, i); i++)
            ;
        return a == Math.pow(b, i);
    }
}
