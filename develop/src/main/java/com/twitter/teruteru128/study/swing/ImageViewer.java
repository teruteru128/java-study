package com.twitter.teruteru128.study.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author Teruteru
 *
 */
public class ImageViewer extends JPanel {
    private final class JPanelExtension extends JPanel {
        private static final long serialVersionUID = 1L;

        

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        }
    }

    private static final long serialVersionUID = 0;
    private BufferedImage image;
    private JPanel canvas;

    /**
     * 
     */
    public ImageViewer() {
        this(true);
    }

    /**
     * @param layout
     */
    public ImageViewer(LayoutManager layout) {
        this(layout, true);
    }

    /**
     * @param isDoubleBuffered
     */
    public ImageViewer(boolean isDoubleBuffered) {
        this(new FlowLayout(), isDoubleBuffered);
    }

    public ImageViewer(BufferedImage img) {
        this();
        this.image = img;
        canvas = new JPanelExtension();
        canvas.add(new JButton("Currently I do nothing"));
        canvas.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        JScrollPane sp = new JScrollPane(canvas);
        setLayout(new BorderLayout());
        add(sp, BorderLayout.CENTER);
        
    }

    /**
     * @param layout
     * @param isDoubleBuffered
     */
    public ImageViewer(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

}
