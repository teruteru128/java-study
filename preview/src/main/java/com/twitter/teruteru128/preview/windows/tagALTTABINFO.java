// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagALTTABINFO {
 *     DWORD cbSize;
 *     int cItems;
 *     int cColumns;
 *     int cRows;
 *     int iColFocus;
 *     int iRowFocus;
 *     int cxItem;
 *     int cyItem;
 *     POINT ptStart;
 * };
 * }
 */
public class tagALTTABINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1382.const$3;
    }
    public static VarHandle cbSize$VH() {
        return constants$1382.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1382.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1382.const$4.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1382.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1382.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cItems$VH() {
        return constants$1382.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cItems;
     * }
     */
    public static int cItems$get(MemorySegment seg) {
        return (int)constants$1382.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cItems;
     * }
     */
    public static void cItems$set(MemorySegment seg, int x) {
        constants$1382.const$5.set(seg, x);
    }
    public static int cItems$get(MemorySegment seg, long index) {
        return (int)constants$1382.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cItems$set(MemorySegment seg, long index, int x) {
        constants$1382.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cColumns$VH() {
        return constants$1383.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cColumns;
     * }
     */
    public static int cColumns$get(MemorySegment seg) {
        return (int)constants$1383.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cColumns;
     * }
     */
    public static void cColumns$set(MemorySegment seg, int x) {
        constants$1383.const$0.set(seg, x);
    }
    public static int cColumns$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cColumns$set(MemorySegment seg, long index, int x) {
        constants$1383.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cRows$VH() {
        return constants$1383.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cRows;
     * }
     */
    public static int cRows$get(MemorySegment seg) {
        return (int)constants$1383.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cRows;
     * }
     */
    public static void cRows$set(MemorySegment seg, int x) {
        constants$1383.const$1.set(seg, x);
    }
    public static int cRows$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cRows$set(MemorySegment seg, long index, int x) {
        constants$1383.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iColFocus$VH() {
        return constants$1383.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iColFocus;
     * }
     */
    public static int iColFocus$get(MemorySegment seg) {
        return (int)constants$1383.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iColFocus;
     * }
     */
    public static void iColFocus$set(MemorySegment seg, int x) {
        constants$1383.const$2.set(seg, x);
    }
    public static int iColFocus$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void iColFocus$set(MemorySegment seg, long index, int x) {
        constants$1383.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iRowFocus$VH() {
        return constants$1383.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iRowFocus;
     * }
     */
    public static int iRowFocus$get(MemorySegment seg) {
        return (int)constants$1383.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iRowFocus;
     * }
     */
    public static void iRowFocus$set(MemorySegment seg, int x) {
        constants$1383.const$3.set(seg, x);
    }
    public static int iRowFocus$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void iRowFocus$set(MemorySegment seg, long index, int x) {
        constants$1383.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cxItem$VH() {
        return constants$1383.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cxItem;
     * }
     */
    public static int cxItem$get(MemorySegment seg) {
        return (int)constants$1383.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cxItem;
     * }
     */
    public static void cxItem$set(MemorySegment seg, int x) {
        constants$1383.const$4.set(seg, x);
    }
    public static int cxItem$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cxItem$set(MemorySegment seg, long index, int x) {
        constants$1383.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cyItem$VH() {
        return constants$1383.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cyItem;
     * }
     */
    public static int cyItem$get(MemorySegment seg) {
        return (int)constants$1383.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cyItem;
     * }
     */
    public static void cyItem$set(MemorySegment seg, int x) {
        constants$1383.const$5.set(seg, x);
    }
    public static int cyItem$get(MemorySegment seg, long index) {
        return (int)constants$1383.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cyItem$set(MemorySegment seg, long index, int x) {
        constants$1383.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptStart$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


