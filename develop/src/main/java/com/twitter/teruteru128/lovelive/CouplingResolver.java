package com.twitter.teruteru128.lovelive;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * CouplingResolver
 */
public class CouplingResolver {

    private static final Map<String, Set<String>> COUPLINGS;
    static {
        Map<String, Set<String>> map = new HashMap<>();
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
        COUPLINGS = Collections.unmodifiableMap(map);
    }

    public static Set<String> resolve(Collection<String> couplings) {
        var tags = new TreeSet<String>();
        for (var couplename : couplings) {
            if (COUPLINGS.containsKey(couplename)) {
                tags.addAll(COUPLINGS.get(couplename));
            } else {
                // FIXME Should I throw an Exception?
                System.err.printf("Not Fount: %s%n", couplename);
            }
        }
        return tags;
    }
}
