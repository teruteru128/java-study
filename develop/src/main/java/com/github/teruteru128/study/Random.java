package com.github.teruteru128.study;

import java.util.Comparator;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Random {
    static void random2() {
        var feats = (101. / 64) * nextDouble(Factory.SECURE_RANDOM_GENERATOR) + 1;
        System.out.printf("%f feats, %f cm%n", feats, feats * 30.48);
        var milk = Math.pow(10, 4 + nextDouble(Factory.SECURE_RANDOM_GENERATOR));
        System.out.printf("%f ml, %f L%n", milk, milk / 1000);
    }

    static void random3() {
        var randomGeneratorFactory = RandomGeneratorFactory.all()
                .filter(rgf -> !rgf.name().equals("SecureRandom")).filter(rgf -> rgf.stateBits() >= 144).min(Comparator.comparingInt(RandomGeneratorFactory<RandomGenerator>::stateBits)).orElse(RandomGeneratorFactory.of("Random"));
        System.out.println(randomGeneratorFactory.name() + " in " + randomGeneratorFactory.group() + " was selected");
        var random = randomGeneratorFactory.create();
    }

    static void random4() {
        // SecureRandom has MAX_VALUE stateBits.
        RandomGeneratorFactory<RandomGenerator> best = RandomGeneratorFactory.all().filter(rgf -> !rgf.name().equals("SecureRandom")).max(Comparator.comparingInt(RandomGeneratorFactory<RandomGenerator>::stateBits)).orElse(RandomGeneratorFactory.of("Random"));
        System.out.println(best.name() + " in " + best.group() + " was selected");

        RandomGenerator rng = best.create();
        System.out.println(rng.nextLong());
    }

    /**
     * FIXME 乱数系ユーティリティクラス的な？ものに移動する
     *
     * @param random 乱数生成源
     * @return double
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 </a>
     */
    public static double nextDouble(RandomGenerator random) {
        // random Double
        long bits = random.nextLong();
        int exp = -Long.numberOfTrailingZeros(~(bits >>> 52));
        if (exp == -12) {
            long randomBits;
            do {
                randomBits = random.nextLong();
                exp -= Long.numberOfTrailingZeros(~randomBits);
            } while (randomBits == -1);
        }
        if ((bits & 0xfffffffffffffL) == 0 && random.nextBoolean()) {
            exp++;
        }
        return Double.longBitsToDouble(((long) (exp + 1022) << 52) | bits & 0xfffffffffffffL);
    }

    /**
     * @param random 乱数生成源
     * @see <a href="https://speakerdeck.com/hole/rand01">[0.0, 1.0) の乱数を得るための“本当の”方法 - speakerdeck</a>
     */
    static void doubleSample(RandomGenerator random) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000000; i++)
            nextDouble(random);
        long finish = System.nanoTime();
        System.out.printf("%f seconds%n", (finish - start) / 1e9);
        System.out.println(nextDouble(random));
    }
}
