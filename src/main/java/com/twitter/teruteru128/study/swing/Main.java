package com.twitter.teruteru128.study.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.h2.jdbcx.JdbcDataSource;

/**
 * @author Teruteru
 *
 */
public class Main {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        JFrame jf = new JFrame("jframe");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        BufferedImage img = ImageIO.read(new File("167887.jpg"));
        if (img != null) {
            JLabel l=new JLabel(new ImageIcon(img));
            jf.add(l);
        }
        jf.setVisible(true);
    }

}
