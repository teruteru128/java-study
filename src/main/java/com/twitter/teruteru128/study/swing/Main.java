package com.twitter.teruteru128.study.swing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        
        BufferedImage img = ImageIO.read(ClassLoader.getSystemResource("167887.jpg"));
        if (img != null) {
            JLabel l=new JLabel(new ImageIcon(img));
            jf.add(l);
        }
        jf.setVisible(true);
    }

}
