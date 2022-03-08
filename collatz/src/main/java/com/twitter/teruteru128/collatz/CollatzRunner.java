package com.twitter.teruteru128.collatz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.PooledConnection;

/**
 * @author Teruteru
 *
 */
public class CollatzRunner implements Runnable {
    long start;
    long end;
    PooledConnection pooled;

    /**
     * 
     */
    public CollatzRunner(long srart, long end, PooledConnection connection) {
        this.start = srart;
        this.end = end;
        this.pooled = connection;
    }

    /**
     * 
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        Collatz3 c3 = new Collatz3();
        long tmp1 = 0;
        long tmp2 = 0;
        try (Connection db = pooled.getConnection()) {
            try (PreparedStatement ps = db
                    .prepareStatement("INSERT INTO COLLATZ(N,COUNT) VALUES(?,?)")) {
                tmp1 = System.currentTimeMillis();
                for (long n = start; n < end; n++) {
                    ps.setInt(1, (int) n);
                    ps.setInt(2, c3.collatz(n));
                    ps.execute();
                }
                tmp2 = System.currentTimeMillis();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.printf("最大値 : %d,実行時間:%dミリ秒%n", end - 1, tmp2 - tmp1);
    }

}
