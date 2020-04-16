package com.twitter.teruteru128.study.sql;

import java.sql.Connection;
import java.sql.SQLException;

import com.twitter.teruteru128.dao.AbstractH2DAO;

class SimpleH2DAO extends AbstractH2DAO {
    public Connection getConnection() throws SQLException {
        return super.getConnection("jdbc:h2:tcp://localhost/test", "sa", "");
    }

}
