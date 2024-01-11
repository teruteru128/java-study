// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _SE_SID {
 *     SID Sid;
 *     BYTE Buffer[68];
 * };
 * }
 */
public class _SE_SID {

    public static MemoryLayout $LAYOUT() {
        return constants$141.const$1;
    }
    public static MemorySegment Sid$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment Buffer$slice(MemorySegment seg) {
        return seg.asSlice(0, 68);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

