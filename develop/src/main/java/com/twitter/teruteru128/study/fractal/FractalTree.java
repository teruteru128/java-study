package com.twitter.teruteru128.study.fractal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FractalTree extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 4474379289378621724L;

    public FractalTree() {
        super("Fractal Tree");
        setBounds(0, 0, 800, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0)
            return;
        //線を結ぶ先を決定
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 2.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 2.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        drawTree(g, 400, 500, -90, 20);
    }

    public static void main(String[] args) {
        new FractalTree().setVisible(true);
    }
}