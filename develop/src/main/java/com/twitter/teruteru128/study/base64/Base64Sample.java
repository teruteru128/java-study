package com.twitter.teruteru128.study.base64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author
 *
 */
public class Base64Sample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        var buffer = new byte[2048];
        var encoder = Base64.getMimeEncoder(76, System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        int length;
        try (var bin = new BufferedInputStream(System.in);
                var bout = new BufferedOutputStream(encoder.wrap(System.out))) {
            while ((length = bin.read(buffer, 0, buffer.length)) != -1) {
                bout.write(buffer, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
