package com.twitter.teruteru128.bitmessage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * StreamTest
 */
public class StreamTest {

    public static void main(String[] args) throws IOException {
        ArrayList<byte[]> list = new ArrayList<>(67108864);
        try (RandomAccessFile file = new RandomAccessFile(new File("publicKeys.bin"), "r")) {
            byte[] buf = new byte[65];
            while (file.read(buf) != -1) {
                list.add(buf.clone());
            }
        }
        //list.stream().map(PublicKey::new);
        System.out.println(list.size());
    }

}
