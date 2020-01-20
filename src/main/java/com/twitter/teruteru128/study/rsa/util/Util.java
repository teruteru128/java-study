package com.twitter.teruteru128.study.rsa.util;

import java.math.BigInteger;

/**
 * @author Teruteru
 *
 */
public class Util {

	/**
	 * 
	 */
	private Util() {
	}

	public static final BigInteger N = new BigInteger("af240808297a359e600caae74b3b4edc7cbc3c451cbb2be0fe2902f95708a364851527f5f1adc831895d22e82aaaa642b38ff8b955b7b1b74bb3fe8f7e0757ecef43db66621561cf600da4d8def8e0c362083d5413eb49ca59548526e52b8f1b9febf5a191c23349d843636a524bd28fe870514dd189697bc770f6b3dc1274db7b5d4b56d396bf1577a1b0f4a225f2af1c926718e5f40604ef90b9e400e4dd3ab519ff02baf43ceee08beb378becf4d7acf2f6f03dafdd759133191d1c40cb7424192193d914feac2a52c78fd50449e48d6347883c6983cbfe47bd2b7e4fc595ae0e9dd4d143c06773e314087ee53f9f73b8330acf5d3f3487968aee53e82515",
			16);
	public static final BigInteger SQRT_N = new BigInteger("d3bec5aeca3c61e8153ec9ddedce02f592a7c573001df67d126a6104eaa1f2ea273a09127aa45b847dbee14d614eba76", 16);
}
