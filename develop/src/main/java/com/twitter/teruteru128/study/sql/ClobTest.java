package com.twitter.teruteru128.study.sql;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import org.h2.jdbcx.JdbcDataSource;

public class ClobTest {

    public static void main(String[] args) {
        JdbcDataSource source = new JdbcDataSource();
        source.setUrl("jdbc:h2:tcp://localhost/test");
        source.setUser("sa");
        source.setPassword("");
        try (Connection db = source.getConnection()) {
            try (PreparedStatement ps = db
                    .prepareStatement("UPDATE TEST SET TEXT = ? WHERE ID = ?")) {
                Blob clob = db.createBlob();
                try {
                    Random r = new Random();
                    OutputStream o = clob.setBinaryStream(1);
                    try {
                        for (int i = 0, length = r.nextInt(32768) + 32768; i < length; i++) {
                            o.write('A');
                        }
                    } finally {
                        o.close();
                    }
                    ps.setBlob(1, clob);
                    for (int i = 0; i < 100; i++) {
                        ps.setInt(2, i);
                        ps.execute();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    clob.free();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
