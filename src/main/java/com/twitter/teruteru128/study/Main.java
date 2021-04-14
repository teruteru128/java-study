package com.twitter.teruteru128.study;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("/home/teruteru128/git/study/src/262144bit-initialValue2.txt");
        var lines = Files.readAllLines(file.toPath());
        var base = new BigInteger(lines.get(0), 16).add(BigInteger.valueOf(52269));
        System.out.println(base.bitLength());
        System.out.println(base.isProbablePrime(1));
    }
}
