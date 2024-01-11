// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _COMM_FAULT_OFFSETS {
 *     short CommOffset;
 *     short FaultOffset;
 * };
 * }
 */
public class _COMM_FAULT_OFFSETS {

    public static MemoryLayout $LAYOUT() {
        return constants$2283.const$1;
    }
    public static VarHandle CommOffset$VH() {
        return constants$2283.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short CommOffset;
     * }
     */
    public static short CommOffset$get(MemorySegment seg) {
        return (short)constants$2283.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short CommOffset;
     * }
     */
    public static void CommOffset$set(MemorySegment seg, short x) {
        constants$2283.const$2.set(seg, x);
    }
    public static short CommOffset$get(MemorySegment seg, long index) {
        return (short)constants$2283.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void CommOffset$set(MemorySegment seg, long index, short x) {
        constants$2283.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FaultOffset$VH() {
        return constants$2283.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short FaultOffset;
     * }
     */
    public static short FaultOffset$get(MemorySegment seg) {
        return (short)constants$2283.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short FaultOffset;
     * }
     */
    public static void FaultOffset$set(MemorySegment seg, short x) {
        constants$2283.const$3.set(seg, x);
    }
    public static short FaultOffset$get(MemorySegment seg, long index) {
        return (short)constants$2283.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FaultOffset$set(MemorySegment seg, long index, short x) {
        constants$2283.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

