package com.twitter.teruteru128.study.base64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.Callable;

/**
 * @author
 *
 */
public class Base64Sample implements Callable<Void> {

    /**
     * @return null
     */
    public Void call() throws IOException {
        var buffer = new byte[2048];
        var encoder = Base64.getMimeEncoder(76, System.lineSeparator().getBytes());
        int length;
        try (var bin = new BufferedInputStream(System.in);
                var bout = new BufferedOutputStream(encoder.wrap(System.out))) {
            while ((length = bin.read(buffer, 0, buffer.length)) != -1) {
                bout.write(buffer, 0, length);
            }
        }
        return null;
    }

}
