// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMETAFILEPICT {
 *     LONG mm;
 *     LONG xExt;
 *     LONG yExt;
 *     HMETAFILE hMF;
 * };
 * }
 */
public class tagMETAFILEPICT {

    public static MemoryLayout $LAYOUT() {
        return constants$908.const$0;
    }
    public static VarHandle mm$VH() {
        return constants$908.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG mm;
     * }
     */
    public static int mm$get(MemorySegment seg) {
        return (int)constants$908.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG mm;
     * }
     */
    public static void mm$set(MemorySegment seg, int x) {
        constants$908.const$1.set(seg, x);
    }
    public static int mm$get(MemorySegment seg, long index) {
        return (int)constants$908.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void mm$set(MemorySegment seg, long index, int x) {
        constants$908.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle xExt$VH() {
        return constants$908.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG xExt;
     * }
     */
    public static int xExt$get(MemorySegment seg) {
        return (int)constants$908.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG xExt;
     * }
     */
    public static void xExt$set(MemorySegment seg, int x) {
        constants$908.const$2.set(seg, x);
    }
    public static int xExt$get(MemorySegment seg, long index) {
        return (int)constants$908.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void xExt$set(MemorySegment seg, long index, int x) {
        constants$908.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle yExt$VH() {
        return constants$908.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG yExt;
     * }
     */
    public static int yExt$get(MemorySegment seg) {
        return (int)constants$908.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG yExt;
     * }
     */
    public static void yExt$set(MemorySegment seg, int x) {
        constants$908.const$3.set(seg, x);
    }
    public static int yExt$get(MemorySegment seg, long index) {
        return (int)constants$908.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void yExt$set(MemorySegment seg, long index, int x) {
        constants$908.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hMF$VH() {
        return constants$908.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMETAFILE hMF;
     * }
     */
    public static MemorySegment hMF$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$908.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMETAFILE hMF;
     * }
     */
    public static void hMF$set(MemorySegment seg, MemorySegment x) {
        constants$908.const$4.set(seg, x);
    }
    public static MemorySegment hMF$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$908.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hMF$set(MemorySegment seg, long index, MemorySegment x) {
        constants$908.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

