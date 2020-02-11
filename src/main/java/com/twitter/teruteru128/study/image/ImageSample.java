package com.twitter.teruteru128.study.image;

import javax.imageio.ImageIO;

class ImageSample {

    public static void main(String[] args) {
        final var types = ImageIO.getWriterFormatNames();
        for (String type : types) {
            System.err.println(type);
        }
        final var mimes = ImageIO.getWriterMIMETypes();
        for (String mime : mimes) {
            System.err.println(mime);
        }
    }
}
