package com.twitter.teruteru128.study.swing;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.Callable;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 * @author Teruteru
 *
 */
public class SwingStudy implements Callable<Void> {

    private Path imagePath;

    public SwingStudy() {
        this(null);
    }

    public SwingStudy(Path path) {
        this.imagePath = path;
    }

    /**
     * @param args
     * @throws IOException
     */
    public Void call() throws IOException {
        JFrame jf = new JFrame("jframe");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        BufferedImage img = null;
        if (imagePath == null) {
            img = ImageIO.read(ClassLoader.getSystemResource("167887_p0.jpg"));
        } else {
            img = ImageIO.read(imagePath.toUri().toURL());
        }
        if (img != null) {
            jf.setContentPane(new ImageViewer(img));
        }
        jf.setVisible(true);
        return null;
    }

}
