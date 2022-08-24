package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.bouncycastle.pqc.math.linearalgebra.BigIntUtils;

import com.twitter.teruteru128.study.bitmessage.KeyPair;
import com.twitter.teruteru128.study.bitmessage.KeyPairComparator;

/**
 * Main
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<BigInteger> list = new ArrayList<>(2);
        try (ObjectInputStream oin = new ObjectInputStream(Base64.getDecoder()
                .wrap(new BufferedInputStream(new FileInputStream(new File("../../memo/out.asc")))))) {
            Object o = oin.readObject();
            if (o instanceof List<?>) {
                List<?> l = (List<?>) o;
                for (Object object : l) {
                    if (object instanceof BigInteger) {
                        BigInteger i = (BigInteger) object;
                        list.add(i);
                    }
                }
            }
        }
        System.out.printf("%x%n", list.get(0).multiply(list.get(1)).bitLength());
    }
}
