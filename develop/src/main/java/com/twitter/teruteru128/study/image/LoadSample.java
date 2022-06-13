package com.twitter.teruteru128.study.image;

import java.awt.image.ImageProducer;
import java.util.concurrent.Callable;

public class LoadSample implements Callable<ImageProducer> {
    public ImageProducer call() throws Exception {
        // TODO リポジトリに入れられる画像
        return (ImageProducer) ClassLoader.getSystemResource("167887_p0.jpg").getContent();
    }
}
