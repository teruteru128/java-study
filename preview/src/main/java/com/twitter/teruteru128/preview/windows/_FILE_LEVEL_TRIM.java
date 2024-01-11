// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_LEVEL_TRIM {
 *     DWORD Key;
 *     DWORD NumRanges;
 *     FILE_LEVEL_TRIM_RANGE Ranges[1];
 * };
 * }
 */
public class _FILE_LEVEL_TRIM {

    public static MemoryLayout $LAYOUT() {
        return constants$2688.const$4;
    }
    public static VarHandle Key$VH() {
        return constants$2688.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Key;
     * }
     */
    public static int Key$get(MemorySegment seg) {
        return (int)constants$2688.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Key;
     * }
     */
    public static void Key$set(MemorySegment seg, int x) {
        constants$2688.const$5.set(seg, x);
    }
    public static int Key$get(MemorySegment seg, long index) {
        return (int)constants$2688.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Key$set(MemorySegment seg, long index, int x) {
        constants$2688.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumRanges$VH() {
        return constants$2689.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumRanges;
     * }
     */
    public static int NumRanges$get(MemorySegment seg) {
        return (int)constants$2689.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumRanges;
     * }
     */
    public static void NumRanges$set(MemorySegment seg, int x) {
        constants$2689.const$0.set(seg, x);
    }
    public static int NumRanges$get(MemorySegment seg, long index) {
        return (int)constants$2689.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void NumRanges$set(MemorySegment seg, long index, int x) {
        constants$2689.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Ranges$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


