// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_BIND_INFORMATION {
 *     HANDLE TmHandle;
 * };
 * }
 */
public class _TRANSACTION_BIND_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$528.const$4;
    }
    public static VarHandle TmHandle$VH() {
        return constants$528.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE TmHandle;
     * }
     */
    public static MemorySegment TmHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$528.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE TmHandle;
     * }
     */
    public static void TmHandle$set(MemorySegment seg, MemorySegment x) {
        constants$528.const$5.set(seg, x);
    }
    public static MemorySegment TmHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$528.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TmHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$528.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


