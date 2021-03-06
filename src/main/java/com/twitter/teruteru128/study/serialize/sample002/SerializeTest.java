package com.twitter.teruteru128.study.serialize.sample002;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializeTest {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(Base64.getEncoder().wrap(baos))) {
            oos.writeObject(new SerialSample());
        }
        System.out.write(baos.toByteArray());
        System.out.println();
    }
}
