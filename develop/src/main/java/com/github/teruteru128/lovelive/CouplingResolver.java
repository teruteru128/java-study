package com.github.teruteru128.lovelive;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Set.*;

/**
 * CouplingResolver
 */
public class CouplingResolver {

    private static final Map<String, Set<String>> COUPLINGS;
    static {
        Map<String, Set<String>> map = new HashMap<>();
        var aiRina = of("宮下愛", "天王寺璃奈");
        map.put("あいりな", aiRina);
        map.put("りなあい", aiRina);
        map.put("かなしず", of("近江彼方", "桜坂しずく"));
        map.put("かりあい", of("朝香果林", "宮下愛"));
        map.put("しずかす", of("桜坂しずく", "中須かすみ"));
        map.put("せつかり", of("朝香果林", "優木せつ菜"));
        map.put("しおぽむ", of("三船栞子", "上原歩夢"));
        map.put("ゆうぽむ", of("高咲侑", "上原歩夢"));
        map.put("ゆうミア", of("高咲侑", "ミア・テイラー"));
        map.put("ゆうせつ", of("高咲侑", "優木せつ菜"));
        map.put("ゆうかな", of("高咲侑", "近江彼方"));
        map.put("ゆうしず", of("高咲侑", "桜坂しずく"));
        map.put("ランしお", of("鐘嵐珠", "三船栞子"));
        COUPLINGS = Collections.unmodifiableMap(map);
    }

    public static Set<String> resolve(String couplingName) {
        if (COUPLINGS.containsKey(couplingName)) {
            return COUPLINGS.get(couplingName);
        } else {
            return of();
        }
    }

    public static Set<String> resolve(Collection<String> couplings) {
        var tags = new TreeSet<String>();
        for (var couplingName : couplings) {
            if (COUPLINGS.containsKey(couplingName)) {
                tags.addAll(COUPLINGS.get(couplingName));
            } else {
                // FIXME Should I throw an Exception?
                System.err.printf("Not Fount: %s%n", couplingName);
            }
        }
        return tags;
    }
}
