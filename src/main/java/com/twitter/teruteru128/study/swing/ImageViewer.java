package com.twitter.teruteru128.study.swing;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

/**
 * @author Teruteru
 *
 */
public class ImageViewer extends JPanel {
    private static final long serialVersionUID = 0;

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
        this(layout,true);
    }

    /**
     * @param isDoubleBuffered
     */
    public ImageViewer(boolean isDoubleBuffered) {
        this(new FlowLayout(),isDoubleBuffered);
    }

    /**
     * @param layout
     * @param isDoubleBuffered
     */
    public ImageViewer(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

}
