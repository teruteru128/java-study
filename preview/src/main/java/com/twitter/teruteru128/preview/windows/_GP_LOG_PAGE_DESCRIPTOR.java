// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GP_LOG_PAGE_DESCRIPTOR {
 *     WORD LogAddress;
 *     WORD LogSectors;
 * };
 * }
 */
public class _GP_LOG_PAGE_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$2483.const$4;
    }
    public static VarHandle LogAddress$VH() {
        return constants$2483.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LogAddress;
     * }
     */
    public static short LogAddress$get(MemorySegment seg) {
        return (short)constants$2483.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LogAddress;
     * }
     */
    public static void LogAddress$set(MemorySegment seg, short x) {
        constants$2483.const$5.set(seg, x);
    }
    public static short LogAddress$get(MemorySegment seg, long index) {
        return (short)constants$2483.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void LogAddress$set(MemorySegment seg, long index, short x) {
        constants$2483.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LogSectors$VH() {
        return constants$2484.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LogSectors;
     * }
     */
    public static short LogSectors$get(MemorySegment seg) {
        return (short)constants$2484.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LogSectors;
     * }
     */
    public static void LogSectors$set(MemorySegment seg, short x) {
        constants$2484.const$0.set(seg, x);
    }
    public static short LogSectors$get(MemorySegment seg, long index) {
        return (short)constants$2484.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void LogSectors$set(MemorySegment seg, long index, short x) {
        constants$2484.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


