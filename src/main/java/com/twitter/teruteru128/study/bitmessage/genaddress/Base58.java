package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.util.Arrays;

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
     * @see https://github.com/bitcoin/bitcoin/blob/99813a9745fe10a58bedd7a4cb721faf14f907a4/src/base58.cpp#L87
     */
    public String encode(byte[] b) {

        StringBuilder r = new StringBuilder();
        //BigInteger d = new BigInteger(1, b);
        //while (d.compareTo(ZERO) > 0) {
        //    BigInteger[] dar = d.divideAndRemainder(BASE);
        //    char c = ALPHABET[dar[1].intValue()];
        //    r.append(c);
        //    d = dar[0];
        //}
        int zeros = 0;
        int length = 0;
        int i = 0;
        int blen = b.length;
        while (i < blen && b[i] == 0) {
            i++;
            zeros++;
        }
        System.out.printf("zeros : %d%n", zeros);
        int size = blen * 138 / 100 + 1; // log(256) / log(58), rounded up.
        byte[] b58 = new byte[size];
        while (i < blen) {
            int c = b[i];
            int j = 0;
            for (int k = size - 1; (c != 0 || j < length) && (k > 0); k--, j++) {
                c += 256 * (b58[k] & 0xff);
                b58[k] = (byte) (c % 58);
                c /= 58;
            }
            assert (c == 0);
            length = j;
            i++;
        }

        int j = 0;
        while (j < size && b58[j] == 0) {
            j++;
        }
        r= new StringBuilder(zeros + (size - j));
        for(int k =0; k<zeros;k++){
            r.append('1');
        }
        while(j < size){
            r.append(ALPHABET[b58[j++]]);
        }
        return r.toString();
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
        if (bytes[0] == 0 && (bytes[1] & 0x80) == 0x80) {
            bytes = Arrays.copyOfRange(bytes, 1, bytes.length);
        }
        return bytes;
    }

}
