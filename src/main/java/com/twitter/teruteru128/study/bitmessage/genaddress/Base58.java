package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;

public class Base58 {

    private static final char[] ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
    private static final char ENCODED_ZERO = ALPHABET[0];
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger BASE = BigInteger.valueOf(58);

    public Base58() {

    }

    /**
     * 文字列をBase58エンコードして返す
     * 
     * @param str word(文字列)
     * @return encoded word(エンコードした文字列)
     */
    public String encode(byte[] b) {

        BigInteger d = new BigInteger(1, b);
        StringBuilder r = new StringBuilder();
        while(d.compareTo(ZERO) > 0){
            BigInteger[] dar = d.divideAndRemainder(BASE);
            char c = ALPHABET[dar[1].intValue()];
            r.append(c);
            d = dar[0];
        }

        return r.reverse().toString();
    }

    /**
     * エンコードされた文字列をBase58デコードして返す
     * 
     * @param encoded word(エンコードした文字列)
     * @return original word(元の文字列)
     */
    public byte[] decode(String str) {

        BigInteger decimal = BigInteger.valueOf(0);

        // 10進数に戻す
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char temp_c = chars[i];

            int index_num = 0;
            for (int j = 0; j < ALPHABET.length; j++) {
                if (ALPHABET[j] == temp_c) {
                    index_num = j;
                }
            }

            decimal = decimal.multiply(BASE).add(BigInteger.valueOf(index_num));
        }

        byte[] bytes = decimal.toByteArray();
        if(bytes[0] == 0 && (bytes[1] & 0x80) == 0x80){
            bytes = Arrays.copyOfRange(bytes, 1, bytes.length);
        }
        return bytes;
    }

}
