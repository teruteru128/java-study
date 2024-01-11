// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_IO_ATTRIBUTION_STATS {
 *     ULONG_PTR IoCount;
 *     ULONGLONG TotalNonOverlappedQueueTime;
 *     ULONGLONG TotalNonOverlappedServiceTime;
 *     ULONGLONG TotalSize;
 * };
 * }
 */
public class _JOBOBJECT_IO_ATTRIBUTION_STATS {

    public static MemoryLayout $LAYOUT() {
        return constants$225.const$4;
    }
    public static VarHandle IoCount$VH() {
        return constants$225.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR IoCount;
     * }
     */
    public static long IoCount$get(MemorySegment seg) {
        return (long)constants$225.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR IoCount;
     * }
     */
    public static void IoCount$set(MemorySegment seg, long x) {
        constants$225.const$5.set(seg, x);
    }
    public static long IoCount$get(MemorySegment seg, long index) {
        return (long)constants$225.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void IoCount$set(MemorySegment seg, long index, long x) {
        constants$225.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalNonOverlappedQueueTime$VH() {
        return constants$226.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedQueueTime;
     * }
     */
    public static long TotalNonOverlappedQueueTime$get(MemorySegment seg) {
        return (long)constants$226.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedQueueTime;
     * }
     */
    public static void TotalNonOverlappedQueueTime$set(MemorySegment seg, long x) {
        constants$226.const$0.set(seg, x);
    }
    public static long TotalNonOverlappedQueueTime$get(MemorySegment seg, long index) {
        return (long)constants$226.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNonOverlappedQueueTime$set(MemorySegment seg, long index, long x) {
        constants$226.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalNonOverlappedServiceTime$VH() {
        return constants$226.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedServiceTime;
     * }
     */
    public static long TotalNonOverlappedServiceTime$get(MemorySegment seg) {
        return (long)constants$226.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedServiceTime;
     * }
     */
    public static void TotalNonOverlappedServiceTime$set(MemorySegment seg, long x) {
        constants$226.const$1.set(seg, x);
    }
    public static long TotalNonOverlappedServiceTime$get(MemorySegment seg, long index) {
        return (long)constants$226.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNonOverlappedServiceTime$set(MemorySegment seg, long index, long x) {
        constants$226.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalSize$VH() {
        return constants$226.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalSize;
     * }
     */
    public static long TotalSize$get(MemorySegment seg) {
        return (long)constants$226.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalSize;
     * }
     */
    public static void TotalSize$set(MemorySegment seg, long x) {
        constants$226.const$2.set(seg, x);
    }
    public static long TotalSize$get(MemorySegment seg, long index) {
        return (long)constants$226.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalSize$set(MemorySegment seg, long index, long x) {
        constants$226.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

