// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DISPLAYCONFIG_PATH_INFO {
 *     DISPLAYCONFIG_PATH_SOURCE_INFO sourceInfo;
 *     DISPLAYCONFIG_PATH_TARGET_INFO targetInfo;
 *     UINT32 flags;
 * };
 * }
 */
public class DISPLAYCONFIG_PATH_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$962.const$5;
    }
    public static MemorySegment sourceInfo$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    public static MemorySegment targetInfo$slice(MemorySegment seg) {
        return seg.asSlice(20, 48);
    }
    public static VarHandle flags$VH() {
        return constants$963.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$963.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$963.const$0.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$963.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$963.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


