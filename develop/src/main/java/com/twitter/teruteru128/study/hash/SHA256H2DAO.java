package com.twitter.teruteru128.study.hash;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.twitter.teruteru128.dao.AbstractH2DAO;

import org.h2.jdbcx.JdbcDataSource;

/**
 * キーワード : コネクションプーリング
 */
public class SHA256H2DAO extends AbstractH2DAO {
    /**
     * @return {@inheritDoc}
     */
    @Override
    public Connection getConnection() throws SQLException {
        JdbcDataSource source = new JdbcDataSource();
        source.setURL("jdbc:h2:tcp://localhost/hash");
        source.setUser("sa");
        source.setPassword("");
        return source.getConnection();
    }

    public void createSHA256(SHA256 hash) {
        this.createSHA256(hash.getInput(), hash.getHash());
    }

    public void createSHA256(String input, String hash) {
        try (Connection db = getConnection()) {
            try (PreparedStatement ps = db
                    .prepareStatement("INSERT INTO SHA256(INPUT,HASH) VALUES(?,?)")) {
                ps.setString(1, input);
                ps.setString(2, hash);
                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSHA256(String input, String hash) {
        try (Connection db = getConnection()) {
            try (PreparedStatement ps = db
                    .prepareStatement("UPDATE SHA256 SET HASH = ? WHERE INPUT = ?")) {
                ps.setString(1, hash);
                ps.setString(2, input);
                ps.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSHA256(SHA256 hash) {
        this.updateSHA256(hash.getInput(), hash.getHash());
    }

    public ArrayList<SHA256> findByHashIsNull() {
        ArrayList<SHA256> result = new ArrayList<SHA256>();
        try (Connection db = getConnection()) {
            Statement s = db.createStatement();
            try (ResultSet rs = s
                    .executeQuery("SELECT INPUT FROM SHA256 WHERE HASH IS NULL")) {
                while (rs.next()) {
                    result.add(new SHA256(rs.getString("INPUT")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<SHA256> findAll() {
        ArrayList<SHA256> result = new ArrayList<SHA256>();
        try (Connection db = getConnection()) {
            try (Statement s = db.createStatement();
                    ResultSet rs = s.executeQuery("SELECT INPUT FROM SHA256")) {
                while (rs.next()) {
                    result.add(new SHA256(rs.getString("INPUT")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
