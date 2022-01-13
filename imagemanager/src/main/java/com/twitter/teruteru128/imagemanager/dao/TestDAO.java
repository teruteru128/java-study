package com.twitter.teruteru128.imagemanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.twitter.teruteru128.dao.AbstractH2DAO;

/**
 * @author Teruteru
 *
 */
public class TestDAO extends AbstractH2DAO {
    public int getImageCount() {
        int c = -1;
        try (Connection db = this.getConnection()) {
            try {
                try (PreparedStatement ps = db
                        .prepareStatement("select count(*) as c from image ;")) {
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            c = rs.getInt("c");
                        }
                    }
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
}
