package com.twitter.teruteru128.study.thread;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.PooledConnection;

import com.twitter.teruteru128.collatz.DBMain;

/**
 * @author Teruteru
 *
 */
public class MultiThreadCollatzCalcSample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            PooledConnection pool = DBMain.getPooledConnection();
            try (Connection connection1 = pool.getConnection();) {
                var statement = connection1.createStatement();
                statement.execute("CREATE TABLE COLLATZ(N BIGINT, COUNT BIGINT, PRIMARY KEY (N) );");
                Thread t1 = new Thread(new CollatzCalcer(connection1, 25000000, 26000000));
                Thread t2 = new Thread(new CollatzCalcer(connection1, 26000000, 27000000));
                Thread t3 = new Thread(new CollatzCalcer(connection1, 27000000, 28000000));
                Thread t4 = new Thread(new CollatzCalcer(connection1, 28000000, 29000000));
                Thread t5 = new Thread(new CollatzCalcer(connection1, 29000000, 30000000));
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                t5.join();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
