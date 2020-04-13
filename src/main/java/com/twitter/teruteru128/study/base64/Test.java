package com.twitter.teruteru128.study.base64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @author
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte[] buffer = new byte[2048];
        Base64.Encoder encoder = Base64.getMimeEncoder(76, System.lineSeparator().getBytes(Charset.forName("UTF-8")));
        int readed_length;
        try (BufferedInputStream bin = new BufferedInputStream(System.in);BufferedOutputStream bout = new BufferedOutputStream(encoder.wrap(System.out))) {
            while((readed_length = bin.read(buffer,0,buffer.length)) != -1){
                bout.write(buffer, 0, readed_length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
