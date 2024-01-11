// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORDLONG StartFileReferenceNumber;
 *     USN LowUsn;
 *     USN HighUsn;
 *     WORD MinMajorVersion;
 *     WORD MaxMajorVersion;
 * };
 * }
 */
public class MFT_ENUM_DATA_V1 {

    public static MemoryLayout $LAYOUT() {
        return constants$2582.const$1;
    }
    public static VarHandle StartFileReferenceNumber$VH() {
        return constants$2582.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG StartFileReferenceNumber;
     * }
     */
    public static long StartFileReferenceNumber$get(MemorySegment seg) {
        return (long)constants$2582.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG StartFileReferenceNumber;
     * }
     */
    public static void StartFileReferenceNumber$set(MemorySegment seg, long x) {
        constants$2582.const$2.set(seg, x);
    }
    public static long StartFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)constants$2582.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void StartFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        constants$2582.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LowUsn$VH() {
        return constants$2582.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN LowUsn;
     * }
     */
    public static long LowUsn$get(MemorySegment seg) {
        return (long)constants$2582.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN LowUsn;
     * }
     */
    public static void LowUsn$set(MemorySegment seg, long x) {
        constants$2582.const$3.set(seg, x);
    }
    public static long LowUsn$get(MemorySegment seg, long index) {
        return (long)constants$2582.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void LowUsn$set(MemorySegment seg, long index, long x) {
        constants$2582.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle HighUsn$VH() {
        return constants$2582.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN HighUsn;
     * }
     */
    public static long HighUsn$get(MemorySegment seg) {
        return (long)constants$2582.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN HighUsn;
     * }
     */
    public static void HighUsn$set(MemorySegment seg, long x) {
        constants$2582.const$4.set(seg, x);
    }
    public static long HighUsn$get(MemorySegment seg, long index) {
        return (long)constants$2582.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void HighUsn$set(MemorySegment seg, long index, long x) {
        constants$2582.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinMajorVersion$VH() {
        return constants$2582.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)constants$2582.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static void MinMajorVersion$set(MemorySegment seg, short x) {
        constants$2582.const$5.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2582.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2582.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxMajorVersion$VH() {
        return constants$2583.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)constants$2583.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static void MaxMajorVersion$set(MemorySegment seg, short x) {
        constants$2583.const$0.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2583.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2583.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


