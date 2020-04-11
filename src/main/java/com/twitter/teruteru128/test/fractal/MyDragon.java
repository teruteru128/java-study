package com.twitter.teruteru128.test.fractal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MyDragon extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = -2048631421451456838L;

    public MyDragon() {
        super("Dragon");
        setBackground(Color.green);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void drawDragon(Graphics g, int n) {
        if (n == 0)
            return;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawDragon(g, 10);
    }

    public static void main(String[] args) {
        MyDragon dragon = new MyDragon();
        dragon.setVisible(true);
    }

}
