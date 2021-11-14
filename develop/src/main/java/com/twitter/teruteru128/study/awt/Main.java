package com.twitter.teruteru128.study.awt;

/**
 * @author
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        var f = new MainFrame("frame");
        var x = 660;
        var y = 50;
        var width = 600;
        var height = 400;
        f.setBounds(x, y, width, height);
        var adapter = new WinAdapter(f);
        f.addWindowFocusListener(adapter);
        f.addWindowStateListener(adapter);
        f.addWindowListener(adapter);
        var coadapter = new CoAdapter();
        f.addComponentListener(coadapter);
        f.setVisible(true);
    }

}
