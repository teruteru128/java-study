// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_PROTSEQ_VECTORW {
 *     unsigned int Count;
 *     unsigned short* Protseq[1];
 * };
 * }
 */
public class _RPC_PROTSEQ_VECTORW {

    public static MemoryLayout $LAYOUT() {
        return constants$1713.const$3;
    }
    public static VarHandle Count$VH() {
        return constants$1713.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)constants$1713.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        constants$1713.const$4.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)constants$1713.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        constants$1713.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Protseq$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


