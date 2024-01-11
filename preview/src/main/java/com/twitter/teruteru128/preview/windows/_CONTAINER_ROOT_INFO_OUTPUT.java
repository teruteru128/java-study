// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CONTAINER_ROOT_INFO_OUTPUT {
 *     WORD ContainerRootIdLength;
 *     BYTE ContainerRootId[1];
 * };
 * }
 */
public class _CONTAINER_ROOT_INFO_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2735.const$4;
    }
    public static VarHandle ContainerRootIdLength$VH() {
        return constants$2735.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ContainerRootIdLength;
     * }
     */
    public static short ContainerRootIdLength$get(MemorySegment seg) {
        return (short)constants$2735.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ContainerRootIdLength;
     * }
     */
    public static void ContainerRootIdLength$set(MemorySegment seg, short x) {
        constants$2735.const$5.set(seg, x);
    }
    public static short ContainerRootIdLength$get(MemorySegment seg, long index) {
        return (short)constants$2735.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ContainerRootIdLength$set(MemorySegment seg, long index, short x) {
        constants$2735.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContainerRootId$slice(MemorySegment seg) {
        return seg.asSlice(2, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

