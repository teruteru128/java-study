package com.twitter.teruteru128.study.awt;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;

class MainFrame extends Frame
{
    /**
     * */
    private static final long serialVersionUID = 0;

    public MainFrame(String title) {
        super(title);
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
}
