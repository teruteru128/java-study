package com.twitter.teruteru128.study.dragon;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.LinkedList;

/**
 * @author teruteru128
 *
 */
public class Main {
    private static int x;
    private static int y;
    private static double radian;
    private static final double RIGHT_ANGLE = Math.PI / 2;

    public static void main(String[] args) {
        String src = build(26);
        System.out.printf("%d%n",src.length());
        /*
        char[] array = src.toCharArray();
        char tmp;
        int length = array.length;
        System.out.println("stacked.");

        BufferedImage image = new BufferedImage(3000, 2000,
                BufferedImage.TYPE_INT_ARGB);
        x = 1900;
        y = 1100;
        int l = 3;
        Graphics2D g2 = image.createGraphics();
        Color transparency = new Color(255, 255, 255, 0);
        g2.setBackground(transparency);
        g2.setPaint(transparency);
        g2.fillRect(0, 0, image.getWidth(), image.getHeight());
        g2.setPaint(Color.BLACK);

        lt(RIGHT_ANGLE);
        for (int i = 0; i < length; i++) {
            tmp = array[i];
            switch (tmp) {
            case '+':
                lt(RIGHT_ANGLE);
                fd(g2, l);
                break;
            case '-':
                rt(RIGHT_ANGLE);
                fd(g2, l);
                break;
            default:
                break;
            }
        }
        try {
            ImageIO.write(image, "PNG", new File("output.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }

    public static void stackDragon(LinkedList<Direction> stack, int length) {
        String d = "FX";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (char c : d.toCharArray()) {
                switch (c) {
                case 'X':
                    b.append("X+YF");
                    break;
                case 'Y':
                    b.append("FX-Y");
                    break;
                default:
                    b.append(c);
                    break;
                }
            }
            d = b.toString();
            b.delete(0, b.length());
        }
        for (char c : d.toCharArray()) {
            switch (c) {
            case '+':
                stack.add(Direction.LEFT);
                break;
            case '-':
                stack.add(Direction.RIGHT);
                break;
            default:
                break;
            }
        }
    }

    public static String build(int length) {
        String d = "FX";
        StringBuilder b = new StringBuilder();
        char[] tmp1 = null;
        int tmpl;
        char tmpChar = '\0';
        for (int i = 0; i < length; i++) {
            tmp1 = d.toCharArray();
            tmpl = tmp1.length;
            for (int j = 0; j < tmpl; j++) {
                tmpChar = tmp1[j];
                switch (tmpChar) {
                case 'X':
                    b.append("X+YF");
                    break;
                case 'Y':
                    b.append("FX-Y");
                    break;
                default:
                    b.append(tmpChar);
                    break;
                }
            }
            d = b.toString();
            b.delete(0, b.length());
        }
        return d;
    }

    /**
     * 直進する
     * 
     * @param g2
     * @param length
     * */
    public static void fd(Graphics2D g2, int length) {
        int current_x = x;
        int current_y = y;
        int x = current_x + (int) (length * Math.cos(Main.radian));
        int y = current_y + (int) (length * Math.sin(Main.radian));
        Line2D.Double line = new Line2D.Double(current_x, current_y, x, y);
        g2.draw(line);
        Main.x = (int) line.x2;
        Main.y = (int) line.y2;
    }

    /** 右折する */
    public static void rt(double radian) {
        Main.radian = Main.radian + radian;
    }

    /** 左折する */
    public static void lt(double radian) {
        rt(-radian);
    }
}