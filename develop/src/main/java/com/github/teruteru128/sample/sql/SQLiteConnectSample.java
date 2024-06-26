package com.github.teruteru128.sample.sql;

import java.sql.SQLException;

import com.github.teruteru128.sample.Sample;
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
