package com.twitter.teruteru128.image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.twitter.teruteru128.dao.AbstractH2DAO;

import jakarta.xml.bind.DatatypeConverter;

/**
 * create table image (id char(64) not null,name varchar(128)not null default
 * 'default',extension varchar(16) not null ,primary key(id))
 */
public class ImageH2DAO extends AbstractH2DAO implements ImageDAO {
    @Override
    public Connection getConnection() throws SQLException {
        return this.getConnection("jdbc:h2:tcp://localhost/image", "sa", "");
    }

    public static void main(String... args) {
        try {

            ImageH2DAO dao = new ImageH2DAO();
            ZipEntry entry;
            byte[] buf = new byte[1024];
            int readedsize = -1;
            try (Connection db = dao.getConnection()) {
                db.createStatement()
                        .execute(
                                "create table IF NOT EXISTS image (id char(64) not null,name varchar(128)not null default 'default',data blob not null,primary key(id))");
                try (PreparedStatement ps = db.prepareStatement("insert into image(id,name,data)values(?,?,?)");
                        ZipInputStream zin = new ZipInputStream(new FileInputStream("pixiv-2015-03-22.zip"))) {
                    MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
                    while ((entry = zin.getNextEntry()) != null) {
                        ps.setString(2, entry.getName());
                        Blob blob = db.createBlob();
                        try {
                            try (DigestOutputStream dos = new DigestOutputStream(
                                    blob.setBinaryStream(1), sha256)) {
                                while ((readedsize = zin.read(buf)) != -1) {
                                    dos.write(buf, 0, readedsize);
                                }
                                dos.flush();
                                ps.setString(1, DatatypeConverter.printHexBinary(dos
                                        .getMessageDigest().digest()));
                            }
                            ps.setBlob(3, blob);
                            ps.execute();
                        } finally {
                            blob.free();
                        }
                    }
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
