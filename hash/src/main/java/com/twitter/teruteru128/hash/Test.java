package com.twitter.teruteru128.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Test {

    static MessageDigest sha256 = null;

    public static void main(String[] args) {
        try {
            Connection db = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/hash", "sa", "");
            try {
                Statement s = db.createStatement();
                try {
                    s.execute("CREATE TABLE IF NOT EXISTS SHA256 (input binary(32) not null,hash binary(32),primary key(input))");
                } finally {
                    s.close();
                }
                byte[] input = new byte[32];
                Arrays.fill(input, (byte) 0);
                byte[] hash;
                Blob bInput = db.createBlob();
                Blob bHash = db.createBlob();
                MessageDigest md = getSha256();
                try (PreparedStatement ps = db
                        .prepareStatement("INSERT INTO SHA256(INPUT,HASH) VALUES(?,?)")) {
                    for (int i = 0; i < 2000; i++) {
                        hash = md.digest(input);
                        bInput.setBytes(1, input);
                        bHash.setBytes(1, hash);
                        ps.setBlob(1, bInput);
                        ps.setBlob(2, bHash);
                        ps.execute();
                        input = hash;
                    }
                }
            } finally {
                db.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static MessageDigest getSha256() {
        if (sha256 == null) {
            try {
                sha256 = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return sha256;
    }
}
