package com.twitter.teruteru128.study.thread;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.twitter.teruteru128.study.collatz.Collatz3;

public class CollatzCalcer implements Runnable {
    private Collatz3 c3_i = null;
    private Connection db = null;
    private long start = -1;
    private long end = -1;

    public CollatzCalcer(Connection db, long start, long end) {
        this.db = db;
        this.start = start;
        this.end = end;
        this.c3_i = new Collatz3();
    }

    public synchronized void run() {
        try (PreparedStatement ps = db
                .prepareStatement("INSERT INTO COLLATZ(N,COUNT) VALUES(?,?)")) {
            for (long n = start; n < end; n++) {
                ps.setLong(1, n);
                ps.setInt(2, c3_i.collatz(n));
                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
