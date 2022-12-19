package com.twitter.teruteru128.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.random.RandomGenerator;

/**
 * Main
 * 秘密鍵かな？
 * ioxhJc1lIE2m+WFdBg3ieQb6rk8sSvg3wRv/ImJz2tc=
 * cm2E2vmE0Nd8aVP/4Ph2S1R6C5bkC1H7CiUBzbcDG3U=
 * BixgbLYk35GP+XHYdK/DgSWIUXyCTwCwEtY4h/G22dw=
 * BH4RDmdo0Yq0Ftiw0lm9ej5BmpZ35kEw2kaWZlZ0Do8=
 * lMhxDh6RPpWOsnJMeS12pTJ/j7EPn+ugpdbNQCGbiwc=
 * 9hZn+KDlwjgrbyFpaX5ibuaO4QfaFbIL79NUrwJlcRQ=
 * T+tDF4I700WFkFhGieYxWgQKPO/MDcntDYzMrqQSZjzwV2DzaI1OM/CsJWE30WBqMI1SxbEQHufR1A76I7ayWN==
 * nySkaCQxGErccmiqLznSQduXgFICpjnl2bo7n3FAhQMlku79plIeL85/etpN865GAnlUpErSppEYHvn4couGh3==
 * ns2bQQ4zlnfcCTSAxEH3gDDYHcBswKw92jQeEgm+9tse74XdX+LNwgfw7OsMUjOGtLMb7R/kXNRXYv1AHi71iV==
 * NxhJ5JwWhUtUccCfJNtVqzdpCMGOaAtknmcEKLyglZFNXE66EiFi9wPFekwekx3ln8m9v5wnfv7V8jSrpZ/SHQ==
 * +3n5qDbtpicXBy+Yyol/TJkg2IoQ01vZ/U2SvgpP+Fdm4DrIYngY7X0ZS53rc/KKIHT//jVqNwNBz1sGFyYUDg==
 * cLtHGFI7X/Xl6Ly03DczMzl2bsHJmI2BMQKKCckUek5vTIiltDPfT3PxdT6zxW1LzwVqJIsQEkxxPNTswgpSFg==
 * pMQBNF+F12AXT3T0mQq7S0l1VcCr/Dw2Q54zeuHH0/1ExLgbhHEsmAHf3WR9nK/Ku1Mc/eU3vaAO78yplJB76A==
 * QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQQ==
 * D8BH6DLNJekZ5jiiIVSnyS5ziE9XJSRG5bA9OdiFdjee6HTxHxFQXyEQdhfN+E69RKToLYXGDxK2X9v9eEcbUxdSp9tbptXegxkNQgIxg97BAq9gtmxPm4Ebngl/Q/I4
 * cLJlMSoCYBgR0d/bg7zG1B77BBWy7f1KLiJG5b8mPmlD8dAJKCZSEFRdWLuxSyRjgFFeiMm4+l+2SNIhL/SBma7ABhg232DeJkbUcZJKqBfAI9taPQ5Y9bwIXrcjxqMx
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        HashMap<String, Set<String>> map = new HashMap<>();
        var airina = Set.of("宮下愛", "天王寺璃奈");
        map.put("あいりな", airina);
        map.put("りなあい", airina);
        map.put("かなしず", Set.of("近江彼方", "桜坂しずく"));
        map.put("かりあい", Set.of("朝香果林", "宮下愛"));
        map.put("しずかす", Set.of("桜坂しずく", "中須かすみ"));
        map.put("せつかり", Set.of("朝香果林", "優木せつ菜"));
        map.put("しおぽむ", Set.of("三船栞子", "上原歩夢"));
        map.put("ゆうぽむ", Set.of("高咲侑", "上原歩夢"));
        map.put("ゆうミア", Set.of("高咲侑", "ミア・テイラー"));
        map.put("ゆうせつ", Set.of("高咲侑", "優木せつ菜"));
        map.put("ゆうかな", Set.of("高咲侑", "近江彼方"));
        map.put("ゆうしず", Set.of("高咲侑", "桜坂しずく"));
        map.put("ランしお", Set.of("鐘嵐珠", "三船栞子"));
        Set<String> tags = new TreeSet<>();
        for (String couplename : args) {
            if (map.containsKey(couplename)) {
                tags.addAll(map.get(couplename));
            } else {
                System.err.printf("Not Fount: %s%n", couplename);
            }
        }
        StringJoiner joiner = new StringJoiner(" ");
        for (String name : tags) {
            joiner.add(name);
        }
        System.out.println(joiner);
    }
}
