// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PERF_BIN {
 *     DWORD NumberOfBins;
 *     DWORD TypeOfBin;
 *     BIN_RANGE BinsRanges[1];
 * };
 * }
 */
public class _PERF_BIN {

    public static MemoryLayout $LAYOUT() {
        return constants$2555.const$0;
    }
    public static VarHandle NumberOfBins$VH() {
        return constants$2555.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfBins;
     * }
     */
    public static int NumberOfBins$get(MemorySegment seg) {
        return (int)constants$2555.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfBins;
     * }
     */
    public static void NumberOfBins$set(MemorySegment seg, int x) {
        constants$2555.const$1.set(seg, x);
    }
    public static int NumberOfBins$get(MemorySegment seg, long index) {
        return (int)constants$2555.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBins$set(MemorySegment seg, long index, int x) {
        constants$2555.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TypeOfBin$VH() {
        return constants$2555.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TypeOfBin;
     * }
     */
    public static int TypeOfBin$get(MemorySegment seg) {
        return (int)constants$2555.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TypeOfBin;
     * }
     */
    public static void TypeOfBin$set(MemorySegment seg, int x) {
        constants$2555.const$2.set(seg, x);
    }
    public static int TypeOfBin$get(MemorySegment seg, long index) {
        return (int)constants$2555.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeOfBin$set(MemorySegment seg, long index, int x) {
        constants$2555.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BinsRanges$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


