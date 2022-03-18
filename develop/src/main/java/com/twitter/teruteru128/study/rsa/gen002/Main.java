package com.twitter.teruteru128.study.rsa.gen002;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.Callable;

public class Main implements Callable<Void> {

    public Void call() {
        File in = new File("out.asc");
        File out = new File("out2.txt");
        List<BigInteger> list = new ArrayList<BigInteger>(2);
        Base64.Decoder decoder = Base64.getDecoder();
        try (ObjectInputStream oin = new ObjectInputStream(
                decoder.wrap(new BufferedInputStream(new FileInputStream(in))))) {
            System.err.println("reading");
            Object o = oin.readObject();
            System.err.println("readed");
            if (o instanceof List<?>) {
                List<?> tmp = (List<?>) o;
                for (Object object : tmp) {
                    if (object instanceof BigInteger) {
                        list.add((BigInteger) object);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.err.println("ok?");
        System.err.println(list.size());
        for (BigInteger p : list) {
            System.out.println(p.bitLength());
        }
        // pが2ビット短い
        
        try (PrintStream stream = new PrintStream(out)) {
            for (BigInteger p : list) {
                stream.println(p);
                System.err.println("line!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
