// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_ALLOCATED_RANGE_BUFFER {
 *     LARGE_INTEGER FileOffset;
 *     LARGE_INTEGER Length;
 * };
 * }
 */
public class _FILE_ALLOCATED_RANGE_BUFFER {

    public static MemoryLayout $LAYOUT() {
        return constants$2638.const$1;
    }
    public static MemorySegment FileOffset$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment Length$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


