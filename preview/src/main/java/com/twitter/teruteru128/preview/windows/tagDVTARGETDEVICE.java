// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDVTARGETDEVICE {
 *     DWORD tdSize;
 *     WORD tdDriverNameOffset;
 *     WORD tdDeviceNameOffset;
 *     WORD tdPortNameOffset;
 *     WORD tdExtDevmodeOffset;
 *     BYTE tdData[1];
 * };
 * }
 */
public class tagDVTARGETDEVICE {

    public static MemoryLayout $LAYOUT() {
        return constants$3286.const$5;
    }
    public static VarHandle tdSize$VH() {
        return constants$3287.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD tdSize;
     * }
     */
    public static int tdSize$get(MemorySegment seg) {
        return (int)constants$3287.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD tdSize;
     * }
     */
    public static void tdSize$set(MemorySegment seg, int x) {
        constants$3287.const$0.set(seg, x);
    }
    public static int tdSize$get(MemorySegment seg, long index) {
        return (int)constants$3287.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void tdSize$set(MemorySegment seg, long index, int x) {
        constants$3287.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tdDriverNameOffset$VH() {
        return constants$3287.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdDriverNameOffset;
     * }
     */
    public static short tdDriverNameOffset$get(MemorySegment seg) {
        return (short)constants$3287.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdDriverNameOffset;
     * }
     */
    public static void tdDriverNameOffset$set(MemorySegment seg, short x) {
        constants$3287.const$1.set(seg, x);
    }
    public static short tdDriverNameOffset$get(MemorySegment seg, long index) {
        return (short)constants$3287.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void tdDriverNameOffset$set(MemorySegment seg, long index, short x) {
        constants$3287.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tdDeviceNameOffset$VH() {
        return constants$3287.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdDeviceNameOffset;
     * }
     */
    public static short tdDeviceNameOffset$get(MemorySegment seg) {
        return (short)constants$3287.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdDeviceNameOffset;
     * }
     */
    public static void tdDeviceNameOffset$set(MemorySegment seg, short x) {
        constants$3287.const$2.set(seg, x);
    }
    public static short tdDeviceNameOffset$get(MemorySegment seg, long index) {
        return (short)constants$3287.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void tdDeviceNameOffset$set(MemorySegment seg, long index, short x) {
        constants$3287.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tdPortNameOffset$VH() {
        return constants$3287.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdPortNameOffset;
     * }
     */
    public static short tdPortNameOffset$get(MemorySegment seg) {
        return (short)constants$3287.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdPortNameOffset;
     * }
     */
    public static void tdPortNameOffset$set(MemorySegment seg, short x) {
        constants$3287.const$3.set(seg, x);
    }
    public static short tdPortNameOffset$get(MemorySegment seg, long index) {
        return (short)constants$3287.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void tdPortNameOffset$set(MemorySegment seg, long index, short x) {
        constants$3287.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle tdExtDevmodeOffset$VH() {
        return constants$3287.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdExtDevmodeOffset;
     * }
     */
    public static short tdExtDevmodeOffset$get(MemorySegment seg) {
        return (short)constants$3287.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdExtDevmodeOffset;
     * }
     */
    public static void tdExtDevmodeOffset$set(MemorySegment seg, short x) {
        constants$3287.const$4.set(seg, x);
    }
    public static short tdExtDevmodeOffset$get(MemorySegment seg, long index) {
        return (short)constants$3287.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void tdExtDevmodeOffset$set(MemorySegment seg, long index, short x) {
        constants$3287.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment tdData$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

