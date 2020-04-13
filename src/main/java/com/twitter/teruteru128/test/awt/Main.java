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
        Frame f = new Main("frame");
        int width = 600;
        int height = 400;
        f.setBounds(660, 50, width, height);
        WinAdapter adapter = new WinAdapter(f);
        f.addWindowFocusListener(adapter);
        f.addWindowStateListener(adapter);
        f.addWindowListener(adapter);
        CoAdapter adapter2 = new CoAdapter();
        f.addComponentListener(adapter2);
        f.setVisible(true);
    }

}
