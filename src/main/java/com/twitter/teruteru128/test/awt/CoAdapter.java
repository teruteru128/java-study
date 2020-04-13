package com.twitter.teruteru128.test.awt;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class CoAdapter extends ComponentAdapter {

    @Override
    public void componentHidden(ComponentEvent e) {
        super.componentHidden(e);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        super.componentMoved(e);
        var component = e.getComponent();
        System.out.printf("x : %d, y : %d%n", component.getX(), component.getY());
    }

    @Override
    public void componentResized(ComponentEvent e) {
        super.componentResized(e);
        var component = e.getComponent();
        System.out.printf("w : %d, h : %d%n", component.getWidth(), component.getHeight());
    }
}
