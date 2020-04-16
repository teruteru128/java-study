package com.twitter.teruteru128.study.collatz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Teruteru
 *
 */
public class DBMain2 implements Callable<Void> {
    private Connection db;
    private int start;
    private int end;

    /**
     * 
     * */
    public DBMain2(Connection db, int start, int end) {
        this.db = Objects.<Connection> requireNonNull(db);
        if ((end - start) < 0) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService ex = new ThreadPoolExecutor(16, 16,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        ScheduledThreadPoolExecutor service = new ScheduledThreadPoolExecutor(10);
        try {
            List<Future<Void>> list = new ArrayList<Future<Void>>();
            for (int i = 0; i < 16; i++) {

                Future<Void> future = ex.submit(new DBMain2(getConnection(),
                        i * 6250000, (i + 1) * 6250000));
                list.add(future);
                for (Future<Void> f : list) {
                    try {
                        f.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (SQLException e) {

        } finally {
            ex.shutdown();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection db = DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/collatz", "sa", "");
        return db;
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.util.concurrent.Callable#call()
     */
    @Override
    public Void call() throws Exception {
        Connection db = this.db;
        long end = this.end;
        Collatz3 c3 = new Collatz3();
        try {
            PreparedStatement ps = db
                    .prepareStatement("INSERT INTO COLLATZ(N,COUNT,NEXT) VALUES(?,?,?);");
            System.err.printf("開始 : 開始値 : %d, 終了値 : %d%n", start, end);
            for (int tmp = start; tmp < end; tmp++) {
                ps.setInt(1, tmp);
                ps.setInt(2, c3.collatz(tmp));
                ps.setInt(3, (tmp % 2) == 0 ? tmp / 2 : tmp * 3 + 1);
                ps.execute();
            }
            System.err.printf("完了 : 開始値 : %d, 終了値 : %d%n", start, end);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.printf("失敗 : 開始値 : %d, 終了値 : %d%n", start, end);
        } finally {
            db.close();
        }
        return null;
    }

}
