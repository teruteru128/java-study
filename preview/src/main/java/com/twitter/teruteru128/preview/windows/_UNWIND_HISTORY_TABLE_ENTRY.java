// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _UNWIND_HISTORY_TABLE_ENTRY {
 *     ULONG_PTR ImageBase;
 *     PRUNTIME_FUNCTION FunctionEntry;
 * };
 * }
 */
public class _UNWIND_HISTORY_TABLE_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$465.const$1;
    }
    public static VarHandle ImageBase$VH() {
        return constants$465.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR ImageBase;
     * }
     */
    public static long ImageBase$get(MemorySegment seg) {
        return (long)constants$465.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR ImageBase;
     * }
     */
    public static void ImageBase$set(MemorySegment seg, long x) {
        constants$465.const$2.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)constants$465.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        constants$465.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FunctionEntry$VH() {
        return constants$465.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PRUNTIME_FUNCTION FunctionEntry;
     * }
     */
    public static MemorySegment FunctionEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$465.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PRUNTIME_FUNCTION FunctionEntry;
     * }
     */
    public static void FunctionEntry$set(MemorySegment seg, MemorySegment x) {
        constants$465.const$3.set(seg, x);
    }
    public static MemorySegment FunctionEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$465.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FunctionEntry$set(MemorySegment seg, long index, MemorySegment x) {
        constants$465.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


