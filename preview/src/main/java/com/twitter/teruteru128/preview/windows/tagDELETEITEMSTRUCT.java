// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDELETEITEMSTRUCT {
 *     UINT CtlType;
 *     UINT CtlID;
 *     UINT itemID;
 *     HWND hwndItem;
 *     ULONG_PTR itemData;
 * };
 * }
 */
public class tagDELETEITEMSTRUCT {

    public static MemoryLayout $LAYOUT() {
        return constants$1182.const$0;
    }
    public static VarHandle CtlType$VH() {
        return constants$1182.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static int CtlType$get(MemorySegment seg) {
        return (int)constants$1182.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static void CtlType$set(MemorySegment seg, int x) {
        constants$1182.const$1.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)constants$1182.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        constants$1182.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CtlID$VH() {
        return constants$1182.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static int CtlID$get(MemorySegment seg) {
        return (int)constants$1182.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static void CtlID$set(MemorySegment seg, int x) {
        constants$1182.const$2.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)constants$1182.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        constants$1182.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemID$VH() {
        return constants$1182.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static int itemID$get(MemorySegment seg) {
        return (int)constants$1182.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static void itemID$set(MemorySegment seg, int x) {
        constants$1182.const$3.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)constants$1182.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        constants$1182.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndItem$VH() {
        return constants$1182.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndItem;
     * }
     */
    public static MemorySegment hwndItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1182.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndItem;
     * }
     */
    public static void hwndItem$set(MemorySegment seg, MemorySegment x) {
        constants$1182.const$4.set(seg, x);
    }
    public static MemorySegment hwndItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1182.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1182.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle itemData$VH() {
        return constants$1182.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static long itemData$get(MemorySegment seg) {
        return (long)constants$1182.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static void itemData$set(MemorySegment seg, long x) {
        constants$1182.const$5.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)constants$1182.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        constants$1182.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


