// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagWAVEINCAPSW {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     WCHAR szPname[32];
 *     DWORD dwFormats;
 *     WORD wChannels;
 *     WORD wReserved1;
 * };
 * }
 */
public class tagWAVEINCAPSW {

    public static MemoryLayout $LAYOUT() {
        return constants$1615.const$5;
    }
    public static VarHandle wMid$VH() {
        return constants$1616.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)constants$1616.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        constants$1616.const$0.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)constants$1616.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        constants$1616.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wPid$VH() {
        return constants$1616.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)constants$1616.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        constants$1616.const$1.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)constants$1616.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        constants$1616.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vDriverVersion$VH() {
        return constants$1616.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)constants$1616.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        constants$1616.const$2.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)constants$1616.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        constants$1616.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static VarHandle dwFormats$VH() {
        return constants$1616.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static int dwFormats$get(MemorySegment seg) {
        return (int)constants$1616.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static void dwFormats$set(MemorySegment seg, int x) {
        constants$1616.const$3.set(seg, x);
    }
    public static int dwFormats$get(MemorySegment seg, long index) {
        return (int)constants$1616.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFormats$set(MemorySegment seg, long index, int x) {
        constants$1616.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wChannels$VH() {
        return constants$1616.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static short wChannels$get(MemorySegment seg) {
        return (short)constants$1616.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static void wChannels$set(MemorySegment seg, short x) {
        constants$1616.const$4.set(seg, x);
    }
    public static short wChannels$get(MemorySegment seg, long index) {
        return (short)constants$1616.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannels$set(MemorySegment seg, long index, short x) {
        constants$1616.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wReserved1$VH() {
        return constants$1616.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static short wReserved1$get(MemorySegment seg) {
        return (short)constants$1616.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static void wReserved1$set(MemorySegment seg, short x) {
        constants$1616.const$5.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)constants$1616.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        constants$1616.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


