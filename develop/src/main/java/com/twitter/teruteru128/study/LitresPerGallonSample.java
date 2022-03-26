package com.twitter.teruteru128.study;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/**
 * 
 */
public class LitresPerGallonSample implements Callable<Void> {

    /**
     * 
     */
    public Void call() throws NoSuchAlgorithmException {
        // litres par gallon
        double lpg = 3.785412;
        SecureRandom random = SecureRandom.getInstanceStrong();
        double sumOfGallons = 0D;
        for (int i = 0; i < 5; i++) {
            var gallons = random.nextDouble(1, 3);
            sumOfGallons += gallons;
            System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        }
        var gallons = random.nextDouble(3, 3.125);
        sumOfGallons += gallons;
        System.out.println("--");
        System.out.printf("%f gallons, %f litres%n", gallons, gallons * lpg);
        System.out.printf("sum : %f gallons, %f litres%n", sumOfGallons, sumOfGallons * lpg);
        return null;
    }
}
