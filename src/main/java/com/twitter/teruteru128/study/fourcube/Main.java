package com.twitter.teruteru128.study.fourcube;

import java.security.SecureRandom;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long x, xLength, xMax;
        long y, yLength, yMax;
        long z, zLength, zMax;

        Random rnd = new SecureRandom();
        x = Math.abs(rnd.nextLong());
        y = rnd.nextLong();
        z = -Math.abs(rnd.nextLong());
        System.out.printf("%d, %d, %d%n", x, y, z);
        xLength = yLength = zLength = 0x100000000L;
        xMax = x + xLength;
        yMax = y + yLength;
        zMax = z + zLength;

        long sum = 0;
        for (; x < xMax; x++) {
            for (; y < yMax; y++) {
                for (; z < zMax; z++) {
                    sum = x * x * x + y * y * y + z * z * z;
                    if (-200 < sum && sum < 200) {
                        System.out.printf("%d, %d, %d, %d%n", sum, x, y, z);
                    }
                }
            }
        }
    }

}
