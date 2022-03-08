package com.twitter.teruteru128.awt;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyAdapter extends WindowAdapter {
    private Window w;

    public MyAdapter(Window w) {
        this.w = w;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        w.dispose();
    }
}
