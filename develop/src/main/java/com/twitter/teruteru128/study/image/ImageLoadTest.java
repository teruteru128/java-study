package com.twitter.teruteru128.study.image;

import java.awt.image.ImageProducer;

public class ImageLoadTest{
    public static void main(String[] args) throws Exception{
        // TODO リポジトリに入れられる画像
        var resource = ClassLoader.getSystemResource("167887.jpg");
        var obj = resource.getContent();
        if (obj instanceof ImageProducer) {
            ImageProducer producer = (ImageProducer) obj;
            System.out.println(producer);
        }
    }
}
