package com.twitter.teruteru128.study.verisign.test1.step1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import com.twitter.teruteru128.study.verisign.CalcUtil;

/**
 * n > 2^d^2 (d\in \mathbb{Z})になる最大のd=45を使用
 * https://www.math.kyoto-u.ac.jp/~yukie/kojima-shuron.pdf
 */
public class Main {
	private static final long[] COEFFICIENT = { 13059432575421L, 35854406314518L, 17331828477071L, 13034327323742L,
			29514981607474L, 43445188776312L, 3142829599298L, 5460057595620L, 34527421678024L, 49393492009205L,
			40550988304495L, 25701092995268L, 6966123055549L, 27402022662977L, 8180294287490L, 15982263555793L,
			30364252058746L, 15771104626963L, 34340951834734L, 18379141503416L, 19494509807378L, 40100174645071L,
			16462821808731L, 30368112432793L, 9863951454481L, 23404881919283L, 37669794611020L, 22595159029663L,
			8003031153939L, 1764692752928L, 23371216285082L, 30597180133872L, 24109952539057L, 6062466143281L,
			38251774072999L, 19092807831160L, 9083060666127L, 14527227616768L, 32037266559191L, 36077235972286L,
			22377606219621L, 49679898511950L, 20449603096312L, 43620429879736L, 27L, 1L };

	public static void main(String[] args) {
		int d = 45;
		final BigInteger n = new BigInteger(
				"af240808297a359e600caae74b3b4edc7cbc3c451cbb2be0fe2902f95708a364851527f5f1adc831895d22e82aaaa642b38ff8b955b7b1b74bb3fe8f7e0757ecef43db66621561cf600da4d8def8e0c362083d5413eb49ca59548526e52b8f1b9febf5a191c23349d843636a524bd28fe870514dd189697bc770f6b3dc1274db7b5d4b56d396bf1577a1b0f4a225f2af1c926718e5f40604ef90b9e400e4dd3ab519ff02baf43ceee08beb378becf4d7acf2f6f03dafdd759133191d1c40cb7424192193d914feac2a52c78fd50449e48d6347883c6983cbfe47bd2b7e4fc595ae0e9dd4d143c06773e314087ee53f9f73b8330acf5d3f3487968aee53e82515",
				16);

		// calc ceiling(n^1/(45+1))
		int order = d + 1;
		// 46乗
		BigInteger m = BigInteger.valueOf(25049276210081L);
		// 45乗
		BigInteger m1 = BigInteger.valueOf(49721724815627L);
		BigInteger one = BigInteger.valueOf(1L);
		System.out.printf("pow(m, %d) : %d%n", order, m.pow(order));
		System.out.printf("n   : %d%n", n);
		System.out.printf("pow(m+1, %d) : %d%n", order, m.add(one).pow(order));
		System.out.println("--");
		System.out.printf("pow(m1, %d) : %d%n", d, m1.pow(d));
		System.out.printf("n   : %d%n", n);
		System.out.printf("pow(m1+1, %d) : %d%n", d, m1.add(one).pow(d));
		System.out.println("--");

		var list = getCoefficient(n, order, m);
		System.out.println(showUpList(list));
		var list1 = getCoefficient(n, 45, m1);
		System.out.println(showUpList(list1));
		Collections.reverse(list1);
		System.out.println(showUpList(list1));
		System.out.println("--");

		BigInteger sum = BigInteger.valueOf(0);
		BigInteger x_tmp = BigInteger.valueOf(1L);
		BigInteger tmp2;
		for (int i = 0; i < 46; i++) {
			tmp2 = x_tmp.multiply(list.get(45 - i));
			// System.out.println(tmp2);
			sum = sum.add(tmp2);
			x_tmp = x_tmp.multiply(m);
		}
		System.out.println(sum.equals(n));
		x_tmp = BigInteger.valueOf(1L);
		sum = BigInteger.valueOf(0);
		for (long l : COEFFICIENT) {
			tmp2 = x_tmp.multiply(BigInteger.valueOf(l));
			sum = sum.add(tmp2);
			x_tmp = x_tmp.multiply(m1);
		}
		System.out.printf("%d%n", n);
		System.out.printf("sum : %d%n", sum);
		System.out.printf("sum eq n is %b%n", sum.equals(n));
		System.out.printf("%d%n", n.divide(sum));
		System.out.printf("%d%n", sum.mod(n));
		sum = CalcUtil.f(m1, COEFFICIENT);
		System.out.printf("n   : %d%n", n);
		System.out.printf("sum : %d%n", sum);
		System.out.printf("sum eq n is %b%n", sum.equals(n));
		System.out.printf("n / sum = %d%n", n.divide(sum));
		System.out.printf("sum mod n = %d%n", n.mod(sum));
		System.out.printf("            %d%n", n.subtract(n.divide(sum).multiply(sum)));
	}

	private static String showUpList(List<BigInteger> list) {
		return list.stream().sequential().map(BigInteger::toString)
				.collect(() -> new StringJoiner("L, ", "{", "L}"), StringJoiner::add, (i, j) -> i.merge(j)).toString();
	}

	private static List<BigInteger> getCoefficient(BigInteger n, int d, final BigInteger m) {
		BigInteger zero = BigInteger.valueOf(0L);
		BigInteger one = BigInteger.valueOf(1L);
		ArrayList<BigInteger> list = new ArrayList<>();
		BigInteger tmp = n;

		for (BigInteger val = m.pow(d); tmp.compareTo(zero) >= 0 && val.compareTo(one) >= 0; val = val.divide(m)) {
			BigInteger[] dandr = tmp.divideAndRemainder(val);
			list.add(dandr[0]);
			tmp = dandr[1];
		}
		return list;
	}

}