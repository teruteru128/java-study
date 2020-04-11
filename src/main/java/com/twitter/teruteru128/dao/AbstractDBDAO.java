package com.twitter.teruteru128.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Teruteru
 *
 */
public abstract class AbstractDBDAO extends AbstractDAO {
    public abstract Connection getConnection() throws SQLException;
    
    protected abstract DataSource getDataSource();

    /***/
    protected abstract DataSource getDataSource(String url);

    /**
     * 必要なConnectionを取得します
     * @return Connection
     * */
    protected Connection getConnection(String url, String user, String password)
            throws SQLException {
        Connection db = null;
        try {
            db = this.getDataSource(url).getConnection(user, password);
        } catch (SQLException e) {
            throw e;
        }
        return db;
    }
}
