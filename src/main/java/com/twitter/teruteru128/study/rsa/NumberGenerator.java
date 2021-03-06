package com.twitter.teruteru128.study.rsa;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    public NumberGenerator() {
    }

    public static void main(String[] args) {
        File out = new File("out.bin");
        Base64.Encoder encoder = Base64.getEncoder();
        NumberGenerator generator = new NumberGenerator();
        List<BigInteger> list = generator.generateNumber();
        try (ObjectOutputStream oos = new ObjectOutputStream(
                encoder.wrap(new BufferedOutputStream(new FileOutputStream(out))))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BigInteger> generateNumber(Random rnd){
        BigInteger p = new BigInteger(1 << 26, rnd).setBit(0);
        BigInteger q = new BigInteger(1 << 26, rnd).setBit(0);
        List<BigInteger> list = List.of(p, q);
        return list;
    }

    public List<BigInteger> generateNumber(){
        SecureRandom rnd = null;
        try {
            rnd = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            rnd = new SecureRandom();
        }
        return generateNumber(rnd);
    }

}
