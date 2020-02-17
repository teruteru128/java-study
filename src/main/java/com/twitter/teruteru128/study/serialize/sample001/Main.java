package com.twitter.teruteru128.study.serialize.sample001;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream stream = null;
        var encoder = Base64.getEncoder();
        var decoder = Base64.getDecoder();
        List<Serializable> objects = new ArrayList<>();
        objects.add((Runnable & Serializable) () -> {
            System.out.println("うんこー！");
        });
        objects.add((Serializable & Callable<?>) () -> "うんこー！");
        objects.add((Serializable & Callable<?>) () -> LocalDateTime.now());
        try (ObjectOutputStream oos = new ObjectOutputStream(encoder.wrap(stream = new ByteArrayOutputStream()))) {
            oos.writeInt(objects.size());
            for (Serializable serializable : objects) {
                oos.writeObject(serializable);
            }
        }
        stream.writeTo(System.out);
        System.out.println();
        try (ObjectInputStream oin = new ObjectInputStream(
                decoder.wrap(new ByteArrayInputStream(stream.toByteArray())))) {
            int num = oin.readInt();
            for (int i = 0; i < num; i++) {
                Serializable serializable = (Serializable) oin.readObject();
                if (serializable instanceof Runnable) {
                    Runnable r = (Runnable) serializable;
                    r.run();
                }
                if (serializable instanceof Callable<?>) {
                    Callable<?> r = (Callable<?>) serializable;
                    var k = r.call();
                    if (k instanceof String) {
                        System.out.println((String) k);
                    } else {
                        System.out.println(k);
                    }
                }
            }
        }
    }

}
