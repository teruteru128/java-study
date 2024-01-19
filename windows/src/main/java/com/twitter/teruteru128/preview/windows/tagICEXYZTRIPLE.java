// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagICEXYZTRIPLE {
 *     CIEXYZ ciexyzRed;
 *     CIEXYZ ciexyzGreen;
 *     CIEXYZ ciexyzBlue;
 * };
 * }
 */
public class tagICEXYZTRIPLE {

    public static MemoryLayout $LAYOUT() {
        return constants$891.const$4;
    }
    public static MemorySegment ciexyzRed$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment ciexyzGreen$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static MemorySegment ciexyzBlue$slice(MemorySegment seg) {
        return seg.asSlice(24, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

