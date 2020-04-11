package com.twitter.teruteru128.test.awt;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinAdapter extends WindowAdapter {
    private Window w;

    public WinAdapter(Window w) {
        this.w = w;
    }

    public void windowClosing(WindowEvent e) {
        w.dispose();
    }
}