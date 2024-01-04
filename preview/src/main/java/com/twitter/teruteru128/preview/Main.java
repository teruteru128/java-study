package com.twitter.teruteru128.preview;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public class Main {
    void main() {
        var arena = Arena.ofAuto();
        var seg = arena.allocate(200, 8);
        for (long i = 0; i < 200; i += 8) {
            seg.set(ValueLayout.JAVA_LONG, i, i);
        }
    }
}
