package com.twitter.teruteru128.study;

import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class SQLiteConnectSample {
    public static void sample(String url) throws SQLException {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        try (var con = dataSource.getConnection()) {
            System.out.println("connected!");
        }
    }
}
