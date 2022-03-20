package com.twitter.teruteru128.imagemanager.dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import com.twitter.teruteru128.dao.AbstractH2DAO;
import com.twitter.teruteru128.imagemanager.model.ImageModel;
import com.twitter.teruteru128.util.Page;

/**
 * @author Teruteru
 *
 */
public class ImageH2DAO extends AbstractH2DAO implements ImageDAO {
    private ArrayList<String> idList = new ArrayList<>(4);

    /**
     * 
     * @param p
     * @return
     * @throws IOException
     * @throws SQLException
     */
    public Optional<BufferedImage> getImageByOffset(int p) throws IOException, SQLException {
        Optional<BufferedImage> b = Optional.empty();
        try (var db = this.getConnection();
                PreparedStatement ps = db.prepareStatement("select data from image limit 1 offset ?;")) {

            ps.setInt(1, p);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    try (InputStream is = rs.getBlob("data").getBinaryStream()) {
                        b = Optional.ofNullable(ImageIO.read(is));
                    }
                }
            }
        }
        return b;
    }

    /**
     * 
     * @param id
     * @return
     * @throws IOException
     * @throws SQLException
     */
    public Optional<BufferedImage> getImageById(String id) throws IOException, SQLException {
        Optional<BufferedImage> b = Optional.empty();
        try (var db = this.getConnection();
                PreparedStatement ps = db.prepareStatement("select * from image where id = ?;")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    try (InputStream is = rs.getBlob("data").getBinaryStream()) {
                        b = Optional.ofNullable(ImageIO.read(is));
                    }
                }
            }
        }
        return b;
    }

    /**
     * 
     * @param page
     * @return
     */
    public ArrayList<ImageModel> getIdList(Page page) {
        ArrayList<ImageModel> b = new ArrayList<ImageModel>();
        try (var db = this.getConnection()) {
            try {
                try (PreparedStatement ps = db.prepareStatement("select id,name from image limit ? offset ?;")) {
                    long limit = page.getPageSize();
                    long offset = page.getPageSize() * (page.getPage() - 1);
                    ps.setLong(1, limit);
                    ps.setLong(2, offset);
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            b.add(new ImageModel(rs.getString("id"), rs.getString("name")));
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    /**
     * 
     * @return
     */
    public List<ImageModel> getAllImageModelList() {
        ArrayList<ImageModel> b = new ArrayList<>();
        try (var db = this.getConnection()) {
            try {
                try (PreparedStatement ps = db.prepareStatement("select id,name from image order by id;")) {
                    try (ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            b.add(new ImageModel(rs.getString("id"), rs.getString("name")));
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    /**
     * 
     * @return
     */
    public long getItemCount() {
        long rrc = -1;

        try (var db = this.getConnection()) {
            try {
                try (PreparedStatement ps = db.prepareStatement("select count(id) as c from image;")) {
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            rrc = rs.getLong("c");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rrc;
    }

    /**
     * 
     */
    private Random random = new Random();

    /**
     * 
     */
    public Optional<BufferedImage> getRandomImage() {
        Optional<BufferedImage> rtc = Optional.<BufferedImage>empty();
        try (var db = this.getConnection()) {
            try {
                var size = 0;
                try (PreparedStatement ps = db.prepareStatement("select count(*) as c from image")) {
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            size = rs.getInt("c");
                        }
                    }
                }
                var id = "";
                try (PreparedStatement ps = db.prepareStatement("select id from image limit 1 offset ?")) {
                    ps.setInt(1, random.nextInt(size));
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            id = rs.getString("id");
                        }
                    }
                }
                try (PreparedStatement ps = db.prepareStatement("select data from image where id = ?;")) {
                    ps.setString(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            // System.out.println("random");
                            try (InputStream is = rs.getBlob("data").getBinaryStream()) {
                                rtc = Optional.ofNullable(ImageIO.read(is));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rtc;
    }

    /**
     * 
     */
    public Optional<BufferedImage> getNextImage() {
        Optional<BufferedImage> rtc = Optional.<BufferedImage>empty();
        try (var db = this.getConnection()) {
            try {
                if (idList.size() == 0) {
                    try (PreparedStatement ps = db.prepareStatement("select id from image order by name desc")) {
                        try (ResultSet rs = ps.executeQuery()) {
                            if (rs.next()) {
                                idList.add(rs.getString("id"));
                            }
                        }
                    }
                }
                try (PreparedStatement ps = db.prepareStatement("select data from image where id = ?;")) {
                    ps.setString(1, idList.remove(1));
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            try (InputStream is = rs.getBlob("data").getBinaryStream()) {
                                rtc = Optional.ofNullable(ImageIO.read(is));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rtc;
    }

    /**
     * 
     */
    public void uploadImage(File f) {
        String id = new ImageFileDAO().getId(f);
        uploadImage(id, f);
    }

    /**
     * 
     */
    public void uploadImage(String id, File f) {
        try (var db = this.getConnection()) {
            try (PreparedStatement ps = db.prepareStatement("INSERT INTO IMAGE(id, name, data) values(?, ?, ?);")) {
                ps.setString(1, id);
                ps.setString(2, Pattern.compile("\\\\", 0).matcher(f.getPath()).replaceAll("/"));
                ps.setBinaryStream(3, new FileInputStream(f));
                ps.execute();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }
}
