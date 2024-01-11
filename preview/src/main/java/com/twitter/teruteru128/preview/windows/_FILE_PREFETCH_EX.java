// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_PREFETCH_EX {
 *     DWORD Type;
 *     DWORD Count;
 *     PVOID Context;
 *     DWORDLONG Prefetch[1];
 * };
 * }
 */
public class _FILE_PREFETCH_EX {

    public static MemoryLayout $LAYOUT() {
        return constants$2602.const$4;
    }
    public static VarHandle Type$VH() {
        return constants$2602.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$2602.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$2602.const$5.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$2602.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$2602.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Count$VH() {
        return constants$2603.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)constants$2603.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        constants$2603.const$0.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)constants$2603.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        constants$2603.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Context$VH() {
        return constants$2603.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Context;
     * }
     */
    public static MemorySegment Context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2603.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Context;
     * }
     */
    public static void Context$set(MemorySegment seg, MemorySegment x) {
        constants$2603.const$1.set(seg, x);
    }
    public static MemorySegment Context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2603.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Context$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2603.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Prefetch$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


