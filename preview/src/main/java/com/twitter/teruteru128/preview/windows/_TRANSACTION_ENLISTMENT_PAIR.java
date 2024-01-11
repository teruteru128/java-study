// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_ENLISTMENT_PAIR {
 *     GUID EnlistmentId;
 *     GUID ResourceManagerId;
 * };
 * }
 */
public class _TRANSACTION_ENLISTMENT_PAIR {

    public static MemoryLayout $LAYOUT() {
        return constants$529.const$0;
    }
    public static MemorySegment EnlistmentId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment ResourceManagerId$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


