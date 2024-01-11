// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _RTL_RUN_ONCE {
 *     PVOID Ptr;
 * };
 * }
 */
public class _RTL_RUN_ONCE {

    public static MemoryLayout $LAYOUT() {
        return constants$473.const$2;
    }
    public static VarHandle Ptr$VH() {
        return constants$473.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Ptr;
     * }
     */
    public static MemorySegment Ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$473.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Ptr;
     * }
     */
    public static void Ptr$set(MemorySegment seg, MemorySegment x) {
        constants$473.const$3.set(seg, x);
    }
    public static MemorySegment Ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$473.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Ptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$473.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

