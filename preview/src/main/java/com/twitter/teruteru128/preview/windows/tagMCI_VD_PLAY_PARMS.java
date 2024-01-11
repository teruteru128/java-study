// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_VD_PLAY_PARMS {
 *     DWORD_PTR dwCallback;
 *     DWORD dwFrom;
 *     DWORD dwTo;
 *     DWORD dwSpeed;
 * };
 * }
 */
public class tagMCI_VD_PLAY_PARMS {

    public static MemoryLayout $LAYOUT() {
        return constants$1569.const$0;
    }
    public static VarHandle dwCallback$VH() {
        return constants$1569.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)constants$1569.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        constants$1569.const$1.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)constants$1569.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        constants$1569.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFrom$VH() {
        return constants$1569.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFrom;
     * }
     */
    public static int dwFrom$get(MemorySegment seg) {
        return (int)constants$1569.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFrom;
     * }
     */
    public static void dwFrom$set(MemorySegment seg, int x) {
        constants$1569.const$2.set(seg, x);
    }
    public static int dwFrom$get(MemorySegment seg, long index) {
        return (int)constants$1569.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFrom$set(MemorySegment seg, long index, int x) {
        constants$1569.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwTo$VH() {
        return constants$1569.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwTo;
     * }
     */
    public static int dwTo$get(MemorySegment seg) {
        return (int)constants$1569.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwTo;
     * }
     */
    public static void dwTo$set(MemorySegment seg, int x) {
        constants$1569.const$3.set(seg, x);
    }
    public static int dwTo$get(MemorySegment seg, long index) {
        return (int)constants$1569.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTo$set(MemorySegment seg, long index, int x) {
        constants$1569.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSpeed$VH() {
        return constants$1569.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSpeed;
     * }
     */
    public static int dwSpeed$get(MemorySegment seg) {
        return (int)constants$1569.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSpeed;
     * }
     */
    public static void dwSpeed$set(MemorySegment seg, int x) {
        constants$1569.const$4.set(seg, x);
    }
    public static int dwSpeed$get(MemorySegment seg, long index) {
        return (int)constants$1569.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeed$set(MemorySegment seg, long index, int x) {
        constants$1569.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


