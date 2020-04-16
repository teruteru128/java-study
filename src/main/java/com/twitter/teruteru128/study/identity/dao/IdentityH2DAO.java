package com.twitter.teruteru128.study.identity.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.twitter.teruteru128.dao.AbstractH2DAO;

/**
 * 
 * */
public class IdentityH2DAO extends AbstractH2DAO {

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

}
