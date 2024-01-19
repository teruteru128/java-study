// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagFORMATETC {
 *     CLIPFORMAT cfFormat;
 *     DVTARGETDEVICE* ptd;
 *     DWORD dwAspect;
 *     LONG lindex;
 *     DWORD tymed;
 * };
 * }
 */
public class tagFORMATETC {

    public static MemoryLayout $LAYOUT() {
        return constants$3287.const$5;
    }
    public static VarHandle cfFormat$VH() {
        return constants$3288.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CLIPFORMAT cfFormat;
     * }
     */
    public static short cfFormat$get(MemorySegment seg) {
        return (short)constants$3288.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CLIPFORMAT cfFormat;
     * }
     */
    public static void cfFormat$set(MemorySegment seg, short x) {
        constants$3288.const$0.set(seg, x);
    }
    public static short cfFormat$get(MemorySegment seg, long index) {
        return (short)constants$3288.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cfFormat$set(MemorySegment seg, long index, short x) {
        constants$3288.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ptd$VH() {
        return constants$3288.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DVTARGETDEVICE* ptd;
     * }
     */
    public static MemorySegment ptd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3288.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DVTARGETDEVICE* ptd;
     * }
     */
    public static void ptd$set(MemorySegment seg, MemorySegment x) {
        constants$3288.const$1.set(seg, x);
    }
    public static MemorySegment ptd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3288.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ptd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3288.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwAspect$VH() {
        return constants$3288.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwAspect;
     * }
     */
    public static int dwAspect$get(MemorySegment seg) {
        return (int)constants$3288.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwAspect;
     * }
     */
    public static void dwAspect$set(MemorySegment seg, int x) {
        constants$3288.const$2.set(seg, x);
    }
    public static int dwAspect$get(MemorySegment seg, long index) {
        return (int)constants$3288.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAspect$set(MemorySegment seg, long index, int x) {
        constants$3288.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lindex$VH() {
        return constants$3288.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lindex;
     * }
     */
    public static int lindex$get(MemorySegment seg) {
        return (int)constants$3288.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lindex;
     * }
     */
    public static void lindex$set(MemorySegment seg, int x) {
        constants$3288.const$3.set(seg, x);
    }
    public static int lindex$get(MemorySegment seg, long index) {
        return (int)constants$3288.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lindex$set(MemorySegment seg, long index, int x) {
        constants$3288.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tymed$VH() {
        return constants$3288.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD tymed;
     * }
     */
    public static int tymed$get(MemorySegment seg) {
        return (int)constants$3288.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD tymed;
     * }
     */
    public static void tymed$set(MemorySegment seg, int x) {
        constants$3288.const$4.set(seg, x);
    }
    public static int tymed$get(MemorySegment seg, long index) {
        return (int)constants$3288.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void tymed$set(MemorySegment seg, long index, int x) {
        constants$3288.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

