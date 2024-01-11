// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMIDIINCAPS2A {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     CHAR szPname[32];
 *     DWORD dwSupport;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * };
 * }
 */
public class tagMIDIINCAPS2A {

    public static MemoryLayout $LAYOUT() {
        return constants$1638.const$1;
    }
    public static VarHandle wMid$VH() {
        return constants$1638.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)constants$1638.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        constants$1638.const$2.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)constants$1638.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        constants$1638.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wPid$VH() {
        return constants$1638.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)constants$1638.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        constants$1638.const$3.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)constants$1638.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        constants$1638.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vDriverVersion$VH() {
        return constants$1638.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)constants$1638.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        constants$1638.const$4.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)constants$1638.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        constants$1638.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static VarHandle dwSupport$VH() {
        return constants$1638.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static int dwSupport$get(MemorySegment seg) {
        return (int)constants$1638.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static void dwSupport$set(MemorySegment seg, int x) {
        constants$1638.const$5.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)constants$1638.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        constants$1638.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(44, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(76, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


