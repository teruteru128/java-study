// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMEASUREITEMSTRUCT {
 *     UINT CtlType;
 *     UINT CtlID;
 *     UINT itemID;
 *     UINT itemWidth;
 *     UINT itemHeight;
 *     ULONG_PTR itemData;
 * };
 * }
 */
public class tagMEASUREITEMSTRUCT {

    public static MemoryLayout $LAYOUT() {
        return constants$1179.const$2;
    }
    public static VarHandle CtlType$VH() {
        return constants$1179.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static int CtlType$get(MemorySegment seg) {
        return (int)constants$1179.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static void CtlType$set(MemorySegment seg, int x) {
        constants$1179.const$3.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)constants$1179.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        constants$1179.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CtlID$VH() {
        return constants$1179.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static int CtlID$get(MemorySegment seg) {
        return (int)constants$1179.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static void CtlID$set(MemorySegment seg, int x) {
        constants$1179.const$4.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)constants$1179.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        constants$1179.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemID$VH() {
        return constants$1179.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static int itemID$get(MemorySegment seg) {
        return (int)constants$1179.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static void itemID$set(MemorySegment seg, int x) {
        constants$1179.const$5.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)constants$1179.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        constants$1179.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemWidth$VH() {
        return constants$1180.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemWidth;
     * }
     */
    public static int itemWidth$get(MemorySegment seg) {
        return (int)constants$1180.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemWidth;
     * }
     */
    public static void itemWidth$set(MemorySegment seg, int x) {
        constants$1180.const$0.set(seg, x);
    }
    public static int itemWidth$get(MemorySegment seg, long index) {
        return (int)constants$1180.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void itemWidth$set(MemorySegment seg, long index, int x) {
        constants$1180.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemHeight$VH() {
        return constants$1180.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemHeight;
     * }
     */
    public static int itemHeight$get(MemorySegment seg) {
        return (int)constants$1180.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemHeight;
     * }
     */
    public static void itemHeight$set(MemorySegment seg, int x) {
        constants$1180.const$1.set(seg, x);
    }
    public static int itemHeight$get(MemorySegment seg, long index) {
        return (int)constants$1180.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void itemHeight$set(MemorySegment seg, long index, int x) {
        constants$1180.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemData$VH() {
        return constants$1180.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static long itemData$get(MemorySegment seg) {
        return (long)constants$1180.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static void itemData$set(MemorySegment seg, long x) {
        constants$1180.const$2.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)constants$1180.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        constants$1180.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


