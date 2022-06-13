package com.twitter.teruteru128.study.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.Callable;

import javax.imageio.ImageIO;

public class CreateSample implements Callable<Void> {
  @Override
  public Void call() throws Exception {
    var img = new BufferedImage(1920, 1080, BufferedImage.TYPE_3BYTE_BGR);
    var g = img.createGraphics();
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, 1920, 1080);
    var random = new SecureRandom();
    g.setColor(Color.WHITE);
    for (int i = 0; i < 16; i++) {
      g.fillRect(random.nextInt(1919), random.nextInt(1079), 2, 2);
    }
    g.dispose();
    ImageIO.write(img, "png", new File("out_207360_" + new Random().nextInt(16777216) + ".png"));
    return null;
  }
}
