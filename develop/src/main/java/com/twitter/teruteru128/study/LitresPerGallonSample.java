package com.twitter.teruteru128.study;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class LitresPerGallonSample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // litres par gallon
        double lpg = 3.785412;
        SecureRandom random = SecureRandom.getInstanceStrong();
        double sumOfGallons = 0D;
        for (int i = 0; i < 5; i++) {
            double gallons = 1d + random.nextDouble() * 2D;
            sumOfGallons += gallons;
            System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        }
        double gallons = 3d + random.nextDouble() * 0.1D;
        sumOfGallons += gallons;
        System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        System.out.printf("sum : %f gallons, %f litres%n", sumOfGallons, sumOfGallons * lpg);
    }
}
