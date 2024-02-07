package com.twitter.teruteru128.util;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UUIDUnsignedComparatorTest {

    @Test
    void compare() {
        var comparator = new UUIDUnsignedComparator();
        var o1 = UUID.fromString("00000000-0000-4000-8000-000000000000");
        var o2 = UUID.fromString("7fffffff-ffff-4fff-bfff-ffffffffffff");
        var o3 = UUID.fromString("80000000-0000-4000-8000-000000000000");
        var o4 = UUID.fromString("ffffffff-ffff-4fff-bfff-ffffffffffff");
        assertTrue(comparator.compare(o1, o2) < 0);
        assertTrue(comparator.compare(o1, o3) < 0);
        assertTrue(comparator.compare(o1, o4) < 0);
        assertTrue(comparator.compare(o2, o3) < 0);
        assertTrue(comparator.compare(o2, o4) < 0);
        assertTrue(comparator.compare(o3, o4) < 0);
        assertTrue(o1.compareTo(o2) < 0);
        assertTrue(o1.compareTo(o3) > 0);
        assertTrue(o1.compareTo(o4) > 0);
        assertTrue(o2.compareTo(o3) > 0);
        assertTrue(o2.compareTo(o4) > 0);
        assertTrue(o3.compareTo(o4) < 0);
    }
}
