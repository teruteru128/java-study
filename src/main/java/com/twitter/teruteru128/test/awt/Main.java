package com.twitter.teruteru128.test.awt;

import java.awt.Frame;
import java.awt.GraphicsConfiguration;

/**
 * @author
 *
 */
public class Main extends Frame {
    /**
     * */
    private static final long serialVersionUID = 0;

    public Main() {
        super();
    }

    public Main(String title) {
        super(title);
    }

    public Main(GraphicsConfiguration gc) {
        super(gc);
    }

    public Main(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Frame f = new Frame("frame");
        f.addWindowListener(new WinAdapter(f));
        f.setVisible(true);
    }

}
