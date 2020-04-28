package com.twitter.teruteru128.study;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import jakarta.xml.bind.DatatypeConverter;

// TODO 将来的にエントリポイントをこのクラス一つにする
// TODO コマンドライン引数の実装方法
// TODO 設定ファイルの実装方法 Propaties XML JSON YAML
/**
 * Main
 * 
 * @see https://www.nicovideo.jp/watch/sm36666595
 * @see https://youtu.be/UbwW7iNsluo
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH-mm-ss");
        //System.out.println(formatter.format(LocalDateTime.now()));
        String in = "1100101111111100110011011010110110110000111110101100111011001111101001001100111010111011110001011011011011001000101001001100000010100100111011011010010010100110101001001010101100001010101110111111111010110111110101111010010011001110101111111100101110100100110011111100111010110001101001001101111010100100110000111010010010111111101001001101111010100100110111100000101011001110101100011011110011101001110010001101011011000101110001011100111111000011101001001100111010110010101110111010010011001111000010101010010011100010101001001010011011001010101110011010010010110011101001001010100010100100110011111010010010110111101001001100101010100100101001000000101011000110101110111011001010111101101110111101010110100100110011111100111010100010110010101101011010100100110000111010010010111111110100001101011000001010101110111101001010100100101011001011110111110101101001001011000110100100111100101011100011000110101001001111001110100100110001111010010010100100101001001110101100001010";
        byte[] b = in.getBytes();
        int len = in.length();
        byte[] a = new byte[len / 8];
        for(int i = 0; i < len;i++){
            a[i/8] |= (b[i] & 0x01) << (7 - (i % 8));
        }
        Charset eucjp = Charset.forName("EUC-JP");
        Charset sjis = Charset.forName("Shift-JIS");
        Charset utf8 = StandardCharsets.UTF_8;
        System.out.print(new String(a, eucjp));
        String in2 = "1011101111100100101001001100111110100100101000101010010011001010101001001011111110100100111100101100001011010100101001001100001110100100110001101010010010100100101001001101111010100100101110011010000110100011";
        b = in2.getBytes();
        len = in2.length();
        a = new byte[len/8];
        for(int i = 0; i < len;i++){
            a[i/8] |= (b[i] & 0x01) << (7 - (i % 8));
        }
        System.out.print(new String(a, eucjp));
        System.out.println(0x01343d10);
        System.out.println(new String("遘√ｏ豁､蜃ｦ縺ｫ繧舌◆\n繧医￥隕九▽縺代∪縺励◆縺ｭ".getBytes(sjis), utf8));
        // ポケベル
        // 0720
        String c = "00079700";
        // ふつかつよてい
        String d = "63432143854412";
        String e = "01343d10";
        System.out.println(c);
        System.out.println(d);
        System.out.println(Integer.valueOf(e, 16));
    }
}
