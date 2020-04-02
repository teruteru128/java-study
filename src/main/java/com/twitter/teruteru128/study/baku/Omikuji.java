package com.twitter.teruteru128.study.baku;

import java.security.SecureRandom;

/**
 * Omikuji
 */
public class Omikuji {

    public static void main(String[] args) {
        var random = new SecureRandom();
        String[][] omikuji = { { "大乳", "だいちち", "大きな乳に注意しましょう。" }, { "大胸", "だいきょう", "大胸筋を鍛えましょう。" },
                { "小乳", "しょうちち", "小さな乳を大きくしてあげましょう。" }, { "吸え乳", "すえちち", "近くの乳に吸い付きましょう。" },
                { "中乳", "ちゅうちち", "この程度で満足してはいけません。" } };
        int a = random.nextInt(5);
        System.out.print("あなたの運勢は\u001b[1m");
        System.out.print(omikuji[a][0]);
        System.out.print("\u001b[m(");
        System.out.print(omikuji[a][1]);
        System.out.print(")です。");
        System.out.println();
        System.out.println(omikuji[a][2]);
    }

}
