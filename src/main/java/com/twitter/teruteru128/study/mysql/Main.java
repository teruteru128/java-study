package com.twitter.teruteru128.study.mysql;

import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/wordpress");
        dataSource.setUser("wordpressuser");
        dataSource.setPassword("password");
        try (var connection = dataSource.getConnection()) {
        }
        MysqlConnectionPoolDataSource dataSource2 = new MysqlConnectionPoolDataSource();
        dataSource2.setURL("jdbc:mysql://localhost/wordpress");
        dataSource2.setUser("wordpressuser");
        dataSource2.setPassword("password");
        try (var connection = dataSource2.getConnection()) {
        }
    }

}
