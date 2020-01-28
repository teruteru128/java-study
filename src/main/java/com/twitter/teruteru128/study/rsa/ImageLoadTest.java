package com.twitter.teruteru128.study.rsa;

import java.awt.image.ImageProducer;

class ImageLoadTest{
	public static void main(String[] args) throws Exception{
		// TODO リポジトリに入れられる画像
		var image = ClassLoader.getSystemResource("");
		var b = image.getContent();
		if (b instanceof ImageProducer) {
			ImageProducer a = (ImageProducer) image.getContent();
			System.out.println(a);
		}
	}
}
