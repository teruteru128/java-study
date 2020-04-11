package com.twitter.teruteru128.test.applet;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * */
public class TestApplet extends Applet {

    /**
     * 
     */
    private static final long serialVersionUID = 1373082952582725339L;

    @Override
    public void init() {
        System.out.println("init()ですぅ～");
    }

    @Override
    public void start() {
        System.out.println("start()ですぅ～");
        // this.repaint();
    }

    @Override
    public void stop() {
        System.out.println("stop()ですぅ～");
    }

    @Override
    public void repaint(){
        super.repaint();
        System.out.println("repaint()ですぅ～");
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint(Graphics g)ですぅ～");
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        System.out.println("update(Graphics g)ですぅ～");
    }

    @Override
    public void destroy() {
        System.out.println("destoroy()ですぅ～");
        super.destroy();
    }
}
