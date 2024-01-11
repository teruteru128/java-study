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
 *     DWORD RecordLength;
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 * };
 * }
 */
public class USN_RECORD_COMMON_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$2592.const$0;
    }
    public static VarHandle RecordLength$VH() {
        return constants$2592.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RecordLength;
     * }
     */
    public static int RecordLength$get(MemorySegment seg) {
        return (int)constants$2592.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RecordLength;
     * }
     */
    public static void RecordLength$set(MemorySegment seg, int x) {
        constants$2592.const$1.set(seg, x);
    }
    public static int RecordLength$get(MemorySegment seg, long index) {
        return (int)constants$2592.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void RecordLength$set(MemorySegment seg, long index, int x) {
        constants$2592.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MajorVersion$VH() {
        return constants$2592.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)constants$2592.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static void MajorVersion$set(MemorySegment seg, short x) {
        constants$2592.const$2.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2592.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2592.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinorVersion$VH() {
        return constants$2592.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)constants$2592.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static void MinorVersion$set(MemorySegment seg, short x) {
        constants$2592.const$3.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2592.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        constants$2592.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


