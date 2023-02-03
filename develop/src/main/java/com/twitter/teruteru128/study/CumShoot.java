package com.twitter.teruteru128.study;

import java.util.List;
import java.util.random.RandomGenerator;

public class CumShoot {
    public static void main(String[] args) {
        var generator = RandomGenerator.of("SecureRandom");
        var list = List.<WantToCum>of(CumShoot::wanttocum1, CumShoot::wanttocum2, CumShoot::wanttocum3);
        double milk = 0;
        long milklong = 0;
        for (WantToCum wantToCum : list) {
            milk = wantToCum.cum(generator);
            System.out.printf("精液%fリットル射精してえ……%n", milk);
            milklong = Double.doubleToLongBits(milk);
            System.out.printf("0x%016x%n", milklong);
        }
        System.out.printf("精液%fリットル射精してえ……%n", Double.longBitsToDouble(0x40e0000000000000l));
    }

    static double wanttocum1(RandomGenerator generator) {
        return generator.nextDouble(32768);
    }

    static double wanttocum2(RandomGenerator generator) {
        return Double.longBitsToDouble(generator.nextLong(1l << 52) | (14 + 1023L) << 52);
    }

    static double wanttocum3(RandomGenerator generator) {
        var milk = Math.fma(generator.nextGaussian(), 8192, 24576);
        if (milk > 0) {
            return milk;
        }
        if (milk < 0) {
            return -milk;
        }
        // milk == 0
        return 1 - generator.nextDouble();
    }
}
