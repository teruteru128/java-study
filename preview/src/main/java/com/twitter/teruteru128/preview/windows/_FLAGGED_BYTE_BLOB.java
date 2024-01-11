// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FLAGGED_BYTE_BLOB {
 *     ULONG fFlags;
 *     ULONG clSize;
 *     byte abData[1];
 * };
 * }
 */
public class _FLAGGED_BYTE_BLOB {

    public static MemoryLayout $LAYOUT() {
        return constants$2342.const$5;
    }
    public static VarHandle fFlags$VH() {
        return constants$2343.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG fFlags;
     * }
     */
    public static int fFlags$get(MemorySegment seg) {
        return (int)constants$2343.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG fFlags;
     * }
     */
    public static void fFlags$set(MemorySegment seg, int x) {
        constants$2343.const$0.set(seg, x);
    }
    public static int fFlags$get(MemorySegment seg, long index) {
        return (int)constants$2343.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void fFlags$set(MemorySegment seg, long index, int x) {
        constants$2343.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle clSize$VH() {
        return constants$2343.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG clSize;
     * }
     */
    public static int clSize$get(MemorySegment seg) {
        return (int)constants$2343.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG clSize;
     * }
     */
    public static void clSize$set(MemorySegment seg, int x) {
        constants$2343.const$1.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)constants$2343.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        constants$2343.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment abData$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


