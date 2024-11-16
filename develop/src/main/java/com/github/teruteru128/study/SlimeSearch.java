package com.github.teruteru128.study;

import com.github.teruteru128.util.function.TriPredicate;

import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.stream.LongStream;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;

@Command(name = "slime")
public class SlimeSearch implements Callable<Integer> {

    private static final TriPredicate func1 = (TriPredicate & Serializable) (seed, x, z) -> {
        long a = seed + (int) (x * 0x5ac0db) + (int) (x * x * 0x4c1906) + (int) (z * 0x5f24f)
                + (int) (z * z) * 0x4307a7L ^ 0x5E434E432L;
        int bits;
        int val;
        do {
            a = (a * 0x5deece66dL + 0xb) & 0xffffffffffffL;
            bits = (int) (a >>> 17);
            val = bits % 10;
        } while (bits - val + 9 < 0);
        return val == 0;
    };

    public Integer call() {
        var r = LongStream.range(10000000000L, 0x1000000000000L).parallel().filter(seed -> func1.test(seed, 128, -49))
                .filter(seed -> func1.test(seed, 128, -48)).filter(seed -> func1.test(seed, 128, -47))
                .filter(seed -> func1.test(seed, 128, -46)).filter(seed -> func1.test(seed, 128, -45))
                .filter(seed -> func1.test(seed, 129, -49)).filter(seed -> func1.test(seed, 129, -48))
                .filter(seed -> func1.test(seed, 129, -47)).filter(seed -> func1.test(seed, 129, -46))
                .filter(seed -> func1.test(seed, 129, -45))
                .filter(seed -> func1.test(seed, 130, -49)).filter(seed -> func1.test(seed, 130, -48)).peek(s->System.out.printf("peek: %d%n", s))
                .filter(seed -> func1.test(seed, 130, -47)).filter(seed -> func1.test(seed, 130, -46))
                .filter(seed -> func1.test(seed, 130, -45))
                .filter(seed -> func1.test(seed, 131, -49)).filter(seed -> func1.test(seed, 131, -48))
                .filter(seed -> func1.test(seed, 131, -47)).filter(seed -> func1.test(seed, 131, -46))
                .filter(seed -> func1.test(seed, 131, -45))
                .filter(seed -> func1.test(seed, 132, -49)).filter(seed -> func1.test(seed, 132, -48))
                .filter(seed -> func1.test(seed, 132, -47)).filter(seed -> func1.test(seed, 132, -46))
                .filter(seed -> func1.test(seed, 132, -45)).findAny();
        r.ifPresentOrElse(s->System.out.printf("seed: %d%n", s), ()->System.out.println("not found"));
        return ExitCode.OK;
    }
}
