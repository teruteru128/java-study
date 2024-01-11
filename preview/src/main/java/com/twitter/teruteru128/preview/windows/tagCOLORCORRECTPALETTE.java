// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCOLORCORRECTPALETTE {
 *     EMR emr;
 *     DWORD ihPalette;
 *     DWORD nFirstEntry;
 *     DWORD nPalEntries;
 *     DWORD nReserved;
 * };
 * }
 */
public class tagCOLORCORRECTPALETTE {

    public static MemoryLayout $LAYOUT() {
        return constants$1115.const$2;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle ihPalette$VH() {
        return constants$1115.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ihPalette;
     * }
     */
    public static int ihPalette$get(MemorySegment seg) {
        return (int)constants$1115.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ihPalette;
     * }
     */
    public static void ihPalette$set(MemorySegment seg, int x) {
        constants$1115.const$3.set(seg, x);
    }
    public static int ihPalette$get(MemorySegment seg, long index) {
        return (int)constants$1115.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ihPalette$set(MemorySegment seg, long index, int x) {
        constants$1115.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFirstEntry$VH() {
        return constants$1115.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFirstEntry;
     * }
     */
    public static int nFirstEntry$get(MemorySegment seg) {
        return (int)constants$1115.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFirstEntry;
     * }
     */
    public static void nFirstEntry$set(MemorySegment seg, int x) {
        constants$1115.const$4.set(seg, x);
    }
    public static int nFirstEntry$get(MemorySegment seg, long index) {
        return (int)constants$1115.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nFirstEntry$set(MemorySegment seg, long index, int x) {
        constants$1115.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nPalEntries$VH() {
        return constants$1115.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nPalEntries;
     * }
     */
    public static int nPalEntries$get(MemorySegment seg) {
        return (int)constants$1115.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nPalEntries;
     * }
     */
    public static void nPalEntries$set(MemorySegment seg, int x) {
        constants$1115.const$5.set(seg, x);
    }
    public static int nPalEntries$get(MemorySegment seg, long index) {
        return (int)constants$1115.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nPalEntries$set(MemorySegment seg, long index, int x) {
        constants$1115.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nReserved$VH() {
        return constants$1116.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nReserved;
     * }
     */
    public static int nReserved$get(MemorySegment seg) {
        return (int)constants$1116.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nReserved;
     * }
     */
    public static void nReserved$set(MemorySegment seg, int x) {
        constants$1116.const$0.set(seg, x);
    }
    public static int nReserved$get(MemorySegment seg, long index) {
        return (int)constants$1116.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nReserved$set(MemorySegment seg, long index, int x) {
        constants$1116.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


