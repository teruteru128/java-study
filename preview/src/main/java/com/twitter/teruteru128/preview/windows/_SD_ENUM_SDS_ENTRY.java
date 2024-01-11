// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SD_ENUM_SDS_ENTRY {
 *     DWORD Hash;
 *     DWORD SecurityId;
 *     DWORDLONG Offset;
 *     DWORD Length;
 *     BYTE Descriptor[1];
 * };
 * }
 */
public class _SD_ENUM_SDS_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$2675.const$0;
    }
    public static VarHandle Hash$VH() {
        return constants$2675.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Hash;
     * }
     */
    public static int Hash$get(MemorySegment seg) {
        return (int)constants$2675.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Hash;
     * }
     */
    public static void Hash$set(MemorySegment seg, int x) {
        constants$2675.const$1.set(seg, x);
    }
    public static int Hash$get(MemorySegment seg, long index) {
        return (int)constants$2675.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Hash$set(MemorySegment seg, long index, int x) {
        constants$2675.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SecurityId$VH() {
        return constants$2675.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static int SecurityId$get(MemorySegment seg) {
        return (int)constants$2675.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static void SecurityId$set(MemorySegment seg, int x) {
        constants$2675.const$2.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)constants$2675.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        constants$2675.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Offset$VH() {
        return constants$2675.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static long Offset$get(MemorySegment seg) {
        return (long)constants$2675.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static void Offset$set(MemorySegment seg, long x) {
        constants$2675.const$3.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)constants$2675.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        constants$2675.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Length$VH() {
        return constants$2675.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)constants$2675.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        constants$2675.const$4.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)constants$2675.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        constants$2675.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Descriptor$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


