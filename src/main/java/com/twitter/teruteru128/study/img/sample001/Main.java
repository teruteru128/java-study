package com.twitter.teruteru128.study.img.sample001;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import com.twitter.teruteru128.holders.SecureRandomHolder;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width = 1320;
		int height = 1320;
		Random random = SecureRandomHolder.getInstanceStrong();
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, random.nextInt(0x1000000));
			}
		}

		ImageWriter writer = ImageIO.getImageWritersByFormatName("png").next();
		ImageWriteParam param = writer.getDefaultWriteParam();
		param.setProgressiveMode(ImageWriteParam.MODE_DISABLED);

		File file = new File("out.png");
		try (ImageOutputStream ios = ImageIO
				.createImageOutputStream(new BufferedOutputStream(
						new FileOutputStream(file)))) {
			writer.setOutput(ios);
			writer.write(null, new IIOImage(image, null, null), param);
			writer.dispose();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
