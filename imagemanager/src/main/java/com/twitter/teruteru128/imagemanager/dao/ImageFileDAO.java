package com.twitter.teruteru128.imagemanager.dao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import javax.imageio.ImageIO;

import com.twitter.teruteru128.dao.AbstractFileDAO;

import jakarta.xml.bind.DatatypeConverter;

/**
 * TODO DAOは１ファイル単位か１ディレクトリ単位にすべきか？ -> １ファイル単位
 * 
 * @author Teruteru
 *
 */
public class ImageFileDAO extends AbstractFileDAO implements ImageDAO {
    private File base;
    private ArrayList<File> imageFileList = new ArrayList<>(4);
    private Random rand = null;
    private int count = 0;

    // private byte[] data=null;
    public ImageFileDAO() {
        this(new File("."));
    }

    public ImageFileDAO(File base) {
        this.base = base.getAbsoluteFile();
        init();
    }

    public ImageFileDAO(String base) {
        this(new File(base));
    }

    private void init() {
        File[] c = base.listFiles();
        int cnt = 0;
        for (File f : c) {
            imageFileList.add(f);
            cnt++;
        }
        System.out.printf("画像件数 : %d%n", cnt);
    }

    /**
     * (非 Javadoc)
     * 
     * @see com.twitter.teruteru128.imagemanager.dao.ImageDAO#getImageByOffset(int)
     */
    public Optional<BufferedImage> getImageByOffset(int p) {
        Optional<BufferedImage> rtc = Optional.empty();
        if (imageFileList.size() == 0) {
            init();
        }
        if (imageFileList.size() > p) {
            try {
                BufferedImage img = ImageIO.read(imageFileList.get(p));
                if (img != null) {
                    rtc = Optional.of(img);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rtc;
    }

    /**
     * (非 Javadoc)
     * 
     * @see com.twitter.teruteru128.imagemanager.dao.ImageDAO#getNextImage()
     */
    @Override
    public Optional<BufferedImage> getNextImage() {
        Optional<BufferedImage> rtc = Optional.empty();
        if (imageFileList.size() == 0) {
            init();
        }
        try {
            BufferedImage img = ImageIO.read(imageFileList.remove(1));
            if (img != null) {
                rtc = Optional.of(img);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rtc;
    }

    /**
     * (非 Javadoc)
     * 
     * @see com.twitter.teruteru128.imagemanager.dao.ImageDAO#getRandomImage()
     */
    @Override
    public Optional<BufferedImage> getRandomImage() {
        Optional<BufferedImage> rtc = Optional.empty();
        Random rand = this.rand;
        if (rand == null) {
            try {
                rand = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        this.rand = rand;
        if (imageFileList.size() == 0) {
            init();
        }
        try {
            int s = imageFileList.size();
            int next = rand.nextInt(s);
            File i = imageFileList.get(next);
            // System.out.println(i);
            BufferedImage img = ImageIO.read(i);
            if (img != null) {
                rtc = Optional.of(img);
            }
            System.out.printf("なのです！%d%n", ++count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rtc;
    }

    /**
     * 
     */
    public String getId(File f) {
        MessageDigest sha256 = null;
        // System.out.println("");
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }
        try (DigestInputStream din = new DigestInputStream(new FileInputStream(
                f), sha256)) {
            while (din.read() != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String id = DatatypeConverter.printHexBinary(sha256.digest());
        return id;
    }

    public BufferedImage getImage(File f) throws IOException {
        return ImageIO.read(f);
    }
}
