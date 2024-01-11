// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tWAVEFORMATEX {
 *     WORD wFormatTag;
 *     WORD nChannels;
 *     DWORD nSamplesPerSec;
 *     DWORD nAvgBytesPerSec;
 *     WORD nBlockAlign;
 *     WORD wBitsPerSample;
 *     WORD cbSize;
 * };
 * }
 */
public class tWAVEFORMATEX {

    public static MemoryLayout $LAYOUT() {
        return constants$1620.const$4;
    }
    public static VarHandle wFormatTag$VH() {
        return constants$1620.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wFormatTag;
     * }
     */
    public static short wFormatTag$get(MemorySegment seg) {
        return (short)constants$1620.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wFormatTag;
     * }
     */
    public static void wFormatTag$set(MemorySegment seg, short x) {
        constants$1620.const$5.set(seg, x);
    }
    public static short wFormatTag$get(MemorySegment seg, long index) {
        return (short)constants$1620.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wFormatTag$set(MemorySegment seg, long index, short x) {
        constants$1620.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nChannels$VH() {
        return constants$1621.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nChannels;
     * }
     */
    public static short nChannels$get(MemorySegment seg) {
        return (short)constants$1621.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nChannels;
     * }
     */
    public static void nChannels$set(MemorySegment seg, short x) {
        constants$1621.const$0.set(seg, x);
    }
    public static short nChannels$get(MemorySegment seg, long index) {
        return (short)constants$1621.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nChannels$set(MemorySegment seg, long index, short x) {
        constants$1621.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nSamplesPerSec$VH() {
        return constants$1621.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nSamplesPerSec;
     * }
     */
    public static int nSamplesPerSec$get(MemorySegment seg) {
        return (int)constants$1621.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nSamplesPerSec;
     * }
     */
    public static void nSamplesPerSec$set(MemorySegment seg, int x) {
        constants$1621.const$1.set(seg, x);
    }
    public static int nSamplesPerSec$get(MemorySegment seg, long index) {
        return (int)constants$1621.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nSamplesPerSec$set(MemorySegment seg, long index, int x) {
        constants$1621.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nAvgBytesPerSec$VH() {
        return constants$1621.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nAvgBytesPerSec;
     * }
     */
    public static int nAvgBytesPerSec$get(MemorySegment seg) {
        return (int)constants$1621.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nAvgBytesPerSec;
     * }
     */
    public static void nAvgBytesPerSec$set(MemorySegment seg, int x) {
        constants$1621.const$2.set(seg, x);
    }
    public static int nAvgBytesPerSec$get(MemorySegment seg, long index) {
        return (int)constants$1621.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void nAvgBytesPerSec$set(MemorySegment seg, long index, int x) {
        constants$1621.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nBlockAlign$VH() {
        return constants$1621.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nBlockAlign;
     * }
     */
    public static short nBlockAlign$get(MemorySegment seg) {
        return (short)constants$1621.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nBlockAlign;
     * }
     */
    public static void nBlockAlign$set(MemorySegment seg, short x) {
        constants$1621.const$3.set(seg, x);
    }
    public static short nBlockAlign$get(MemorySegment seg, long index) {
        return (short)constants$1621.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nBlockAlign$set(MemorySegment seg, long index, short x) {
        constants$1621.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wBitsPerSample$VH() {
        return constants$1621.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wBitsPerSample;
     * }
     */
    public static short wBitsPerSample$get(MemorySegment seg) {
        return (short)constants$1621.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wBitsPerSample;
     * }
     */
    public static void wBitsPerSample$set(MemorySegment seg, short x) {
        constants$1621.const$4.set(seg, x);
    }
    public static short wBitsPerSample$get(MemorySegment seg, long index) {
        return (short)constants$1621.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wBitsPerSample$set(MemorySegment seg, long index, short x) {
        constants$1621.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbSize$VH() {
        return constants$1621.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD cbSize;
     * }
     */
    public static short cbSize$get(MemorySegment seg) {
        return (short)constants$1621.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, short x) {
        constants$1621.const$5.set(seg, x);
    }
    public static short cbSize$get(MemorySegment seg, long index) {
        return (short)constants$1621.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, short x) {
        constants$1621.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


