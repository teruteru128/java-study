// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_LIST_TRANSACTIONS {
 *     DWORDLONG NumberOfTransactions;
 *     DWORDLONG BufferSizeRequired;
 * };
 * }
 */
public class _TXFS_LIST_TRANSACTIONS {

    public static MemoryLayout $LAYOUT() {
        return constants$2658.const$5;
    }
    public static VarHandle NumberOfTransactions$VH() {
        return constants$2659.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG NumberOfTransactions;
     * }
     */
    public static long NumberOfTransactions$get(MemorySegment seg) {
        return (long)constants$2659.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG NumberOfTransactions;
     * }
     */
    public static void NumberOfTransactions$set(MemorySegment seg, long x) {
        constants$2659.const$0.set(seg, x);
    }
    public static long NumberOfTransactions$get(MemorySegment seg, long index) {
        return (long)constants$2659.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfTransactions$set(MemorySegment seg, long index, long x) {
        constants$2659.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BufferSizeRequired$VH() {
        return constants$2659.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BufferSizeRequired;
     * }
     */
    public static long BufferSizeRequired$get(MemorySegment seg) {
        return (long)constants$2659.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BufferSizeRequired;
     * }
     */
    public static void BufferSizeRequired$set(MemorySegment seg, long x) {
        constants$2659.const$1.set(seg, x);
    }
    public static long BufferSizeRequired$get(MemorySegment seg, long index) {
        return (long)constants$2659.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSizeRequired$set(MemorySegment seg, long index, long x) {
        constants$2659.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

