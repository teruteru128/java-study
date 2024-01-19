// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHQUERYRBINFO {
 *     DWORD cbSize;
 *     long long i64Size;
 *     long long i64NumItems;
 * };
 * }
 */
public class _SHQUERYRBINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1872.const$0;
    }
    public static VarHandle cbSize$VH() {
        return constants$1872.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1872.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1872.const$1.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1872.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1872.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle i64Size$VH() {
        return constants$1872.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long i64Size;
     * }
     */
    public static long i64Size$get(MemorySegment seg) {
        return (long)constants$1872.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long i64Size;
     * }
     */
    public static void i64Size$set(MemorySegment seg, long x) {
        constants$1872.const$2.set(seg, x);
    }
    public static long i64Size$get(MemorySegment seg, long index) {
        return (long)constants$1872.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void i64Size$set(MemorySegment seg, long index, long x) {
        constants$1872.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle i64NumItems$VH() {
        return constants$1872.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long i64NumItems;
     * }
     */
    public static long i64NumItems$get(MemorySegment seg) {
        return (long)constants$1872.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long i64NumItems;
     * }
     */
    public static void i64NumItems$set(MemorySegment seg, long x) {
        constants$1872.const$3.set(seg, x);
    }
    public static long i64NumItems$get(MemorySegment seg, long index) {
        return (long)constants$1872.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void i64NumItems$set(MemorySegment seg, long index, long x) {
        constants$1872.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

