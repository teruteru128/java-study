// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SD_QUERY_STATS_OUTPUT {
 *     DWORDLONG SdsStreamSize;
 *     DWORDLONG SdsAllocationSize;
 *     DWORDLONG SiiStreamSize;
 *     DWORDLONG SiiAllocationSize;
 *     DWORDLONG SdhStreamSize;
 *     DWORDLONG SdhAllocationSize;
 *     DWORDLONG NumSDTotal;
 *     DWORDLONG NumSDUnused;
 * };
 * }
 */
public class _SD_QUERY_STATS_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2673.const$0;
    }
    public static VarHandle SdsStreamSize$VH() {
        return constants$2673.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SdsStreamSize;
     * }
     */
    public static long SdsStreamSize$get(MemorySegment seg) {
        return (long)constants$2673.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SdsStreamSize;
     * }
     */
    public static void SdsStreamSize$set(MemorySegment seg, long x) {
        constants$2673.const$1.set(seg, x);
    }
    public static long SdsStreamSize$get(MemorySegment seg, long index) {
        return (long)constants$2673.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SdsStreamSize$set(MemorySegment seg, long index, long x) {
        constants$2673.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SdsAllocationSize$VH() {
        return constants$2673.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SdsAllocationSize;
     * }
     */
    public static long SdsAllocationSize$get(MemorySegment seg) {
        return (long)constants$2673.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SdsAllocationSize;
     * }
     */
    public static void SdsAllocationSize$set(MemorySegment seg, long x) {
        constants$2673.const$2.set(seg, x);
    }
    public static long SdsAllocationSize$get(MemorySegment seg, long index) {
        return (long)constants$2673.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SdsAllocationSize$set(MemorySegment seg, long index, long x) {
        constants$2673.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SiiStreamSize$VH() {
        return constants$2673.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SiiStreamSize;
     * }
     */
    public static long SiiStreamSize$get(MemorySegment seg) {
        return (long)constants$2673.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SiiStreamSize;
     * }
     */
    public static void SiiStreamSize$set(MemorySegment seg, long x) {
        constants$2673.const$3.set(seg, x);
    }
    public static long SiiStreamSize$get(MemorySegment seg, long index) {
        return (long)constants$2673.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SiiStreamSize$set(MemorySegment seg, long index, long x) {
        constants$2673.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SiiAllocationSize$VH() {
        return constants$2673.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SiiAllocationSize;
     * }
     */
    public static long SiiAllocationSize$get(MemorySegment seg) {
        return (long)constants$2673.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SiiAllocationSize;
     * }
     */
    public static void SiiAllocationSize$set(MemorySegment seg, long x) {
        constants$2673.const$4.set(seg, x);
    }
    public static long SiiAllocationSize$get(MemorySegment seg, long index) {
        return (long)constants$2673.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SiiAllocationSize$set(MemorySegment seg, long index, long x) {
        constants$2673.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SdhStreamSize$VH() {
        return constants$2673.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SdhStreamSize;
     * }
     */
    public static long SdhStreamSize$get(MemorySegment seg) {
        return (long)constants$2673.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SdhStreamSize;
     * }
     */
    public static void SdhStreamSize$set(MemorySegment seg, long x) {
        constants$2673.const$5.set(seg, x);
    }
    public static long SdhStreamSize$get(MemorySegment seg, long index) {
        return (long)constants$2673.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SdhStreamSize$set(MemorySegment seg, long index, long x) {
        constants$2673.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SdhAllocationSize$VH() {
        return constants$2674.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SdhAllocationSize;
     * }
     */
    public static long SdhAllocationSize$get(MemorySegment seg) {
        return (long)constants$2674.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SdhAllocationSize;
     * }
     */
    public static void SdhAllocationSize$set(MemorySegment seg, long x) {
        constants$2674.const$0.set(seg, x);
    }
    public static long SdhAllocationSize$get(MemorySegment seg, long index) {
        return (long)constants$2674.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SdhAllocationSize$set(MemorySegment seg, long index, long x) {
        constants$2674.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumSDTotal$VH() {
        return constants$2674.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG NumSDTotal;
     * }
     */
    public static long NumSDTotal$get(MemorySegment seg) {
        return (long)constants$2674.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG NumSDTotal;
     * }
     */
    public static void NumSDTotal$set(MemorySegment seg, long x) {
        constants$2674.const$1.set(seg, x);
    }
    public static long NumSDTotal$get(MemorySegment seg, long index) {
        return (long)constants$2674.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumSDTotal$set(MemorySegment seg, long index, long x) {
        constants$2674.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumSDUnused$VH() {
        return constants$2674.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG NumSDUnused;
     * }
     */
    public static long NumSDUnused$get(MemorySegment seg) {
        return (long)constants$2674.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG NumSDUnused;
     * }
     */
    public static void NumSDUnused$set(MemorySegment seg, long x) {
        constants$2674.const$2.set(seg, x);
    }
    public static long NumSDUnused$get(MemorySegment seg, long index) {
        return (long)constants$2674.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void NumSDUnused$set(MemorySegment seg, long index, long x) {
        constants$2674.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

