package com.twitter.teruteru128.study.array;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.SortedMap;

/**
 * これはディープコピーではなくシャローコピーです
 * @author https://www.sejuku.net/blog/14067#DeepCopy
 */
public class Main {

    public static void main(String[] args) {
        // コピー元のArrayList
        ArrayList<String> src_list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            src_list.add(new String("AAA"));
        }

        // ArrayListのインスタンス生成時にコピー元を引数で渡してコピー(DeepCopy)
        ArrayList<String> dst_list = new ArrayList<>(src_list);

        // 参照先は同じ
        System.out.println(src_list.get(0) == dst_list.get(0));

        // コピー先を変更
        for (int i = 0; i < dst_list.size(); i++) {
            dst_list.set(i, "BBB");
        }

        // コピー元とコピー先を出力表示
        System.out.println(src_list);
        System.out.println(dst_list);
        // 使用可能なキャラセット
        SortedMap<String, Charset> m = Charset.availableCharsets();
            for (Charset c : m.values()) {
            System.out.println(c.name());

            // エイリアス
            for (String alias : c.aliases()) {
                System.out.println(" " + alias);
            }
        }
    }

}
