package com.twitter.teruteru128.test.thread;

import java.sql.Connection;
import java.sql.SQLException;

import com.twitter.teruteru128.test.collatz.DBMain;

/**
 * @author Teruteru
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Connection db1 = DBMain.getConnection();
                Connection db2 = DBMain.getConnection();
                Connection db3 = DBMain.getConnection();
                Connection db4 = DBMain.getConnection();
                Connection db5 = DBMain.getConnection()) {
            Thread t1 = new Thread(new CollatzCalcer(db1, 25000000, 26000000));
            Thread t2 = new Thread(new CollatzCalcer(db2, 26000000, 27000000));
            Thread t3 = new Thread(new CollatzCalcer(db3, 27000000, 28000000));
            Thread t4 = new Thread(new CollatzCalcer(db4, 28000000, 29000000));
            Thread t5 = new Thread(new CollatzCalcer(db5, 29000000, 30000000));
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
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        DBMain.unregisterAllDriver();
    }

}
