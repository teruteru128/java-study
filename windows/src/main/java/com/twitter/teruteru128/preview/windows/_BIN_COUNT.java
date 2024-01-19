// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BIN_COUNT {
 *     BIN_RANGE BinRange;
 *     DWORD BinCount;
 * };
 * }
 */
public class _BIN_COUNT {

    public static MemoryLayout $LAYOUT() {
        return constants$2555.const$3;
    }
    public static MemorySegment BinRange$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle BinCount$VH() {
        return constants$2555.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BinCount;
     * }
     */
    public static int BinCount$get(MemorySegment seg) {
        return (int)constants$2555.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BinCount;
     * }
     */
    public static void BinCount$set(MemorySegment seg, int x) {
        constants$2555.const$4.set(seg, x);
    }
    public static int BinCount$get(MemorySegment seg, long index) {
        return (int)constants$2555.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void BinCount$set(MemorySegment seg, long index, int x) {
        constants$2555.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

