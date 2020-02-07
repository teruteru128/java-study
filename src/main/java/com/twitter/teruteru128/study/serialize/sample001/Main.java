package com.twitter.teruteru128.study.serialize.sample001;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
        try (ObjectOutputStream oos = new ObjectOutputStream(stream = new ByteArrayOutputStream())) {
            oos.writeObject(new Serializable() {
                private static final long serialVersionUID = 1L;
            });
            oos.writeObject((Runnable & Serializable) () -> {
                System.out.println("うんこー！");
            });
        }
        try (ObjectInputStream oin = new ObjectInputStream(new ByteArrayInputStream(stream.toByteArray()))) {
            Serializable serializable = null;
            for (int i = 0; i < 4 && (serializable = (Serializable) oin.readObject()) != null; i++) {
                System.out.printf("%s, %s%n", serializable, serializable.getClass());
                if (serializable instanceof Runnable) {
                    Runnable r = (Runnable) serializable;
                    r.run();
                }
                if (serializable instanceof Callable<?>) {
                    Callable<?> r = (Callable<?>) serializable;
                    var k = r.call();
                    if (k instanceof String) {
                        System.out.println(k);
                    }
                }
            }
        }
    }

}
