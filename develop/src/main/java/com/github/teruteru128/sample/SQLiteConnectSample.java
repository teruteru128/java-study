package com.github.teruteru128.sample;

import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class SQLiteConnectSample implements Sample {
    public static void sample(String url) throws SQLException {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        try (var con = dataSource.getConnection()) {
            System.out.println("connected!");
        }
    }

    @Override
    public void sample() throws Exception {
        sample("");
    }
}
