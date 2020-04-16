package com.twitter.teruteru128.study;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

class SerializeTest {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(Base64.getEncoder().wrap(baos))) {
            oos.writeObject(new SerialSample());
        }
        System.out.write(baos.toByteArray());
        System.out.println();
    }
}
