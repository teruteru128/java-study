package com.twitter.teruteru128.fractal.dragon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dragon extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = -7292385115212719213L;

    public static void main(String... args) {
        JFrame f = new JFrame();
        f.setBackground(Color.yellow);
        f.setBounds(0, 0, 800, 600);
        f.add(new Dragon());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void init() {
        setBackground(Color.yellow);
    }

    public void paint(Graphics g) {

        // 出発点となる一対の点を指定します
        Point P = new Point(100, 100);
        Point Q = new Point(500, 500);

        // 対となる二点の間にドラゴン曲線を描きます
        g.setColor(Color.blue);
        drawDragon(g, P, Q, 14);
    }

    // ドラゴン曲線を描くメソッド
    public void drawDragon(Graphics g, Point a, Point b, int n) {

        Point c = new Point();

        int xx, yy;
        xx = b.x - a.x;
        yy = -(b.y - a.y);

        c.x = a.x + (xx + yy) / 2;
        c.y = b.y + (xx + yy) / 2;

        // 最後なので、実際に線を引きます
        if (n <= 0) {
            g.drawLine(a.x, a.y, c.x, c.y); // 点Aから点Cへ
            g.drawLine(b.x, b.y, c.x, c.y); // 点Bから点Cへ
        }
        // 最後ではないので、さらにメソッドを呼び出します（再帰処理）
        else {
            drawDragon(g, a, c, n - 1); // 点Aから点Cへ
            drawDragon(g, b, c, n - 1); // 点Bから点Cへ
        }
    }
}