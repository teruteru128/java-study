// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagTLIBATTR {
 *     GUID guid;
 *     LCID lcid;
 *     SYSKIND syskind;
 *     WORD wMajorVerNum;
 *     WORD wMinorVerNum;
 *     WORD wLibFlags;
 * };
 * }
 */
public class tagTLIBATTR {

    public static MemoryLayout $LAYOUT() {
        return constants$3520.const$1;
    }
    public static MemorySegment guid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle lcid$VH() {
        return constants$3520.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LCID lcid;
     * }
     */
    public static int lcid$get(MemorySegment seg) {
        return (int)constants$3520.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LCID lcid;
     * }
     */
    public static void lcid$set(MemorySegment seg, int x) {
        constants$3520.const$2.set(seg, x);
    }
    public static int lcid$get(MemorySegment seg, long index) {
        return (int)constants$3520.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lcid$set(MemorySegment seg, long index, int x) {
        constants$3520.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle syskind$VH() {
        return constants$3520.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSKIND syskind;
     * }
     */
    public static int syskind$get(MemorySegment seg) {
        return (int)constants$3520.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSKIND syskind;
     * }
     */
    public static void syskind$set(MemorySegment seg, int x) {
        constants$3520.const$3.set(seg, x);
    }
    public static int syskind$get(MemorySegment seg, long index) {
        return (int)constants$3520.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void syskind$set(MemorySegment seg, long index, int x) {
        constants$3520.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wMajorVerNum$VH() {
        return constants$3520.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMajorVerNum;
     * }
     */
    public static short wMajorVerNum$get(MemorySegment seg) {
        return (short)constants$3520.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMajorVerNum;
     * }
     */
    public static void wMajorVerNum$set(MemorySegment seg, short x) {
        constants$3520.const$4.set(seg, x);
    }
    public static short wMajorVerNum$get(MemorySegment seg, long index) {
        return (short)constants$3520.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wMajorVerNum$set(MemorySegment seg, long index, short x) {
        constants$3520.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wMinorVerNum$VH() {
        return constants$3520.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMinorVerNum;
     * }
     */
    public static short wMinorVerNum$get(MemorySegment seg) {
        return (short)constants$3520.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMinorVerNum;
     * }
     */
    public static void wMinorVerNum$set(MemorySegment seg, short x) {
        constants$3520.const$5.set(seg, x);
    }
    public static short wMinorVerNum$get(MemorySegment seg, long index) {
        return (short)constants$3520.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wMinorVerNum$set(MemorySegment seg, long index, short x) {
        constants$3520.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wLibFlags$VH() {
        return constants$3521.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wLibFlags;
     * }
     */
    public static short wLibFlags$get(MemorySegment seg) {
        return (short)constants$3521.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wLibFlags;
     * }
     */
    public static void wLibFlags$set(MemorySegment seg, short x) {
        constants$3521.const$0.set(seg, x);
    }
    public static short wLibFlags$get(MemorySegment seg, long index) {
        return (short)constants$3521.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wLibFlags$set(MemorySegment seg, long index, short x) {
        constants$3521.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

