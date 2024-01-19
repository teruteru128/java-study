// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagNEWTEXTMETRICEXA {
 *     NEWTEXTMETRICA ntmTm;
 *     FONTSIGNATURE ntmFontSig;
 * };
 * }
 */
public class tagNEWTEXTMETRICEXA {

    public static MemoryLayout $LAYOUT() {
        return constants$928.const$3;
    }
    public static MemorySegment ntmTm$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static MemorySegment ntmFontSig$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

