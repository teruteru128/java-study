package com.twitter.teruteru128.study.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.SecureRandom;

import javax.imageio.ImageIO;

public class RandomImageOutputSample1 implements Runnable {

    @Override
    public void run() {
        final var img = new BufferedImage(1920, 1080, BufferedImage.TYPE_3BYTE_BGR);
        final var g = img.getGraphics();
        SecureRandom random = new SecureRandom();
        for (var x = 0; x < 1920; x++) {
            for (var y = 0; y < 1080; y++) {
                int red = random.nextInt(128) + 64;
                int green = random.nextInt(128) + 64;
                int blue = random.nextInt(128) + 64;
                Color color = new Color(red, green, blue);
                g.setColor(color);
                g.fillRect(x, y, 1, 1);
            }
        }
        g.dispose();
        try {
            ImageIO.write(img, "png", System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RandomImageOutputSample1());
        thread.start();
    }
}
