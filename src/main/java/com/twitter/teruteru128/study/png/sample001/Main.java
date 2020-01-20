package com.twitter.teruteru128.study.png.sample001;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		if (args.length != 3) {
			printHelp();
			return;
		}
		Path origin = Paths.get(args[0]).toAbsolutePath();
		Path newer = Paths.get(args[1]).toAbsolutePath();
		Path out = Paths.get(args[2]).toAbsolutePath();

		BufferedImage origin_img = ImageIO.read(origin.toFile());
		BufferedImage newer_img = ImageIO.read(newer.toFile());
		int origin_width = origin_img.getWidth();
		int origin_height = origin_img.getHeight();
		int newer_width = newer_img.getWidth();
		int newer_height = newer_img.getHeight();
		if (origin_width != newer_width || origin_height != newer_height) {
			System.out
					.println("The size of the image is different original and newer.");
			return;
		}
		BufferedImage diff = new BufferedImage(origin_img.getWidth(),
				origin_img.getHeight(), BufferedImage.TYPE_INT_ARGB);

		int color_o = 0;
		int color_n = 0;
		for (int x = 0; x < origin_width; x++) {
			for (int y = 0; y < origin_height; y++) {
				color_o = origin_img.getRGB(x, y);
				color_n = newer_img.getRGB(x, y);
				diff.setRGB(x, y, color_o == color_n ? 0x00000000 : color_n);
			}
		}
		ImageIO.write(diff, "PNG", out.toFile());
	}

	/**
	 * 
	 */
	private static void printHelp() {
		System.out.println("args : origin new out");
	}
}
