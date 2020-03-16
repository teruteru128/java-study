package com.twitter.teruteru128.study.verisign.test2.step2;

import java.math.BigInteger;

import com.twitter.teruteru128.study.rsa.util.Const;
import com.twitter.teruteru128.study.verisign.CalcUtil;

public class Main {

    public static final long[] COEFFICIENT = { 13059432575421L, 35854406314518L, 17331828477071L, 13034327323742L,
            29514981607474L, 43445188776312L, 3142829599298L, 5460057595620L, 34527421678024L, 49393492009205L,
            40550988304495L, 25701092995268L, 6966123055549L, 27402022662977L, 8180294287490L, 15982263555793L,
            30364252058746L, 15771104626963L, 34340951834734L, 18379141503416L, 19494509807378L, 40100174645071L,
            16462821808731L, 30368112432793L, 9863951454481L, 23404881919283L, 37669794611020L, 22595159029663L,
            8003031153939L, 1764692752928L, 23371216285082L, 30597180133872L, 24109952539057L, 6062466143281L,
            38251774072999L, 19092807831160L, 9083060666127L, 14527227616768L, 32037266559191L, 36077235972286L,
            22377606219621L, 49679898511950L, 20449603096312L, 43620429879736L, 27L, 1L };
    // 45乗根
    private static final BigInteger m = BigInteger.valueOf(49721724815627L);

    public static void main(String[] args) {
        final BigInteger n = Const.N;
        long min = -1036077235972286L;
        long max = 36077235972286L;
        long middle=0;
        BigInteger diff;
        BigInteger sum=BigInteger.valueOf(0L);
        long[] array = new long[] { 13059432575421L, 35854406314518L, 17331828477071L, 13034327323742L, 29514981607474L,
                43445188776312L, 3142829599298L, 5460057595620L, 34527421678024L, 49393492009205L, 40550988304495L,
                25701092995268L, 6966123055549L, 27402022662977L, 8180294287490L, 15982263555793L, 30364252058746L,
                15771104626963L, 34340951834734L, 18379141503416L, 19494509807378L, 40100174645071L, 16462821808731L,
                30368112432793L, 9863951454481L, 23404881919283L, 37669794611020L, 22595159029663L, 8003031153939L,
                1764692752928L, 23371216285082L, 30597180133872L, 24109952539057L, 6062466143281L, 38251774072999L,
                19092807831160L, 9083060666127L, 14527227616768L, 32037266559191L, -36077235972286L, 22377606219621L,
                -49763551119304L, 20449603096314L, -6101294935891L, 28L, 1L };
        // 6101294935891mod7 = 1
        int flag = 0;
        int index = 39;
        System.out.println(array[index]);
        array[index] = min;
        sum = CalcUtil.f(m, array);
        System.out.printf("sum - n = %d%n", sum.subtract(n));
        array[index] = max;
        sum = CalcUtil.f(m, array);
        System.out.printf("sum - n = %d%n", sum.subtract(n));
        for (int i = 0; i < 100; i++) {
            System.out.printf("min = %d, max = %d%n", min, max);
            middle = (max + min) / 2;
            array[index] = middle;
            sum = CalcUtil.f(m, array);
            diff = sum.subtract(n);
            flag = diff.compareTo(BigInteger.valueOf(0));
            if (flag == 0) {
                break;
            } else if (flag > 0) {
                max = middle;
            } else if (flag < 0) {
                min = middle;
            }
        }
        System.out.printf("min : %d%n", min);
        System.out.printf("max : %d%n", max);
        System.out.printf("mid : %d%n", middle);
        System.out.printf("n   : %d%n", n);
        System.out.printf("sum : %d%n", sum);
        System.out.printf("sum - n = %d%n", sum.subtract(n));
    }

}
