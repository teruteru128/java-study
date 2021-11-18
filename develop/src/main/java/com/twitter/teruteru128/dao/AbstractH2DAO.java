package com.twitter.teruteru128.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.h2.jdbcx.JdbcDataSource;

/**
 * @author Teruteru
 *
 */
public abstract class AbstractH2DAO extends AbstractDBDAO {

    @Override
    protected Connection getConnection(String a, String b, String c) throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL(a);
        ds.setUser(b);
        ds.setPassword(c);
        Connection db = ds.getConnection();
        return db;
    }

    public Connection getConnection() throws SQLException{
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:tcp://localhost/image");
        ds.setUser("sa");
        ds.setPassword("");
        Connection db = ds.getConnection();
        return db;
    }
    /**
     * 
     * */
    @Override
    protected DataSource getDataSource() {
        return new JdbcDataSource();
    }

    @Override
    protected DataSource getDataSource(String url) {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL(url);
        return ds;
    }
}